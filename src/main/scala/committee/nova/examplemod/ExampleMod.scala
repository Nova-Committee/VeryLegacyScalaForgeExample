package committee.nova.examplemod

import committee.nova.examplemod.proxies.CommonProxy
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import cpw.mods.fml.common.{Mod, SidedProxy}

@Mod(modid = "examplemod", name = "ExampleMod", useMetadata = true, modLanguage = "scala")
object ExampleMod {
  final val proxyPrefix = "committee.nova.examplemod.proxies."

  @SidedProxy(serverSide = proxyPrefix + "CommonProxy", clientSide = proxyPrefix + "ClientProxy")
  var proxy: CommonProxy = _

  @EventHandler def preInit(e: FMLPreInitializationEvent): Unit = proxy.preInit(e)

  @EventHandler def init(e: FMLInitializationEvent): Unit = proxy.init(e)

  @EventHandler def postInit(e: FMLPostInitializationEvent): Unit = proxy.postInit(e)
}
