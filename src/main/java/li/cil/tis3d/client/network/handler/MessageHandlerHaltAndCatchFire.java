package li.cil.tis3d.client.network.handler;

import li.cil.tis3d.common.network.handler.AbstractMessageHandlerWithLocation;
import li.cil.tis3d.common.network.message.MessageCasingState;
import li.cil.tis3d.common.network.message.MessageHaltAndCatchFire;
import li.cil.tis3d.common.tile.TileEntityCasing;
import li.cil.tis3d.common.tile.TileEntityController;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class MessageHandlerHaltAndCatchFire extends AbstractMessageHandlerWithLocation<MessageHaltAndCatchFire> {
    @Override
    protected void process(final MessageHaltAndCatchFire message, final MessageContext context) {
        final TileEntity tileEntity = getTileEntity(message, context);
        if (!(tileEntity instanceof TileEntityController)) {
            return;
        }

        final TileEntityController controller = (TileEntityController) tileEntity;
        controller.haltAndCatchFire();
    }
}