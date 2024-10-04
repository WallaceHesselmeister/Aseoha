

//package com.code.aseoha.block;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import javax.annotation.Nullable;
//
//import com.code.aseoha.tileentities.blocks.ChiseledBookShelfBlockEntity;
//import com.sun.org.apache.xpath.internal.operations.Bool;
//import net.minecraft.block.*;
//import net.minecraft.client.audio.SoundSource;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.BlockItemUseContext;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.state.BooleanProperty;
//import net.minecraft.state.Property;
//import net.minecraft.state.StateContainer;
//import net.minecraft.state.properties.BlockStateProperties;
//import net.minecraft.stats.Stats;
//import net.minecraft.tags.ItemTags;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.*;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.BlockRayTraceResult;
//import net.minecraft.util.math.shapes.VoxelShapes;
//import net.minecraft.util.math.vector.Vector2f;
//import net.minecraft.util.math.vector.Vector3d;
//import net.minecraft.util.math.vector.Vector3f;
//import net.minecraft.world.World;
//
//import static com.code.aseoha.Constants.BOOKSHELF_BOOKS;
//import static net.minecraft.inventory.InventoryHelper.dropItemStack;
//
//public class ChiseledBookShelfBlock extends Block {
////    public static final MapCodec<ChiseledBookShelfBlock> CODEC = simpleCodec(ChiseledBookShelfBlock::new);
//    private static final int MAX_BOOKS_IN_STORAGE = 6;
//    public static final int BOOKS_PER_ROW = 3;
//    public static final List<BooleanProperty> SLOT_OCCUPIED_PROPERTIES;
//
////    public MapCodec<ChiseledBookShelfBlock> codec() {
////        return CODEC;
////    }
//
//    public ChiseledBookShelfBlock(AbstractBlock.Properties p_249989_) {
//        super(p_249989_);
////        BlockState $$1 = (BlockState)(this.stateDefinition.any()).setValue(HorizontalBlock.FACING, Direction.NORTH);
//        this.registerDefaultState((BlockState)(this.stateDefinition.any()).setValue(HorizontalBlock.FACING, Direction.NORTH));
////        BooleanProperty $$2;
////        for(Iterator var3 = SLOT_OCCUPIED_PROPERTIES.iterator(); var3.hasNext(); $$1 = (BlockState)$$1.setValue($$2, false)) {
////            $$2 = (BooleanProperty)var3.next();
////        }
//
////        this.createBlockStateDefinition($$1);
//    }
//
//    public BlockRenderType getRenderShape(BlockState state) {
//        return BlockRenderType.MODEL;
//    }
//
//    public ActionResultType use(BlockState pState, World pLevel, BlockPos pPos, PlayerEntity pPlayer, Hand pHand, BlockRayTraceResult pHit) {
//        TileEntity var8 = pLevel.getBlockEntity(pPos);
//        if (var8 instanceof ChiseledBookShelfBlockEntity) {
//            ChiseledBookShelfBlockEntity $$7 = (ChiseledBookShelfBlockEntity) var8;
//            Optional $$8 = getRelativeHitCoordinatesForBlockFace(pHit, pState.getValue(HorizontalBlock.FACING));
//            if (!$$8.isPresent()) {
//                return ActionResultType.PASS;
//            } else {
//                int $$9 = getHitSlot((Vector2f) $$8.get());
//                if ((Boolean)pState.getValue((Property)SLOT_OCCUPIED_PROPERTIES.get($$9))) {
//                    removeBook(pLevel, pPos, pPlayer, $$7, $$9);
//                    return ActionResultType.sidedSuccess(pLevel.isClientSide);
//                } else {
//                    ItemStack $$10 = pPlayer.getItemInHand(pHand);
//                    if ($$10.equals(BOOKSHELF_BOOKS)) {
//                        addBook(pLevel, pPos, pPlayer, $$7, $$10, $$9);
//                        return ActionResultType.sidedSuccess(pLevel.isClientSide);
//                    } else {
//                        return ActionResultType.CONSUME;
//                    }
//                }
//            }
//        } else {
//            return ActionResultType.PASS;
//        }
//    }
//
//    private static Optional<Vector2f> getRelativeHitCoordinatesForBlockFace(BlockRayTraceResult pHitResult, Direction pFace) {
//        Direction $$2 = pHitResult.getDirection();
//        if (pFace != $$2) {
//            return Optional.empty();
//        } else {
//            BlockPos $$3 = pHitResult.getBlockPos().relative($$2);
//            Vector3d $$4 = pHitResult.getLocation().subtract((double)$$3.getX(), (double)$$3.getY(), (double)$$3.getZ());
//            double $$5 = $$4.x();
//            double $$6 = $$4.y();
//            double $$7 = $$4.z();
//            Optional var10000;
//            switch ($$2) {
//                case NORTH:
//                    var10000 = Optional.of(new Vector2f((float)(1.0 - $$5), (float)$$6));
//                    break;
//                case SOUTH:
//                    var10000 = Optional.of(new Vector2f((float)$$5, (float)$$6));
//                    break;
//                case WEST:
//                    var10000 = Optional.of(new Vector2f((float)$$7, (float)$$6));
//                    break;
//                case EAST:
//                    var10000 = Optional.of(new Vector2f((float)(1.0 - $$7), (float)$$6));
//                    break;
//                case DOWN:
//                case UP:
//                    var10000 = Optional.empty();
//                    break;
//                default:
//                    throw new IncompatibleClassChangeError();
//            }
//
//            return var10000;
//        }
//    }
//
//    private static int getHitSlot(Vector2f pHitPos) {
//        int $$1 = pHitPos.y >= 0.5F ? 0 : 1;
//        int $$2 = getSection(pHitPos.x);
//        return $$2 + $$1 * 3;
//    }
//
//    private static int getSection(float pX) {
//        float $$1 = 0.0625F;
//        float $$2 = 0.375F;
//        if (pX < 0.375F) {
//            return 0;
//        } else {
//            float $$3 = 0.6875F;
//            return pX < 0.6875F ? 1 : 2;
//        }
//    }
//
//    private static void addBook(World pLevel, BlockPos pPos, PlayerEntity pPlayer, ChiseledBookShelfBlockEntity pBlockEntity, ItemStack pBookStack, int pSlot) {
//        if (!pLevel.isClientSide) {
//            pPlayer.awardStat(Stats.ITEM_USED.get(pBookStack.getItem()));
////            SoundEvent event = pBookStack.is(Items.ENCHANTED_BOOK) ? SoundEvents.CHISELED_BOOKSHELF_INSERT_ENCHANTED : SoundEvents.CHISELED_BOOKSHELF_INSERT;
//            pBlockEntity.setItem(pSlot, pBookStack.split(1));
////            pLevel.playSound(pPlayer, pPos, event, SoundType.STONE, 1.0F, 1.0F);
//            if (pPlayer.isCreative()) {
//                pBookStack.grow(1);
//            }
//
//        }
//    }
//
//    private static void removeBook(World pLevel, BlockPos pPos, PlayerEntity pPlayer, ChiseledBookShelfBlockEntity pBlockEntity, int pSlot) {
//        if (!pLevel.isClientSide) {
//            ItemStack itemStack = pBlockEntity.removeItem(pSlot, 1);
////            SoundEvent $$6 = itemStack.equals(Items.ENCHANTED_BOOK) ? SoundEvents.CHISELED_BOOKSHELF_PICKUP_ENCHANTED : SoundEvents.CHISELED_BOOKSHELF_PICKUP;
////            pLevel.playSound(null, pPos, $$6, SoundSource.BLOCKS, 1.0F, 1.0F);
//            if (!pPlayer.inventory.add(itemStack)) {
//                pPlayer.drop(itemStack, false);
//            }
//
////            pLevel.gameEvent(pPlayer, GameEvent.BLOCK_CHANGE, pPos);
//        }
//    }
//
//    @Nullable
//    public TileEntity newBlockEntity(BlockPos pPos, BlockState pState) {
//        return new ChiseledBookShelfBlockEntity(pPos, pState);
//    }
//
//    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> pBuilder) {
//        pBuilder.add(new Property[]{HorizontalBlock.FACING});
//        List var10000 = SLOT_OCCUPIED_PROPERTIES;
//        Objects.requireNonNull(pBuilder);
//        var10000.forEach((p_261456_) -> {
//            pBuilder.add(new Property[]{(Property) p_261456_});
//        });
//    }
//
//
//    public void onRemove(BlockState pState, World pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
//        if (!pState.is(pNewState.getBlock())) {
//            TileEntity blockEntity = pLevel.getBlockEntity(pPos);
//            if (blockEntity instanceof ChiseledBookShelfBlockEntity) {
//                ChiseledBookShelfBlockEntity chiseledBookShelfBlockEntity = (ChiseledBookShelfBlockEntity)blockEntity;
//                if (!chiseledBookShelfBlockEntity.isEmpty()) {
//                    for(int i = 0; i < 6; ++i) {
//                        ItemStack $$8 = chiseledBookShelfBlockEntity.getItem(i);
//                        if (!$$8.isEmpty()) {
//                            dropItemStack(pLevel, (double)pPos.getX(), (double)pPos.getY(), (double)pPos.getZ(), $$8);
//                        }
//                    }
//
//                    chiseledBookShelfBlockEntity.clearContent();
//                    pLevel.updateNeighbourForOutputSignal(pPos, this);
//                }
//            }
//
//            super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
//        }
//    }
//
//    public BlockState getStateForPlacement(BlockItemUseContext pContext) {
//        return (BlockState)this.defaultBlockState().setValue(HorizontalBlock.FACING, pContext.getHorizontalDirection().getOpposite());
//    }
//
//    public BlockState rotate(BlockState pState, Rotation pRotation) {
//        return (BlockState)pState.setValue(HorizontalBlock.FACING, pRotation.rotate((Direction)pState.getValue(HorizontalBlock.FACING)));
//    }
//
//    public BlockState mirror(BlockState pState, Mirror pMirror) {
//        return pState.rotate(pMirror.getRotation((Direction)pState.getValue(HorizontalBlock.FACING)));
//    }
//
//    public boolean hasAnalogOutputSignal(BlockState pState) {
//        return true;
//    }
//
//    public int getAnalogOutputSignal(BlockState pState, World pLevel, BlockPos pPos) {
//        if (pLevel.isClientSide()) {
//            return 0;
//        } else {
//            TileEntity var5 = pLevel.getBlockEntity(pPos);
//            if (var5 instanceof ChiseledBookShelfBlockEntity) {
//                ChiseledBookShelfBlockEntity $$3 = (ChiseledBookShelfBlockEntity)var5;
//                return $$3.getLastInteractedSlot() + 1;
//            } else {
//                return 0;
//            }
//        }
//    }
//
//    static {
//        SLOT_OCCUPIED_PROPERTIES = List.of(BlockStateProperties.CHISELED_BOOKSHELF_SLOT_0_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_1_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_2_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_3_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_4_OCCUPIED, BlockStateProperties.CHISELED_BOOKSHELF_SLOT_5_OCCUPIED);
//    }
//}
