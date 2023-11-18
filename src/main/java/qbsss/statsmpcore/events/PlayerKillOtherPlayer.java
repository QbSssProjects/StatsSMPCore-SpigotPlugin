package qbsss.statsmpcore.events;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import qbsss.statsmpcore.items.Zycie;

import java.util.Date;

import static qbsss.statsmpcore.methods.Color.color;

public class PlayerKillOtherPlayer implements Listener
{
    ItemStack zycie = new ItemStack(Zycie.getItem());
    @EventHandler
    public void playerKilledOtherPlayer(PlayerDeathEvent event)
    {

        Player killed = event.getEntity();
        Player killer = event.getEntity().getKiller();
        if(killer instanceof Player)
        {
            killer.getInventory().addItem(zycie);

            if(killed.getMaxHealth() <= 2.0)
            {

                Bukkit.broadcastMessage(color("&7[&lSMIERC&r&7] &c☠ &r&b" + killer.getName() + " &r&7(&c❤ + 1 &r&7) " + " &7&l➡ &r&b" + killed.getName() + "&r&7 (&c&lBAN &r&7) "));

                Bukkit.getBanList(BanList.Type.NAME).addBan(killed.getName(),color("&c&lBrak żyć! &r&cWróć za godzinę!"), new Date(System.currentTimeMillis()+60*60*1000), null);

                killed.setMaxHealth(20.0);

                killed.kickPlayer(color("&c&lBrak żyć! &r&cWróć za godzinę!"));


            }
            else
            {
                killed.setMaxHealth(killed.getMaxHealth() - 2.0);

                Bukkit.broadcastMessage(color("&7[&lSMIERC&r&7] &c☠ &r&b" + killer.getName() + " &r&7(&c❤ + 1 &r&7) " + " &7&l➡ &r&b" + killed.getName() + "&r&7 (&c❤ - 1 &r&7) "));

            }
            System.out.println(killed.getMaxHealth());

        }

    }
}
