package qbsss.statsmpcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import qbsss.statsmpcore.items.Zycie;

public class AddZycie implements CommandExecutor
{
    ItemStack zycie = new ItemStack(Zycie.getItem());
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {


        if(command.getName().equalsIgnoreCase("addzycie") )
        {
            if(sender instanceof Player)
            {
                ((Player) sender).getInventory().addItem(zycie);
                return true;
            }
        }

        return false;
    }
}
