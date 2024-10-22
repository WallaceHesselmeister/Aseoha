package com.code.aseoha.block;//
//package com.code.aseoha.block;
//
//import java.util.Random;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.AbstractBlock.Properties;
//import net.minecraft.block.material.Material;
//import net.minecraft.client.particle.ParticleManager;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.BlockItem;
//import net.minecraft.item.BlockItemUseContext;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.LeadItem;
//import net.minecraft.particles.ParticleTypes;
//import net.minecraft.state.Property;
//import net.minecraft.state.StateContainer;
//import net.minecraft.state.properties.BlockStateProperties;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.ActionResultType;
//import net.minecraft.util.Direction;
//import net.minecraft.util.Hand;
//import net.minecraft.util.Rotation;
//import net.minecraft.util.SoundCategory;
//import net.minecraft.util.SoundEvent;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.BlockRayTraceResult;
//import net.minecraft.util.math.RayTraceResult;
//import net.minecraft.world.World;
//import net.minecraft.world.server.ServerWorld;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.tardis.mod.blocks.template.NotSolidTileBlock;
//import net.tardis.mod.helper.WorldHelper;
//import net.tardis.mod.itemgroups.TItemGroups;
//import net.tardis.mod.misc.IDontBreak;
//import net.tardis.mod.sounds.TSounds;
//import net.tardis.mod.tileentities.BrokenExteriorTile;
//import net.tardis.mod.tileentities.exteriors.TTCapsuleExteriorTile;
//import net.tardis.mod.world.dimensions.TDimensions.DimensionTypes;
//
//public class TT_Capsule extends NotSolidTileBlock implements IDontBreak {
//    public BlockItem ITEM = new BlockItemTTCapsule(this);
//
//    public TT_Capsule() {
//        super(Properties.of(Material.BARRIER).strength(9999.0F));
//        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(BlockStateProperties.WATERLOGGED, false));
//    }
//
//    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
//        if (worldIn.isClientSide) {
//            return ActionResultType.CONSUME;
//        } else {
//            ItemStack stack = player.getItemInHand(handIn);
//            TileEntity te = worldIn.getBlockEntity(pos);
//            if (te instanceof TTCapsuleExteriorTile) {
////                if (stack.isEmpty() && LeadItem.bindPlayerMobs(player, worldIn, pos) == ActionResultType.SUCCESS) {
////                    ((TTCapsuleExteriorTile)te).startForceTame(player);
////                }
//
//                    player.getItemInHand(handIn).shrink(1);
//
//            }
//
//            return ActionResultType.SUCCESS;
//        }
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
////        if (rand.nextDouble() < 0.05) {
////            for(int i = 0; i < 18; ++i) {
////                double angle = Math.toRadians((double)(i * 20));
////                double x = Math.sin(angle);
////                double z = Math.cos(angle);
////                worldIn.playLocalSound((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (SoundEvent)TSounds.ELECTRIC_SPARK.get(), SoundCategory.BLOCKS, 0.05F, 1.0F, false);
////                worldIn.addParticle(ParticleTypes.LAVA, (double)pos.getX() + 0.5 + x, (double)pos.getY() + rand.nextDouble(), (double)pos.getZ() + 0.5 + z, 0.0, 0.0, 0.0);
////            }
////        }
//
//    }
//
//    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
//        builder.add(new Property[]{BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.WATERLOGGED});
//    }
//
//    public BlockState getStateForPlacement(BlockItemUseContext context) {
//        return context.getPlayer() != null ? (BlockState)this.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, context.getPlayer().getDirection().getOpposite()) : this.defaultBlockState();
//    }
//
//    public boolean addLandingEffects(BlockState state1, ServerWorld worldserver, BlockPos pos, BlockState state2, LivingEntity entity, int numberOfParticles) {
//        return false;
//    }
//
//    public boolean addRunningEffects(BlockState state, World world, BlockPos pos, Entity entity) {
//        return false;
//    }
//
//    public boolean addHitEffects(BlockState state, World worldObj, RayTraceResult target, ParticleManager manager) {
//        return false;
//    }
//
//    public boolean addDestroyEffects(BlockState state, World world, BlockPos pos, ParticleManager manager) {
//        return false;
//    }
//
//    public BlockState rotate(BlockState state, Rotation rot) {
//        return (BlockState)state.setValue(BlockStateProperties.HORIZONTAL_FACING, rot.rotate((Direction)state.getValue(BlockStateProperties.HORIZONTAL_FACING)));
//    }
//
//    public static class BlockItemTTCapsule extends BlockItem {
//        public BlockItemTTCapsule(Block blockIn) {
//            super(blockIn, (new Item.Properties()).tab(TItemGroups.MAIN));
//        }
//
//        protected boolean canPlace(BlockItemUseContext cont, BlockState state) {
//            return cont.getClickedFace() == Direction.UP && cont.getLevel().getBlockState(cont.getClickedPos().above()).canBeReplaced(cont) && !WorldHelper.areDimensionTypesSame(cont.getLevel(), DimensionTypes.TARDIS_TYPE);
//        }
//
//        protected boolean placeBlock(BlockItemUseContext context, BlockState state) {
//            return context.getLevel().setBlockAndUpdate(context.getClickedPos().above(), state);
//        }
//    }
//}
