package qbsss.statsmpcore.statssmpcore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

//import org.mariadb.jdbc.Connection;

import qbsss.statsmpcore.commands.AddZycie;
import qbsss.statsmpcore.commands.Menu;
import qbsss.statsmpcore.commands.StoreCommand;
import qbsss.statsmpcore.events.*;


import java.net.InetAddress;
import java.net.UnknownHostException;

public final class StatsSMPCore extends JavaPlugin  {



    private static StatsSMPCore plugin;

    @Override
    public void onEnable()
    {
        plugin = this;

        getCommand("menu").setExecutor( new Menu());

        getCommand("store").setExecutor( new StoreCommand());

        getCommand("addzycie").setExecutor( new AddZycie());

        getServer().getPluginManager().registerEvents(new PlayerKillOtherPlayer(), this);

        getServer().getPluginManager().registerEvents(new OnFirstJoin(), this);

        getServer().getPluginManager().registerEvents(new OnPlayerAddingLife(), this);

        getServer().getPluginManager().registerEvents(new OnInventoryClickRemovingPoints(), this);
        getServer().getPluginManager().registerEvents(new OnInventoryClickAddingPoints(), this);


        System.out.println("[StatsSMPCore]" +  "&a Witaj Swiecie!");
    }




    @Override
    public void onDisable()
    {
        System.out.println("[StatsSMPCore]" + ChatColor.GREEN + " Goodbye!!!");
    }

    public static StatsSMPCore getPlugin() {
        return plugin;
    }

}
