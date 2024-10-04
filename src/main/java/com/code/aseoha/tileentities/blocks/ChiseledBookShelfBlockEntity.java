
//package com.code.aseoha.tileentities.blocks;
//
//import java.util.Objects;
//
//import com.code.aseoha.misc.Container120;
//import net.minecraft.block.ContainerBlock;
//import net.minecraft.inventory.IInventory;
//import com.code.aseoha.aseoha;
//import com.code.aseoha.block.ChiseledBookShelfBlock;
//import com.code.aseoha.tileentities.AseohaTiles;
//import net.minecraft.block.BlockState;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.inventory.container.Container;
//import net.minecraft.item.ItemStack;
//import net.minecraft.nbt.CompoundNBT;
//import net.minecraft.nbt.ListNBT;
//import net.minecraft.state.BooleanProperty;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.Direction;
//import net.minecraft.util.NonNullList;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.IBlockReader;
//import net.minecraft.world.World;
//import net.minecraftforge.common.capabilities.Capability;
//import net.minecraftforge.common.util.LazyOptional;
//import net.minecraftforge.event.entity.living.LootingLevelEvent;
//import net.minecraftforge.event.world.BlockEvent;
//import net.minecraftforge.event.world.WorldEvent;
//import net.minecraftforge.items.CapabilityItemHandler;
//import net.minecraftforge.items.IItemHandler;
//import net.minecraftforge.items.wrapper.InvWrapper;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import static com.code.aseoha.Constants.BOOKSHELF_BOOKS;
//
//public class ChiseledBookShelfBlockEntity extends TileEntity implements Container120 {
//    public static final int MAX_BOOKS_IN_STORAGE = 6;
////    private static final Logger LOGGER = aseoha.LOGGER;
//    private final NonNullList<ItemStack> items;
//    private int lastInteractedSlot;
//    private LazyOptional<?> itemHandler;
//
//    public ChiseledBookShelfBlockEntity(BlockPos pPos, BlockState pState) {
//        super(AseohaTiles.CHISELED_BOOKSHELF.get());//, pPos, pState);
//        this.items = NonNullList.withSize(6, ItemStack.EMPTY);
//        this.lastInteractedSlot = -1;
//        this.itemHandler = LazyOptional.of(this::createUnSidedHandler);
//    }
//
//    private void updateState(int pSlot) {
//        if (pSlot >= 0 && pSlot < 6) {
//            this.lastInteractedSlot = pSlot;
//            BlockState blockstate = this.getBlockState();
//
//            for(int i = 0; i < ChiseledBookShelfBlock.SLOT_OCCUPIED_PROPERTIES.size(); ++i) {
//                boolean flag = !this.getItem(i).isEmpty();
//                BooleanProperty booleanproperty = (BooleanProperty)ChiseledBookShelfBlock.SLOT_OCCUPIED_PROPERTIES.get(i);
//                blockstate = (BlockState)blockstate.setValue(booleanproperty, flag);
//            }
//
//            ((World)Objects.requireNonNull(this.level)).setBlock(this.worldPosition, blockstate, 3);
////            this.level.levelEvent(WorldEvent, this.worldPosition, Context.of(blockstate));
//        } else {
//            aseoha.LOGGER.error("Expected slot 0-5, got {}", pSlot);
//        }
//
//    }
//@Override
//    public void load(BlockState blockState, CompoundNBT pTag) {
//        this.items.clear();
//        loadAllItems(pTag, this.items);
//        this.lastInteractedSlot = pTag.getInt("last_interacted_slot");
//    }
//@Override
//public CompoundNBT save(CompoundNBT pTag) {
//        saveAllItems(pTag, this.items, true);
//        pTag.putInt("last_interacted_slot", this.lastInteractedSlot);
//    return pTag;
//}
//
////    public int count() {
////        return (int)this.items.stream().filter(Predicate.not(ItemStack::isEmpty).count();
////    }
//
//    public void clearContent() {
//        this.items.clear();
//    }
//
//    public int getContainerSize() {
//        return 6;
//    }
//
//    public boolean isEmpty() {
//        return this.items.stream().allMatch(ItemStack::isEmpty);
//    }
//
//    public ItemStack getItem(int pSlot) {
//        return (ItemStack)this.items.get(pSlot);
//    }
//
//    public ItemStack removeItem(int pSlot, int pAmount) {
//        ItemStack itemstack = Objects.requireNonNull(this.items.get(pSlot)); //orElse(ItemStack.EMPTY)
//        this.items.set(pSlot, ItemStack.EMPTY);
//        if (!itemstack.isEmpty()) {
//            this.updateState(pSlot);
//        }
//
//        return itemstack;
//    }
//
//    public ItemStack removeItemNoUpdate(int pSlot) {
//        return this.removeItem(pSlot, 1);
//    }
//
//    public void setItem(int pSlot, ItemStack pStack) {
//        if (pStack.equals(BOOKSHELF_BOOKS)) {
//            this.items.set(pSlot, pStack);
//            this.updateState(pSlot);
//        } else if (pStack.isEmpty()) {
//            this.removeItem(pSlot, 1);
//        }
//
//    }
//
////    public boolean canTakeItem(Container pTarget, int pSlot, ItemStack pStack) {
////        return pTarget.hasAnyMatching((p_281577_) -> {
////            if (p_281577_.isEmpty()) {
////                return true;
////            } else {
////                return ItemStack.isSameItemSameTags(pStack, p_281577_) && p_281577_.getCount() + pStack.getCount() <= Math.min(p_281577_.getMaxStackSize(), pTarget.getMaxStackSize());
////            }
////        });
////    }
//
//    public int getMaxStackSize() {
//        return 1;
//    }
//
//    public boolean stillValid(PlayerEntity pPlayer) {
//        return Container120.stillValidBlockEntity(this, pPlayer);
//    }
//
//    public boolean canPlaceItem(int pSlot, ItemStack pStack) {
//        return pStack.equals(BOOKSHELF_BOOKS) && this.getItem(pSlot).isEmpty() && pStack.getCount() == this.getMaxStackSize();
//    }
//
//    public int getLastInteractedSlot() {
//        return this.lastInteractedSlot;
//    }
//
//    protected IItemHandler createUnSidedHandler() {
//        return new InvWrapper((IInventory) this);
//    }
//
//    @NotNull
//    @Override
//    public <T> LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side) {
//        return cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && !this.remove ? this.itemHandler.cast() : super.getCapability(cap, side);
//    }
//
//
//    public void invalidateCaps() {
//        super.invalidateCaps();
//        this.itemHandler.invalidate();
//    }
//
//    public void reviveCaps() {
//        super.reviveCaps();
//        this.itemHandler = LazyOptional.of(this::createUnSidedHandler);
//    }
//
//
//
//
//    public static void loadAllItems(CompoundNBT pTag, NonNullList<ItemStack> pList) {
//        ListNBT $$2 = pTag.getList("Items", 10);
//
//        for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
//            CompoundNBT $$4 = $$2.getCompound($$3);
//            int $$5 = $$4.getByte("Slot") & 255;
//            if ($$5 >= 0 && $$5 < pList.size()) {
//                pList.set($$5, ItemStack.of($$4));
//            }
//        }
//
//    }
//
//
//    public static CompoundNBT saveAllItems(CompoundNBT pTag, NonNullList<ItemStack> pList) {
//        return saveAllItems(pTag, pList, true);
//    }
//
//    public static CompoundNBT saveAllItems(CompoundNBT pTag, NonNullList<ItemStack> pList, boolean pSaveEmpty) {
//        ListNBT $$3 = new ListNBT();
//
//        for(int $$4 = 0; $$4 < pList.size(); ++$$4) {
//            ItemStack $$5 = (ItemStack)pList.get($$4);
//            if (!$$5.isEmpty()) {
//                CompoundNBT $$6 = new CompoundNBT();
//                $$6.putByte("Slot", (byte)$$4);
//                $$5.save($$6);
//                $$3.add($$6);
//            }
//        }
//
//        if (!$$3.isEmpty() || pSaveEmpty) {
//            pTag.put("Items", $$3);
//        }
//
//        return pTag;
//    }
//
//    static boolean stillValidBlockEntity(TileEntity pBlockEntity, PlayerEntity pPlayer, int pMaxDistance) {
//        World $$3 = pBlockEntity.getLevel();
//        BlockPos $$4 = pBlockEntity.getBlockPos();
//        if ($$3 == null) {
//            return false;
//        } else if ($$3.getBlockEntity($$4) != pBlockEntity) {
//            return false;
//        } else {
//            return pPlayer.distanceToSqr((double)$$4.getX() + 0.5, (double)$$4.getY() + 0.5, (double)$$4.getZ() + 0.5) <= (double)(pMaxDistance * pMaxDistance);
//        }
//    }
//
////    @Nullable
////    @Override
////    public TileEntity newBlockEntity(IBlockReader iBlockReader) {
////        return null;
////    }
////    public static final Capability<IItemHandler> ITEM_HANDLER = CapabilityManager.valueOf(new CapabilityToken<IItemHandler>() {
////    });
//}
