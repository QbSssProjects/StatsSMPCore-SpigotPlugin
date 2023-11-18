package qbsss.statsmpcore.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import qbsss.statsmpcore.items.Zycie;

import static qbsss.statsmpcore.methods.Color.color;

public class OnPlayerAddingLife implements Listener
{
    @EventHandler
    public void playerAddLife(PlayerInteractEvent event)
    {
        ItemStack zycie = new ItemStack(Zycie.getItem());


        Player player = event.getPlayer();
        Action action = event.getAction();
        if(event.getItem() != null)
        {
            if((action == Action.RIGHT_CLICK_BLOCK || action == Action.RIGHT_CLICK_AIR) && event.getItem().isSimilar(zycie))
            {
                //player.sendMessage(color("&aDODANO 1 ZYCIE"));
                Bukkit.broadcastMessage(color("&7[&lZYCIA&r&7] &c❤ &r&7Gracz&r&b " + player.getName() +" &r&7dodal &a&l1 ZYCIE &r&7(&c❤ + 1 &r&7)"));
                player.setMaxHealth(player.getMaxHealth() + 2.0);
                player.getInventory().removeItem(zycie);
            }
        }


    }

}
