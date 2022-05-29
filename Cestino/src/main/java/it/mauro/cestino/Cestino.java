package it.mauro.cestino;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Cestino implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player giocatore = (Player) sender;

            Inventory cestino = Bukkit.createInventory(giocatore, 36, ChatColor.DARK_RED + "Cestino");

            giocatore.openInventory(cestino);

            giocatore.sendMessage(ChatColor.GREEN + "Cestino aperto!");

        } else {
            System.out.println("Questo comando è eseguibile solamente dai giocatori all'interno del server.");
        }

        return false;
    }
}
