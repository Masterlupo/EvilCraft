package evilcraft.gui.client;

import net.minecraft.entity.player.InventoryPlayer;
import evilcraft.api.gui.client.GuiContainerTankInventory;
import evilcraft.entities.tileentities.TileBloodInfuser;
import evilcraft.gui.container.ContainerBloodInfuser;

public class GuiBloodInfuser extends GuiContainerTankInventory {

    private static final int TANKHEIGHT = 58;
    private static final int TANKWIDTH = 16;
    private static final int TANKX = 43;
    private static final int TANKY = 72;
    
    public GuiBloodInfuser(InventoryPlayer inventory, TileBloodInfuser tile) {
        super(new ContainerBloodInfuser(inventory, tile), tile);
        this.setTank(TANKHEIGHT, TANKWIDTH, TANKX, TANKY);
    }
}
