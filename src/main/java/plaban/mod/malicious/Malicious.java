package plaban.mod.malicious;

import net.fabricmc.api.ModInitializer;
import plaban.mod.malicious.init.BlockInit;
import plaban.mod.malicious.init.ItemInit;

public class Malicious implements ModInitializer {

  public static final String MOD_ID = "plaban_malicious_mod";

  @Override
  public void onInitialize() {
    ItemInit.init();
    BlockInit.init();
  }
}
