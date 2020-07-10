package me.andreiwasfound.colorchat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new ChatEvent(), this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
