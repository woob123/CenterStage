package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Lift {
    DcMotor liftMotor;
    public Lift(HardwareMap hwMap){
        liftMotor = hwMap.get(DcMotor.class, "lift motor");
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void update(Gamepad gm){

    }
}
