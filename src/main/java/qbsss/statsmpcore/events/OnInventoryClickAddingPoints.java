package qbsss.statsmpcore.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import qbsss.statsmpcore.methods.Color;
import xyz.xenondevs.invui.gui.Gui;
import xyz.xenondevs.invui.item.builder.ItemBuilder;
import xyz.xenondevs.invui.item.impl.SimpleItem;
import xyz.xenondevs.invui.window.Window;

import java.util.ArrayList;

import static qbsss.statsmpcore.methods.Color.color;

public class OnInventoryClickAddingPoints implements Listener
{
    Integer pointsToAdd;
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event)
    {


        Player player = (Player) event.getWhoClicked();
        try
        {


            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&aDodaj punkty")))
            {
                pointsToAdd = 0;
                Window window = Window.single()
                        .setViewer(player)
                        .setTitle("InvUI")
                        .setGui(gui)
                        .build();

                window.open();
            }
            else if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&a+1")))
            {
                if(pointsToAdd == 0)
                {

                    pointsToAdd = 1;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);
                    ItemStack obecneAdd1From0 = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneAdd1From0.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneAdd1From0.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneAdd1From0);

                }
                else
                {
                    pointsToAdd = pointsToAdd + 1;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneAdd1FromElse = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneAdd1FromElse.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneAdd1FromElse.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneAdd1FromElse);

                }


            }
            else if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&a+10")))
            {
                if(pointsToAdd == 0)
                {


                    pointsToAdd = 10;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneAdd10From0 = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneAdd10From0.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneAdd10From0.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneAdd10From0);



                }
                else
                {


                    pointsToAdd = pointsToAdd + 10;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneAdd10FromElse = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneAdd10FromElse.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneAdd10FromElse.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneAdd10FromElse);

                }


            }
            else if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&a+20")))
            {
                if(pointsToAdd == 0)
                {


                    pointsToAdd = 20;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneAdd20From0 = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneAdd20From0.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneAdd20From0.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneAdd20From0);


                }
                else
                {
                    pointsToAdd = pointsToAdd + 20;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneAdd20FromElse = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneAdd20FromElse.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneAdd20FromElse.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneAdd20FromElse);

                }
            }
            else if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&c-1")))
            {

                if(pointsToAdd > 1)
                {
                    pointsToAdd = pointsToAdd - 1;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneSub1 = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneSub1.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneSub1.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneSub1);
                }
                else
                {
                    pointsToAdd = 0;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneSub1FromBelow = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneSub1FromBelow.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneSub1FromBelow.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneSub1FromBelow);
                }

            }
            else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&c-10")))
            {
                if(pointsToAdd > 10)
                {
                    pointsToAdd = pointsToAdd - 10;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneSub10 = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneSub10.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneSub10.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneSub10);
                }
                else
                {
                    pointsToAdd = 0;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneSub10FromBelow = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneSub10FromBelow.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneSub10FromBelow.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneSub10FromBelow);
                }
            }
            else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&c-20")))
            {
                if(pointsToAdd > 20)
                {
                    pointsToAdd = pointsToAdd - 20;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneSub20 = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneSub20.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneSub20.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneSub20);
                }
                else
                {
                    pointsToAdd = 0;
                    System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                    ItemStack obecneSub20FromBelow = new ItemStack(Material.SUNFLOWER);

                    ItemMeta meta = obecneSub20FromBelow.getItemMeta();

                    meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                    obecneSub20FromBelow.setItemMeta(meta);

                    event.getInventory().setItem(22, obecneSub20FromBelow);
                }
            }
            else if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&cWYJDZ")))
            {
                event.getView().close();
            }
            else if(event.getCurrentItem().getItemMeta().getDisplayName().equals(color("&cWyzeruj")))
            {
                pointsToAdd = 0;
                System.out.println("OBECNA DO DODANIA: " + pointsToAdd);

                ItemStack obecneZeruj = new ItemStack(Material.SUNFLOWER);

                ItemMeta meta = obecneZeruj.getItemMeta();

                meta.setDisplayName(color("&aDodajesz: &l" + pointsToAdd));

                obecneZeruj.setItemMeta(meta);

                event.getInventory().setItem(22, obecneZeruj);
            }
        }
        catch(NullPointerException exception)
        {

        }
    }

        /*TODO: Gui gui = Gui.normal()
            .setStructure(
                    "# # # # H # # # #",
                    "# . . . . . . . #",
                    "# W S 1 B 2 Z + #",
                    "# . . . . . . . #",
                    "# # # R E A # # #")
                    R - RESET ""DO ZERA""
                    A - AKCEPTUJ - WARUNEK TODO2
                    */
    /*TODO: TODO2 AKCEPTUJ WANUNEK: JEŚLI GRACZ POSIADA ODP. ILOŚC PKT / ZYĆ W PAPIERKACH ZAAKCEPTUJ, W PRZECIWNYM RAZIE
       POKAŻ MIGAJĄCE GUI W SCHEMACIE 3 x 0,25sec x 2 intervals
       BARRIERY /  AIR
        -||-      -||-
        -||-      -||-
        NASTEPNIE ZAMKNIJ GUI ORAZ OINFORMUJ O NIE PRAWIDLOWEJ ILOŚC PKT  / ZYC
        */

    Gui gui = Gui.normal()
            .setStructure(
                    "# # # # H # # # #",
                    "# . . . . . . . #",
                    "# W S 1 B 2 Z + #",
                    "# . . . . . . . #",
                    "# # # R E A # # #")
            .addIngredient('#', new SimpleItem(new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setDisplayName(" ")))
            .addIngredient('1', new SimpleItem(new ItemBuilder(Material.RED_WOOL).setDisplayName(color("&c-1"))))
            .addIngredient('W', new SimpleItem(new ItemBuilder(Material.RED_WOOL).addEnchantment(Enchantment.DAMAGE_ALL, 10, true).setDisplayName(color("&c-20"))))
            .addIngredient('S', new SimpleItem(new ItemBuilder(Material.RED_WOOL).setDisplayName(color("&c-10"))))
            .addIngredient('B', new SimpleItem(new ItemBuilder(Material.SUNFLOWER).setDisplayName(color("&aDodajesz: &l0"))))

            .addIngredient('2', new SimpleItem(new ItemBuilder(Material.LIME_WOOL).setDisplayName(color("&a+1"))))
            .addIngredient('Z', new SimpleItem(new ItemBuilder(Material.LIME_WOOL).setDisplayName(color("&a+10"))))
            .addIngredient('+', new SimpleItem(new ItemBuilder(Material.LIME_WOOL).addEnchantment(Enchantment.DAMAGE_ALL, 10, true).setDisplayName(color("&a+20"))))

            .addIngredient('H', new SimpleItem(new ItemBuilder(Material.HOPPER).setDisplayName(color("&7Dodawanie &r&a&lPUNKTOW"))))

            .addIngredient('E', new SimpleItem(new ItemBuilder(Material.BARRIER).setDisplayName(color("&cWYJDZ"))))

            .addIngredient('R', new SimpleItem(new ItemBuilder(Material.RED_CONCRETE).setDisplayName(color("&cWyzeruj"))))
            .addIngredient('A', new SimpleItem(new ItemBuilder(Material.LIME_CONCRETE).setDisplayName(color("&aAkceptuj"))))

            .build();


}
