package plaban.mod.malicious.init;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import plaban.mod.malicious.Malicious;
import plaban.mod.malicious.block.IronFenceGateBlock;

public class BlockInit {

  public static final FenceBlock IRON_FENCE = new FenceBlock(FabricBlockSettings.of(Material.METAL, MaterialColor.IRON).hardness(4.0F).resistance(6.0F).requiresTool().sounds(BlockSoundGroup.METAL));
  public static final IronFenceGateBlock IRON_FENCE_GATE = new IronFenceGateBlock(FabricBlockSettings.of(Material.METAL, MaterialColor.IRON).hardness(4.0F).resistance(6.0F).requiresTool().sounds(BlockSoundGroup.METAL));

  public static void init() {
    // Block Registry
    Registry.register(Registry.BLOCK, new Identifier(Malicious.MOD_ID, "iron_fence"), IRON_FENCE);
    Registry.register(Registry.BLOCK, new Identifier(Malicious.MOD_ID, "iron_fence_gate"), IRON_FENCE_GATE);

    // Block Item Registry
    Registry.register(Registry.ITEM, new Identifier(Malicious.MOD_ID, "iron_fence"), new BlockItem(IRON_FENCE, new Item.Settings().group(ItemGroup.DECORATIONS).fireproof()));
    Registry.register(Registry.ITEM, new Identifier(Malicious.MOD_ID, "iron_fence_gate"), new BlockItem(IRON_FENCE_GATE, new Item.Settings().group(ItemGroup.REDSTONE).fireproof()));
  }

}
