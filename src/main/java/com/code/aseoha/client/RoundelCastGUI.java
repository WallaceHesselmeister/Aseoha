//package com.code.aseoha.client;
//
//import io.wispforest.owo.ui.base.BaseOwoScreen;
//import io.wispforest.owo.ui.component.Components;
//import io.wispforest.owo.ui.container.Containers;
//import io.wispforest.owo.ui.container.FlowLayout;
//import io.wispforest.owo.ui.core.*;
//import net.minecraft.item.ItemStack;
//import net.minecraft.text.Text;
//import org.jetbrains.annotations.NotNull;
//
//public class RoundelCastGUI  extends BaseOwoScreen<FlowLayout> {
//
//    @Override
//    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
//        return OwoUIAdapter.create(this, Containers::verticalFlow);
//    }
//
//    @Override
//    protected void build(FlowLayout rootComponent) {
//        rootComponent
//                .surface(Surface.VANILLA_TRANSLUCENT)
//                .horizontalAlignment(HorizontalAlignment.CENTER)
//                .verticalAlignment(VerticalAlignment.CENTER);
//
//        rootComponent.child(
////                Components.button(
////                        Text.literal("A Button"),
////                        button -> { System.out.println("click"); } //
////                )
//                Components.box(Sizing.fixed(250), Sizing.fixed(120))
//
//        ).child(Components.item(rootComponent.children().));
//    }
//
//}
