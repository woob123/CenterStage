package org.firstinspires.ftc.teamcode.CenterStage;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

@TeleOp
public class Main extends LinearOpMode {

    @Override
    public void runOpMode(){
        IMU imu = hardwareMap.get(IMU.class, "imu");
        IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.RIGHT));
        imu.initialize(parameters);
        Drivetrain drive = new Drivetrain(hardwareMap);
        Intake intake = new Intake(hardwareMap);
        Outtake outtake = new Outtake(hardwareMap);
        Avion avion = new Avion(hardwareMap);
        waitForStart();

        if(isStopRequested()) return;

        while(opModeIsActive()) {
            drive.update(gamepad1, imu);
            intake.update(gamepad1);
            outtake.update(gamepad1);
            avion.update(gamepad1);
        }
    }
}
