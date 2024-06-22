package sources.net.thenoppy12.noppyaddon;

//import sources.net.thenoppy12.noppyaddon.commands.CommandExample;
import sources.net.thenoppy12.noppyaddon.modules.PanicModule;
//import sources.net.thenoppy12.noppyaddon.hud.HudExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
//import meteordevelopment.meteorclient.commands.Commands;
//import meteordevelopment.meteorclient.systems.hud.Hud;
//import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class NoppyAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("NoppyAddon");

    //public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing NoppyAddon for Meteor");
        LOG.info("Version: 0.1.0");
        LOG.info("Github: " + getRepo());

        // Modules
        Modules.get().add(new PanicModule());

        // Commands
        //Commands.add(new CommandExample());

        // HUD
        //Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "sources.net.thenoppy12.noppyaddon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("thenoppy12", "NoppyAddon-Meteor");
    }
}
