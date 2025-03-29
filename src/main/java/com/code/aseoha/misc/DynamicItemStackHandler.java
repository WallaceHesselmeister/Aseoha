package com.code.aseoha.misc;

import com.code.aseoha.Helpers.MiscHelper;
import lombok.Getter;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.items.ItemStackHandler;

public class DynamicItemStackHandler {
    @Getter
    private ItemStackHandler handler;
    private ItemStackHandler bckHandler;

    public DynamicItemStackHandler() {
        this.handler = new ItemStackHandler(1);
        this.bckHandler = null;
    }

    public void addItemStack(ItemStack stack) {
        this.RemoveEmpty();
        if(this.handler.getSlots() != 0 && this.GetSlot().getItem().equals(stack.getItem()) && this.GetSlot().getMaxStackSize() <= stack.getCount() + this.GetSlot().getCount())
            this.GetSlot().grow(stack.getCount());
        else {
            this.IncrementHandler();
            this.handler.setStackInSlot(this.handler.getSlots() - 1, stack);
        }
    }

    public void addItemStackSingle(ItemStack stack) {
        this.RemoveEmpty();
        this.IncrementHandler();
        if(this.handler.getSlots() != 0 && this.GetSlot().getItem().equals(stack.getItem()) && this.GetSlot().getMaxStackSize() <= stack.getCount() + this.GetSlot().getCount())
            this.GetSlot().grow(stack.getCount());
        else {
            this.handler.setStackInSlot(this.handler.getSlots() - 1, stack);
        }
    }

    public ItemStack pullItem() {
        if(this.handler.getSlots() == 0) return ItemStack.EMPTY;
        ItemStack stack = this.ExtractSlot();
        this.RemoveEmpty();
        return stack;
    }

    public ItemStack pullFullStack() {
        if(this.handler.getSlots() == 0) return ItemStack.EMPTY;
        ItemStack stack = this.ExtractFullSlot();
        this.RemoveEmpty();
        return stack;
    }

    /**
     * Returns true if the handler is currently syncing the stack handler
     **/
    public boolean isOccupied() {
        return this.bckHandler != null;
    }

    private void DecrementHandler() {
        int slots = this.handler.getSlots();
        ItemStackHandler bck = this.bckHandler;
        this.bckHandler = this.handler;
        this.handler = new ItemStackHandler(--slots);
        MiscHelper.SyncHandlers(this.handler, this.bckHandler);
        this.bckHandler = bck;
    }

    private void IncrementHandler() {
        int slots = this.handler.getSlots();
        ItemStackHandler bck = this.bckHandler;
        this.bckHandler = this.handler;
        this.handler = new ItemStackHandler(++slots);
        MiscHelper.SyncHandlers(this.handler, this.bckHandler);
        this.bckHandler = bck;
    }

    public ItemStack GetSlot() {
        return this.handler.getStackInSlot(this.handler.getSlots() - 1);
    }

    private ItemStack ExtractSlot() {
        this.RemoveEmpty();
        ItemStack stack = this.handler.extractItem(this.handler.getSlots() - 1, 1,false);
        this.RemoveEmpty();
        return stack;
    }

    private ItemStack ExtractFullSlot() {
        this.RemoveEmpty();
        ItemStack stack = this.GetSlot();
        this.handler.setStackInSlot(this.handler.getSlots() - 1, ItemStack.EMPTY);
        this.RemoveEmpty();
        return stack;
    }

    public void RemoveEmpty() {
        if(this.handler.getSlots() == 0) return;
        ItemStack stack = this.GetSlot().getStack();
        if(this.GetSlot().equals(ItemStack.EMPTY) || this.GetSlot().equals(Items.AIR.getDefaultInstance()) || this.GetSlot().getCount() == 0)
            this.DecrementHandler();
    }
}
