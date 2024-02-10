package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Outtake{
    Arm arm;
    Lift lift;

    public Outtake(HardwareMap hwMap){
        arm = new Arm(hwMap);
        lift = new Lift(hwMap);
    }

    public void update(Gamepad pad){
        arm.update(pad);
        lift.update(pad);
    }

}
