package tl.jad.arcadia;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BirthdayPlugin extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(this, this);

    getCommand("tpspwn").setExecutor(new TeleportCommand());
    getCommand("hello").setExecutor(new HelloCommand());

    getLogger().info("Enabled BirthdayPlugin");
  }

  @Override
  public void onDisable() {
    getLogger().info("Disabled BirthdayPlugin");
  }

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
  }

}
