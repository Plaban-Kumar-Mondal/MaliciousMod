package plaban.mod.malicious.item;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class IronBowItem extends BowItem {
  public IronBowItem(Settings settings) {
    super(settings);
  }

  @Override
  public int getMaxUseTime(ItemStack stack) {
    return 240;
  }

  @Override
  public int getRange() {
    return 20;
  }
}
