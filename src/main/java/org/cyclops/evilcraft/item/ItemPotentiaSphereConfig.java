package org.cyclops.evilcraft.item;

import net.minecraft.item.Item;
import org.cyclops.cyclopscore.config.ConfigurableProperty;
import org.cyclops.cyclopscore.config.extendedconfig.ItemConfig;
import org.cyclops.evilcraft.EvilCraft;

/**
 * Config for the Potentia Sphere.
 * @author rubensworks
 *
 */
public class ItemPotentiaSphereConfig extends ItemConfig {

    public ItemPotentiaSphereConfig() {
        super(
                EvilCraft._instance,
            "potentia_sphere",
                eConfig -> new Item(new Item.Properties()
                        .group(EvilCraft._instance.getDefaultItemGroup()))
        );
    }
    
}
