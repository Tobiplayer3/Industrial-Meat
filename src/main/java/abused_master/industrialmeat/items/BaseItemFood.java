package abused_master.industrialmeat.items;

import com.buuz135.industrial.IndustrialForegoing;
import net.minecraft.item.ItemFood;

public class BaseItemFood extends ItemFood {

    public BaseItemFood(int amount, float saturation, String name) {
        super(amount, saturation, false);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(IndustrialForegoing.creativeTab);
    }
}
