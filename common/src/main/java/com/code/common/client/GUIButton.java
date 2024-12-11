package com.code.common.client;

import net.minecraft.util.FastColor;

public class GUIButton {
    private final int PosX, PosY, SizeXMin, SizeYMin, SizeXMax, SizeYMax, Padding, ARGB32;
    private int R, G, B, A;

    private final String ID, Text;

    public GUIButton(String ID, String Text, int PosX, int PosY, int SizeXMin, int SizeYMin, int SizeXMax, int SizeYMax, int Padding, int R, int G, int B, int A) {
        this.Text = Text;
        this.Padding = Padding;
        this.ID = ID;
        this.PosX = PosX;
        this.PosY = PosY;
        this.SizeYMin = SizeYMin;
        this.SizeYMax = SizeYMax;
        this.SizeXMax = SizeXMax;
        this.SizeXMin = SizeXMin;
        this.R = R;
        this.G = G;
        this.B = B;
        this.A = A;
        this.ARGB32 = FastColor.ARGB32.color(R, G, B, A);
    }

    public GUIButton(String ID, String Text, int PosX, int PosY, int SizeXMin, int SizeYMin, int SizeXMax, int SizeYMax, int Padding, int argb32) {
        this.Text = Text;
        this.Padding = Padding;
        this.ID = ID;
        this.PosX = PosX;
        this.PosY = PosY;
        this.SizeYMin = SizeYMin;
        this.SizeYMax = SizeYMax;
        this.SizeXMax = SizeXMax;
        this.SizeXMin = SizeXMin;
        this.ARGB32 = argb32;
    }

    public int GetPadding() {
        return this.Padding;
    }

    public int GetARGB32() {
        return this.ARGB32;
    }

    public String GetText() {
        return this.Text;
    }

    public GUIButton Get() {
        return this;
    }

    public int GetPosX() {
        return this.PosX;
    }

    public int GetPosY() {
        return this.PosY;
    }

    public int GetSizeXMin() {
        return this.SizeXMin;
    }

    public int GetSizeYMin() {
        return this.SizeYMin;
    }

    public int GetSizeXMax() {
        return this.SizeXMax;
    }

    public int GetSizeYMax() {
        return this.SizeYMax;
    }

    public int GetR() {
        return this.R;
    }

    public int GetG() {
        return this.G;
    }

    public int GetB() {
        return this.B;
    }

    public int GetA() {
        return this.A;
    }

    public String GetID() {
        return this.ID;
    }
}