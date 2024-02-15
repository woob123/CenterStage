package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class Intake {
    final Aspirator aspirator;
    final Gripers gripers;
    public Intake(HardwareMap hm){
        aspirator = new Aspirator(hm);
        gripers = new Gripers(hm);
    }

    public void update(Gamepad pad){
        aspirator.update(pad);
        gripers.update(pad);
    }
}
