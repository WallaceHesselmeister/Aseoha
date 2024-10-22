package com.code.aseoha.items;//package com.code.aseoha.items;
//
//import com.code.aseoha.aseoha;
////import com.code.aseoha.client.screens.ManualScreen;
////import com.google.common.collect.Lists;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.screen.EditBookScreen;
//import net.minecraft.client.gui.screen.ReadBookScreen;
//import net.minecraft.command.CommandSource;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.item.WritableBookItem;
//import net.minecraft.item.WrittenBookItem;
//import net.minecraft.nbt.CompoundNBT;
//import net.minecraft.nbt.INBT;
//import net.minecraft.nbt.ListNBT;
//import net.minecraft.nbt.StringNBT;
//import net.minecraft.stats.Stats;
//import net.minecraft.util.ActionResult;
//import net.minecraft.util.Hand;
//import net.minecraft.util.text.*;
//import net.minecraft.world.World;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.TestOnly;
//
//import javax.annotation.Nullable;
//import java.io.DataOutput;
//import java.io.DataOutputStream;
//import java.util.List;
//
//public class Manual extends WrittenBookItem implements ManualScreen.IBookInfo {
//    private final List<String> pages = Lists.newArrayList();
//
//    public Manual(Properties p_i48454_1_) {
//        super(p_i48454_1_);
//    }
//
//    @Override
//    public void onCraftedBy(@NotNull ItemStack itemStack, @NotNull World world, @NotNull PlayerEntity player) {
////        super.onCraftedBy(itemStack, world, player);
////        this.pages.add("Hello, ASEOHA.");
////        ListNBT TextNBT = new ListNBT();
////        this.pages.stream().map(StringNBT::valueOf).forEach(TextNBT::add);
////        itemStack.addTagElement("pages", TextNBT);
//        initialize(itemStack, player);
//    }
//
//    @Override
//    public void inventoryTick(@NotNull ItemStack itemStack, @NotNull World world, @NotNull Entity entity, int p_77663_4_, boolean p_77663_5_) {
////        this.pages.add("{\"text\":\"Hello, ASEOHA.\"}");
//        initialize(itemStack, entity);
//    }
//
//    private void initialize(ItemStack itemStack, Entity entity){
//
//        ListNBT TextNBT = new ListNBT();
//        if(this.pages.isEmpty())
//            this.pages.add("Ello Mate.");
////        if(TextNBT.isEmpty())
////            this.pages.stream().map(StringNBT::valueOf).forEach(TextNBT::add);
//        String s = "Hello, ASEOHA!";
//        ITextComponent itextcomponent;
//        try {
//            itextcomponent = ITextComponent.Serializer.fromJsonLenient(s);
//            assert itextcomponent != null;
//            itextcomponent = TextComponentUtils.updateForEntity(entity.createCommandSourceStack(), itextcomponent, entity, 0);
//        } catch (Exception exception) {
//            itextcomponent = new StringTextComponent(s);
//        }
//        TextNBT.add(0, (INBT) StringNBT.valueOf(""));
//        TextNBT.set(0, (INBT)StringNBT.valueOf(ITextComponent.Serializer.toJson(itextcomponent)));
//        assert itemStack.getTag() != null;
//        itemStack.getOrCreateTagElement("author");
//        itemStack.getOrCreateTagElement("resolved");
//        itemStack.getOrCreateTagElement("title");
//        itemStack.getTag().put("title", (INBT) StringNBT.valueOf("ASEOHA Manual"));
//        itemStack.getTag().putBoolean("resolved", true);
//        itemStack.getTag().put("author", (INBT) StringNBT.valueOf("Codiak540"));
//        itemStack.getOrCreateTagElement("pages");
//        itemStack.getTag().put("pages", TextNBT);
//
//    }
//
//    @NotNull
//    @Override
//    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, @NotNull Hand p_77659_3_) {
//        ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
////        p_77659_2_.openMenu()
//        aseoha.LOGGER.info("Pain");
//        if(p_77659_1_.isClientSide)
//            Minecraft.getInstance().setScreen(new ManualScreen((ManualScreen.IBookInfo) this));
//
//        p_77659_2_.awardStat(Stats.ITEM_USED.get(this));
//        return ActionResult.sidedSuccess(itemstack, p_77659_1_.isClientSide());
//    }
//
//    @Override
//    public int getPageCount() {
//        return 5;
//    }
//
//    @Override
//    public ITextProperties getPageRaw(int p_230456_1_) {
//        return (ITextProperties) null;
//    }
//
//    @Override
//    public boolean isFoil(@NotNull ItemStack p_77636_1_) {
//        return false;
//    }
//}
