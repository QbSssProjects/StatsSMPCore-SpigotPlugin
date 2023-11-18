package qbsss.statsmpcore.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import qbsss.statsmpcore.methods.Color;

import java.util.ArrayList;

public class Zycie
{
    public static ItemStack getItem()
    {
        ItemStack zycie = new ItemStack(Material.PAPER);
        zycie.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = zycie.getItemMeta();

        meta.setDisplayName(Color.color("&4&lZYCIE"));
        ArrayList<String> lore = new ArrayList();

        lore.add(Color.color("&4To jest jedno zycie"));
        lore.add(Color.color("&7Stanowi ono jeden &3&lPUNKT &r"));
        lore.add(Color.color("&7Punkty mozesz wykorzysatc pod &l/menu &r"));
        lore.add(Color.color("&7Albo mozesz dodac sobie 1 &4&lZYCIE &r &7klikajac PPM"));

        meta.setLore(lore);
        zycie.setItemMeta(meta);
        return zycie;
    }

}
