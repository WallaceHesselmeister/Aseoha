package com.code.aseoha.Helpers;

import net.minecraft.util.math.vector.Vector3d;

public interface IHelpWithMonitor {
    void Aseoha$SetRot(float rot);

    float Aseoha$GetRot();

    static float Aseoha$MonitorGetRot(Vector3d vec) {
        float hype = (float) Math.sqrt(vec.x * vec.x + vec.z * vec.z);
        float rot;
        double deg = Math.toDegrees(Math.asin(vec.x / hype));
        if (vec.z < 0)
            rot = (float) deg;
        else rot = -(float) deg - 180;
        rot = (rot + 180);
        if (rot < 0)
            rot = rot + 360;
        if (rot < 30 || rot >= 330) rot = 0;
        if (rot >= 30 && rot < 90) rot = 60;
        if (rot >= 90 && rot < 150) rot = 120;
        if (rot >= 150 && rot < 210) rot = 180;
        if (rot >= 210 && rot < 270) rot = -120;
        if (rot >= 270) rot = -60;
        return rot;
        //301   -60
        //235   -120
        //175    120
        //119    120
        //M 62   0 SHOULD BE: 60
        //2      0
        //180
        //STUCK ON: 178
    }
}
