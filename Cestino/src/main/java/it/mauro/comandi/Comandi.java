package it.mauro.comandi;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandi implements CommandExecutor {
    @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            if (sender instanceof Player) {

                Player giocatore = (Player) sender;

                giocatore.sendMessage(ChatColor.GREEN + "Il plugin risulta essere aggiornato, per sapere quando uscirà una nuova versione visita il seguente link : "
                        + ChatColor.WHITE + " https://www.github.com/Videogamesmauro ");
            }

            return false;
    }
}
