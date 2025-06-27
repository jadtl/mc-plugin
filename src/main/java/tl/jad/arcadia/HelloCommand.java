package tl.jad.arcadia;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelloCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    // TODO: Add chat colors
    sender.sendMessage(" Hello " + sender.getName());
    return true;
  }
}
