package simplesurvival.essentials;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public class main extends JavaPlugin {


    @Override
    public void onEnable() {
    	PluginDescriptionFile pdfFile = getDescription();
    	Logger logger = getLogger();
    	logger.info(pdfFile.getName() + " enabled! (Version " + pdfFile.getVersion() + ")");
    	
 //   	getCommand ("")
    }

    @Override
    public void onDisable() {
    	PluginDescriptionFile pdfFile = getDescription();
    	Logger logger = getLogger();
    	logger.info(pdfFile.getName() + " disabled! (Version " + pdfFile.getVersion() + ")");
    	
    }
}