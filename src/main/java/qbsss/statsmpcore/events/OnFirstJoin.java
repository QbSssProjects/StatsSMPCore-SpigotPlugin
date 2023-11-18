package qbsss.statsmpcore.events;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import qbsss.statsmpcore.statssmpcore.StatsSMPCore;

import static qbsss.statsmpcore.methods.Color.color;

public class OnFirstJoin implements Listener
{
    @EventHandler
    public void onFirstJoinOfPlayer(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        if(!player.hasPlayedBefore())
        {
            PersistentDataContainer data = player.getPersistentDataContainer();
            data.set(new NamespacedKey(StatsSMPCore.getPlugin(), "points"), PersistentDataType.INTEGER, 0);

            player.sendMessage(color("&aWitaj na serwerze!"));
        }
    }

}
