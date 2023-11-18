package qbsss.statsmpcore.commands;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import qbsss.statsmpcore.statssmpcore.StatsSMPCore;
import xyz.xenondevs.invui.gui.Gui;
import xyz.xenondevs.invui.item.builder.ItemBuilder;
import xyz.xenondevs.invui.item.impl.SimpleItem;
import xyz.xenondevs.invui.window.Window;

import static qbsss.statsmpcore.methods.Color.color;

public class Menu implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;
            PersistentDataContainer data = player.getPersistentDataContainer();
            Integer monety = data.get(new NamespacedKey(StatsSMPCore.getPlugin(), "points"), PersistentDataType.INTEGER);

            String monetyStr = monety.toString();

            Gui gui = Gui.normal() // Creates the GuiBuilder for a normal GUI
                    .setStructure(
                            "# # # # # # # # #",
                            "# . . . . . . . #",
                            "# . . . . . . . #",
                            "# # # R M G # # #")
                    .addIngredient('#', new SimpleItem(new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE)))
                    .addIngredient('M', new SimpleItem(new ItemBuilder(Material.SUNFLOWER).setDisplayName(color("&6Posiadane monety: &r&a&l" + monetyStr))))
                    .addIngredient('R', new SimpleItem(new ItemBuilder(Material.RED_STAINED_GLASS_PANE).setDisplayName(color("&cWyciagnij punkty na zycia"))))

                    .addIngredient('G', new SimpleItem(new ItemBuilder(Material.LIME_STAINED_GLASS_PANE).setDisplayName(color("&aDodaj punkty"))))
                    .build();

            if(cmd.getName().equalsIgnoreCase("menu"))
            {

                player.sendMessage("Otwieram");
                Window window = Window.single()
                        .setTitle("InvUI")
                        .setGui(gui)
                        .build(player);

                window.open();
            }


        }
        return true;
    }

}
