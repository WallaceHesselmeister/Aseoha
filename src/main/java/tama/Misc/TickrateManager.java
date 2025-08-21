/* (C) TAMA Studios 2025 */
package tama.Misc;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.entity.LevelEntityGetter;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import org.apache.commons.lang3.tuple.Pair;
import tama.Capabilities.Capabilities;
import tama.Capabilities.Interfaces.ITickrateCapability;
import tama.Capabilities.tick.TickrateCapabilityImpl;
import tama.World.TickrateSavedData;
import tama.aseoha;
import tama.networking.Networking;
import tama.networking.s2c.UpdateAreaTickratePacket;
import tama.networking.s2c.UpdateDimensionTickratePacket;

@Mod.EventBusSubscriber(modid = aseoha.MODID, bus = Bus.FORGE)
public class TickrateManager {
    public static final Method GET_ENTITY = ObfuscationReflectionHelper.findMethod(Level.class, "m_142646_");
    public static final Map<Integer, Entity> ENTITY_MAP = new HashMap<>();
    public static final Map<Integer, Entity> ENTITY_MAP2 = new HashMap<>();
    public static final Map<ResourceKey<Level>, TimerIMPL> LEVEL_MAP = new HashMap<>();
    public static final List<Pair<AABB, Float>> AABB_LIST = new ArrayList<>();

    public static boolean hasDimensionTimer(ResourceKey<Level> dimension) {
        TickrateSavedData data = TickrateSavedData.get(dimension);
        if (data != null) {
            return data.getTimer().tickrate != 20.0F;
        }
        return LEVEL_MAP.containsKey(dimension) && LEVEL_MAP.get(dimension).tickrate != 20.0F;
    }

    public static TimerIMPL getDimensionTimer(ResourceKey<Level> dimension) {
        TickrateSavedData data = TickrateSavedData.get(dimension);
        if (data != null) {
            return data.getTimer();
        }
        return LEVEL_MAP.get(dimension);
    }

    public static boolean isExcluded(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.isExcluded();
    }

    public static boolean shouldChangeSubEntities(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.shouldChangeSubEntities();
    }

    public static boolean shouldExcludeSubEntities(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.shouldExcludeSubEntities();
    }

    public static List<Pair<AABB, Float>> getTickrateAreas(ResourceKey<Level> dimension) {
        TickrateSavedData data = TickrateSavedData.get(dimension);
        if (data != null) {
            return data.getTickrateAreas();
        }
        return AABB_LIST;
    }

    public static void addTickrateArea(ResourceKey<Level> dimension, AABB aabb, float tickrate) {
        TickrateSavedData data = TickrateSavedData.get(dimension);
        if (data != null) {
            data.addTickrateArea(aabb, tickrate);
            Networking.sendToAll(new UpdateAreaTickratePacket(aabb, tickrate));
        }
    }

    public static void setLevelTickrate(ResourceKey<Level> dimension, float tickrate) {
        TickrateSavedData data = TickrateSavedData.get(dimension);
        if (data != null) {
            data.setTickrate(tickrate);
            Networking.sendToAll(new UpdateDimensionTickratePacket(dimension, tickrate));
        }
    }

    public static void includeEntity(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        cap.exclude(false);
    }

    public static void excludeEntity(Entity entity) {
        excludeEntity(entity, true);
    }

    public static void excludeEntity(Entity entity, boolean excludeSubEntities) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        cap.exclude(true);
        cap.excludeSubEntities(excludeSubEntities);
    }

    public static void changeSubEntities(Entity entity, boolean changeSubEntities) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        cap.changeSubEntities(changeSubEntities);
    }

    public static void setBaseTickrate(Entity entity, float tickrate) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        cap.setBaseTickrate(tickrate);
    }

    public static void setTickrate(Entity entity, float tickrate) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        cap.setTickrate(tickrate);
    }

    public static float getTickrate(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.getTickrate();
    }

    public static void resetTickrate(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        cap.resetTickrate();
    }

    public static TimerIMPL getBaseTimer(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.getBaseTimer();
    }

    public static TimerIMPL getTimer(Entity entity) {
        ITickrateCapability cap =
                entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.getCurrentTimer();
    }

    public static boolean hasTimer(Entity entity) {
        ITickrateCapability cap = entity.getCapability(Capabilities.TICK_RATE).orElse(new TickrateCapabilityImpl());
        return cap.hasTimer();
    }

    public static Pair<Boolean, Float> getArea(ResourceKey<Level> dimension, AABB boundingBox) {
        for (Iterator<Pair<AABB, Float>> itr = getTickrateAreas(dimension).iterator(); itr.hasNext(); ) {
            Pair<AABB, Float> pair = itr.next();
            AABB aabb = pair.getLeft();
            return Pair.of(aabb.intersects(boundingBox), pair.getRight());
        }
        return Pair.of(false, 20.0F);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Entity> T getEntityByUUID(Level level, UUID uuid) {
        try {
            LevelEntityGetter<Entity> entities = (LevelEntityGetter<Entity>) GET_ENTITY.invoke(level);
            return (T) entities.get(uuid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
