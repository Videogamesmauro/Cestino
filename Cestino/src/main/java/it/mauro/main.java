package it.mauro;

import it.mauro.cestino.Cestino;
import it.mauro.comandi.Comandi;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("[Cestino] >>> Attivato");

        getCommand("cestino").setExecutor(new Cestino());
        getCommand("versione").setExecutor(new Comandi());

    }

    @Override
    public void onDisable() {

        System.out.println("[Cestino] >>> Disattivato");

    }
}
