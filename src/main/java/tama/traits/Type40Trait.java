package tama.traits;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.emotional.Trait;
import net.tardis.mod.misc.ObjectOrTagCodec;
import net.tardis.mod.registry.TraitRegistry;
import tama.Items.AItems;

import java.util.ArrayList;
import java.util.List;

public class Type40Trait extends Trait {



    public static final Codec<Type40Trait> CODEC = RecordCodecBuilder.create(i ->
            i.group(
                    TraitRegistry.REGISTRY.get().getCodec().fieldOf("type").forGetter(Type40Trait::getType),
                    ITEM_CODEC.forGetter(Type40Trait::getLikedItems),
                    ObjectOrTagCodec.createCodec(ForgeRegistries.BIOMES).listOf().fieldOf("liked_biome").forGetter(t -> t.likedBiome)
            ).apply(i, Type40Trait::new)
    );

    final List<ObjectOrTagCodec<Biome>> likedBiome = new ArrayList<>();

    public Type40Trait(Codec<? extends Trait> type, List<Pair<ObjectOrTagCodec<Item>, Integer>> likedItems, List<ObjectOrTagCodec<Biome>> likedBiome) {
        super(type, likedItems);
        this.likedBiome.addAll(Lists.newArrayList(likedBiome));
    }

    @Override
    public void affectLanding(ITardisLevel tardis) {

    }

    @Override
    public void onCrewSecond(ITardisLevel tardis, List<Player> crew) {
    }

    @Override
    public void onLandedHour(ITardisLevel tardis, ServerLevel landedLevel, Biome currentBiome, BlockPos location) {
        if(currentBiome.coldEnoughToSnow(location) || landedLevel.dimensionType().hasCeiling() || !landedLevel.dimensionType().hasSkyLight())
            tardis.getEmotionalHandler().modMood(-100);
    }

    public boolean isInAnyLiked(Biome biome){
        for(ObjectOrTagCodec<Biome> b : this.likedBiome){
            if(b.matches(biome))
                return true;
        }
        return false;
    }
}
