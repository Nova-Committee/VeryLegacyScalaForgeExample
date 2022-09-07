package committee.nova.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.ForgeSubscribe;

@Mod(modid = "examplemod", name = "ExampleMod", version = "@VERSION@", useMetadata = true)
public class ExampleMod {


	@EventHandler
	public void onPreInit(FMLPreInitializationEvent e) {
	}


	@ForgeSubscribe
	public void onRenderPlayerPost(RenderPlayerEvent.Specials.Post e) {

	}

}
