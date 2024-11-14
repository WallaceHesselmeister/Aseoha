package com.code.common.blocks;

import net.minecraft.world.level.block.Block;

public interface IAmARoundel {
    /** Get ID of the generic Roundel, this is only needed for "special" Roundels, such as alternating and lit roundels **/
    void SetID(String ID);
    /** Getter for IAmARoundel#SetId **/
    String GetID();
    /** Whether this is an Alternating Roundel**/
    Boolean IsAlternating();
    /** Whether this should be an Alternating Roundel**/
    void SetAlternating(Boolean bl);
    /** The "Average" Roundel, if this is an alternating spruce planks roundel, the average would be a spruce planks roundel**/
    Block GetAverage();
    /** The "Average" Roundel, if this is an alternating spruce planks roundel, the average would be a spruce planks roundel**/
    void SetAverage(Block Average);
    /** You will NEVER need to use this, this is ONLY for automatic roundel generation **/
    void SetIsAutomatic(boolean AutoYesOrNo);
    /** Getter for SetIsAutomatic, you'll also probably never need this but you also might at some point idk **/
    boolean IsAutoGenned();
}
