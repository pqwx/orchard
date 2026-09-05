/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
class lIIllIIl
extends RaycastContext {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public VoxelShape getBlockShape(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        VoxelShape voxelShape;
        block1: {
            if (!lIIllllI.lIllI(blockState)) break block1;
            voxelShape = VoxelShapes.empty();
            return voxelShape;
        }
        voxelShape = super.getBlockShape(blockState, blockView, blockPos);
        return voxelShape;
    }

    lIIllIIl(Vec3d vec3d, Vec3d vec3d2, RaycastContext.ShapeType shapeType, RaycastContext.FluidHandling fluidHandling, ShapeContext shapeContext) {
        super(vec3d, vec3d2, shapeType, fluidHandling, shapeContext);
    }
}

