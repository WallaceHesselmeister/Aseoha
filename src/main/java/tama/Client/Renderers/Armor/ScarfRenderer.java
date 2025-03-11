package tama.Client.Renderers.Armor;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.world.entity.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tama.Client.Models.Armor.ScarfModel;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * the armor renderer for the {@link ScarfModel}
 */
public class ScarfRenderer<T extends ScarfModel> {
    private final T model;
    public ScarfRenderer(Supplier<LayerDefinition> supplier, Function<ModelPart, T> modelConstructor) {
        this.model = modelConstructor.apply(supplier.get().bakeRoot());
    }

    public ScarfRenderer<T> makeInvisible(boolean invisible) {
        this.model.makeInvisible(invisible);
        return this;
    }

    private static final ModelPart EMPTY_PART = new ModelPart(Collections.emptyList(), Collections.emptyMap());

    public ModelPart makeArmorParts(EquipmentSlot slot) {
        return new ModelPart(Collections.emptyList(),
                Map.of(
                        "head", EMPTY_PART,
                        "hat", EMPTY_PART,
                        "body", slot == EquipmentSlot.CHEST ? checkNonNull(model.Body) : EMPTY_PART,
                        "right_arm", EMPTY_PART,
                        "left_arm", EMPTY_PART,
                        "right_leg", EMPTY_PART,
                        "left_leg", EMPTY_PART
                )
        );
    }
    private static @NotNull ModelPart checkNonNull(@Nullable ModelPart part) {
        return part == null ? EMPTY_PART : part;
    }
}