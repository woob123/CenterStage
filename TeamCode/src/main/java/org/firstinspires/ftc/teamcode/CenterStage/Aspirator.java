package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Aspirator {
    final DcMotor aspiratorMotor;
    public Aspirator(HardwareMap hwMap){
        aspiratorMotor = hwMap.get(DcMotor.class , "Aspirator");
        aspiratorMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        aspiratorMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void update(Gamepad pad) {
        if(pad.right_trigger != 0){
            aspiratorMotor.setPower(pad.right_trigger);
        }
    }
}
