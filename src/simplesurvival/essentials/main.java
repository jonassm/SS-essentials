package simplesurvival.essentials;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class main extends JavaPlugin {


    @Override
    public void onEnable() {
    	PluginDescriptionFile pdfFile = getDescription();
    	Logger logger = getLogger();
    	logger.info(pdfFile.getName() + " enabled! (Version " + pdfFile.getVersion() + ")");
    }

    @Override
    public void onDisable() {
    	PluginDescriptionFile pdfFile = getDescription();
    	Logger logger = getLogger();
    	logger.info(pdfFile.getName() + " disabled! (Version " + pdfFile.getVersion() + ")");
    	
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("ssversion")) {
//        	Logger logger = getLogger();
//        	logger.info(pdfFile.getName() + "is running (Version " + pdfFile.getVersion() + ")");
        	
            //sender.sendMessage("SS-Essentials is running version" + pdfFile.getVersion());
            return true;
        }
        return false;
    }
   
}