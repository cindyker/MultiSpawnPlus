package io.github.ultimatedillon.multispawnplus;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class PlayerJoinListener implements Listener {
	public PlayerJoinListener(MultiSpawnPlus plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Bukkit.getLogger().info("MultiSpawnPlus: " + event.getPlayer().getName() + " has joined!");
		
		if (!event.getPlayer().hasPlayedBefore()) {
			Bukkit.getLogger().info("MultiSpawnPlus: This player has joined for the first time.");
		}
	}
}
