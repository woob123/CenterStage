package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Avion {
    Servo avion;

    public Avion(HardwareMap hwMap){
        avion = hwMap.get(Servo.class, "Avion");
    }

    public void update(Gamepad pad){
        if(pad.x){
            avion.setPosition(1);
        }
    }
}
