package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Gripers {
    final Servo leftGriper;
    final Servo rightGriper;
    Gamepad previous = new Gamepad();

    public Gripers(HardwareMap hwMap){
        leftGriper = hwMap.get(Servo.class, "leftGriper");
        rightGriper = hwMap.get(Servo.class, "rightGriper");
    }

    public void update(Gamepad pad) {
        if(pad.a && !previous.a){
            leftGriper.setPosition(0.5);
            rightGriper.setPosition(0.5);
        }
        else{
            leftGriper.setPosition(0);
            rightGriper.setPosition(0);
        }
        previous.copy(pad);
    }
}
