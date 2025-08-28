package tama.Misc;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CommonRotations {
    Zero(0x0),
    FortyFive(0x2D),
    Ninty(0x5A),
    OneEighty(0xB4),
    TwoSeventy(0x10E),
    ThreeSixty(0x168);
    public final float rot;
}
