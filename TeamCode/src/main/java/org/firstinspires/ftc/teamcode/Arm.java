package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Arm {
    Servo placaj;
    Servo leftArm;
    Servo rightArm;
    boolean servoStateArm, servoStatePlacaj, lastLoopPress;

    public Arm(HardwareMap hwMap){
        placaj = hwMap.get(Servo.class, "placaj");
        leftArm = hwMap.get(Servo.class, "leftArm");
        rightArm = hwMap.get(Servo.class, "rightArm");

        servoStateArm = false;
        servoStatePlacaj = false;
        lastLoopPress = false;

    }

    public void update(Gamepad pad){
        if(pad.b && !lastLoopPress){
            servoStateArm = !servoStateArm;
            servoStatePlacaj = !servoStatePlacaj;
        }

        lastLoopPress = pad.b;

        if(servoStatePlacaj && servoStateArm){
            placaj.setPosition(1);
            rightArm.setPosition(0.75);
            leftArm.setPosition(0.75);
        }
        else{
            placaj.setPosition(0.4);
            rightArm.setPosition(0.25);
            leftArm.setPosition(0.25);
        }
    }
}
