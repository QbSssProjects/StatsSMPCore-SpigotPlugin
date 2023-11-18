package qbsss.statsmpcore.commands;

import com.google.common.math.Stats;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataHolder;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import qbsss.statsmpcore.statssmpcore.StatsSMPCore;

import static qbsss.statsmpcore.methods.Color.color;

public class StoreCommand implements CommandExecutor
{
    //TEST CLASS
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {

        if (sender instanceof Player)
        {
            Player player = (Player) sender;

            if (args.length == 1 )
            {
                int givenPoints = Integer.parseInt(args[0]);
                System.out.println(givenPoints);


                PersistentDataContainer data = player.getPersistentDataContainer();
                data.set(new NamespacedKey(StatsSMPCore.getPlugin(), "points"), PersistentDataType.INTEGER, givenPoints);
                System.out.println(data.get(new NamespacedKey(StatsSMPCore.getPlugin(), "points"), PersistentDataType.INTEGER));

            }
            else
            {
                player.sendMessage(color("&cPodaj liczbe"));
            }


        }
        return false;
    }
}
