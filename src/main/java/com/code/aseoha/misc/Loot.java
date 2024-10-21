package com.code.aseoha.misc;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Loot {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLOBAL_LOOT_MODIFIER = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, aseoha.MODID);
    public static final RegistryObject<AseohaCommonLoot.Serializer> ASEOHA_COMMON_LOOT = GLOBAL_LOOT_MODIFIER.register("aseoha_common_loot", AseohaCommonLoot.Serializer::new);
    public static final RegistryObject<AseohaUncommonLoot.Serializer> ASEOHA_UNCOMMON_LOOT = GLOBAL_LOOT_MODIFIER.register("aseoha_uncommon_loot", AseohaUncommonLoot.Serializer::new);
    public static final RegistryObject<AseohaRareLoot.Serializer> ASEOHA_RARE_LOOT = GLOBAL_LOOT_MODIFIER.register("aseoha_rare_loot", AseohaRareLoot.Serializer::new);

    public static class AseohaCommonLoot extends LootModifier {

        private final int Random;

        public AseohaCommonLoot(final ILootCondition[] conditionsIn, int Rand) {
            super(conditionsIn);
            this.Random = Rand;
        }

        @NotNull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> Generated, LootContext Context) {
            if (Context.getRandom().nextInt(100) <= Random) {
                Generated.add(AseohaItems.GOLDEN_POTATO.get().getDefaultInstance());
            }
//            if (this.i == 2)
//                if (Context.getRandom().nextInt(120) <= Random) {
//                    Generated.add(AseohaItems.MAJESTIC_TALE_DISC.get().getDefaultInstance());
//                    Generated.add(AseohaItems.GOLDEN_POTATO.get().getDefaultInstance());
//                    Generated.add(AseohaItems.TEZARAK_COIN.get().getDefaultInstance());
//                }
//            if (this.i == 3)
//                if (Context.getRandom().nextInt(140) <= Random) {
//                    ItemStack stack = AseohaItems.GOLDEN_POTATO.get().getDefaultInstance();
//                    stack.setCount(Context.getRandom().nextInt(4));
//                    Generated.add(AseohaItems.TEZARAK_COIN.get().getDefaultInstance());
//                    Generated.add(stack);
//                }

            return Generated;
        }

        private static class Serializer extends GlobalLootModifierSerializer<AseohaCommonLoot> {
            @Override
            public AseohaCommonLoot read(ResourceLocation location, JsonObject object, ILootCondition[] conditions) {
                final int multiplicationFactor = JSONUtils.getAsInt(object, "chance", 2);
                return new AseohaCommonLoot(conditions, multiplicationFactor);
            }

            @Override
            public JsonObject write(AseohaCommonLoot instance) {
                final JsonObject obj = this.makeConditions(instance.conditions);
                obj.addProperty("chance", instance.Random);
                return obj;
            }
        }
    }




    public static class AseohaUncommonLoot extends LootModifier {

        private final int Random;

        public AseohaUncommonLoot(final ILootCondition[] conditionsIn, int Rand) {
            super(conditionsIn);
            this.Random = Rand;
        }

        @NotNull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> Generated, LootContext Context) {
            if (Context.getRandom().nextInt(120) <= Random) {
                Generated.add(AseohaItems.MAJESTIC_TALE_DISC.get().getDefaultInstance());
                Generated.add(AseohaItems.GOLDEN_POTATO.get().getDefaultInstance());
                Generated.add(AseohaItems.TEZARAK_COIN.get().getDefaultInstance());
            }
            return Generated;
        }
            private static class Serializer extends GlobalLootModifierSerializer<AseohaUncommonLoot> {
                @Override
                public AseohaUncommonLoot read(ResourceLocation location, JsonObject object, ILootCondition[] conditions) {
                    final int multiplicationFactor = JSONUtils.getAsInt(object, "chance", 2);
                    return new AseohaUncommonLoot(conditions, multiplicationFactor);
                }

                @Override
                public JsonObject write(AseohaUncommonLoot instance) {
                    final JsonObject obj = this.makeConditions(instance.conditions);
                    obj.addProperty("chance", instance.Random);
                    return obj;
                }
            }

    }



    public static class AseohaRareLoot extends LootModifier {

        private final int Random;

        public AseohaRareLoot(final ILootCondition[] conditionsIn, int Rand) {
            super(conditionsIn);
            this.Random = Rand;
        }

        @NotNull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> Generated, LootContext Context) {
                if (Context.getRandom().nextInt(140) <= Random) {
                    ItemStack stack = AseohaItems.GOLDEN_POTATO.get().getDefaultInstance();
                    stack.setCount(Context.getRandom().nextInt(4));
                    Generated.add(AseohaItems.TEZARAK_COIN.get().getDefaultInstance());
                    Generated.add(stack);
                }
            return Generated;
        }

        private static class Serializer extends GlobalLootModifierSerializer<AseohaRareLoot> {
            @Override
            public AseohaRareLoot read(ResourceLocation location, JsonObject object, ILootCondition[] conditions) {
                final int multiplicationFactor = JSONUtils.getAsInt(object, "chance", 2);
                return new AseohaRareLoot(conditions, multiplicationFactor);
            }

            @Override
            public JsonObject write(AseohaRareLoot instance) {
                final JsonObject obj = this.makeConditions(instance.conditions);
                obj.addProperty("chance", instance.Random);
                return obj;
            }
        }
    }


}