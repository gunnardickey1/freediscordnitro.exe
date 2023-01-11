package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "AutoRight", group = "Main")
// @Disabled
public class AutonomousRight extends OpMode {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
    private DcMotor lift;
    private Servo claw;
    private ColorSensor color;
    private double holdPosition;
    private double MIN_POSITION = 0, MAX_POSITION = 0;
    private boolean open = false;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init() {
        frontLeft = hardwareMap.dcMotor.get("leftFront");
        frontRight = hardwareMap.dcMotor.get("rightFront");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        lift = hardwareMap.dcMotor.get("lift");
        claw = hardwareMap.servo.get("claw");
        color = hardwareMap.colorSensor.get("color");

        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }
    @Override
    public void init_loop() {

    }
    @Override
    public void start() {
        frontLeft.setPower(-0.25);
        frontRight.setPower(0.25);
        backLeft.setPower(-0.25);
        backRight.setPower(0.25);
        runtime.reset();
        while (runtime.seconds() < 1.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(-0.5);
        frontRight.setPower(-0.5);
        backLeft.setPower(-0.5);
        backRight.setPower(-0.5);
        while (runtime.seconds() < 1.5) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(-1);
        frontRight.setPower(1);
        backLeft.setPower(-1);
        backRight.setPower(1);
        runtime.reset();
        while (runtime.seconds() < 2.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(0.5);
        frontRight.setPower(0.5);
        backLeft.setPower(0.5);
        backRight.setPower(0.5);
        while (runtime.seconds() < 1.5) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(-1);
        frontRight.setPower(1);
        backLeft.setPower(-1);
        backRight.setPower(1);
        runtime.reset();
        while (runtime.seconds() < 2.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        lift.setPower(1);
        while (runtime.seconds() < 2.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        lift.setPower(0);
        frontLeft.setPower(0.25);
        frontRight.setPower(-0.25);
        backLeft.setPower(0.25);
        backRight.setPower(-0.25);
        runtime.reset();
        while (runtime.seconds() < 2.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        lift.setPower(-1);
        while (runtime.seconds() < 2.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        lift.setPower(0);
        frontLeft.setPower(0.5);
        frontRight.setPower(0.5);
        backLeft.setPower(0.5);
        backRight.setPower(0.5);
        while (runtime.seconds() < 1.5) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(-0.25);
        frontRight.setPower(0.25);
        backLeft.setPower(-0.25);
        backRight.setPower(0.25);
        runtime.reset();
        while (runtime.seconds() < 2.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }
    @Override
    public void loop() {

    }

    @Override
    public void stop() {

    }
}