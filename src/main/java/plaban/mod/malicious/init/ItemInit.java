package plaban.mod.malicious.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import plaban.mod.malicious.Malicious;
import plaban.mod.malicious.item.IronBowItem;
import plaban.mod.malicious.item.IronRodItem;

public class ItemInit {

  public static final IronRodItem IRON_ROD = new IronRodItem(new FabricItemSettings().group(ItemGroup.MISC).fireproof());
  public static final IronBowItem IRON_BOW = new IronBowItem(new FabricItemSettings().group(ItemGroup.COMBAT));
//  public static final BowItem IRON_BOW = new BowItem(new FabricItemSettings().group(ItemGroup.COMBAT));


  public static void init() {
    Registry.register(Registry.ITEM, new Identifier(Malicious.MOD_ID, "iron_rod"), IRON_ROD);
    Registry.register(Registry.ITEM, new Identifier(Malicious.MOD_ID, "iron_bow"), IRON_BOW);
  }
}
