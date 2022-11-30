package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "DriverControl", group = "Main")
// @Disabled
public class DriverControl extends OpMode {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
    private DcMotor arm;
    private Servo claw;
    boolean open = false;
    boolean slow = false;
    // private DcMotor magMotor;
    // private DcMotor spinnerMotor;

    @Override
    public void init() {
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        arm = hardwareMap.dcMotor.get("arm");
        claw = hardwareMap.servo.get("claw");
        // magMotor = hardwareMap.dcMotor.get("magMotor");
        // spinnerMotor = hardwareMap.dcMotor.get("spinnerMotor");

    }

    @Override
    public void init_loop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        float x = gamepad1.left_stick_x;
        float y = gamepad1.left_stick_y;
        float z = gamepad1.right_stick_x;

        if ((y > 0.1 || y < -0.1) && (x < 0.15 && x > -0.15)) {
            if (!slow) {
                frontLeft.setPower(y);
                frontRight.setPower(-y);
                backLeft.setPower(y);
                backRight.setPower(-y);
            } else {
                frontLeft.setPower(y / 2);
                frontRight.setPower(-y / 2);
                backLeft.setPower(y / 2);
                backRight.setPower(-y / 2);
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if ((x > 0.1 || x < -0.1) && (y < 0.15 && y > -0.15)) {
            if (!slow) {
                frontLeft.setPower(x);
                frontRight.setPower(x);
                backLeft.setPower(-x);
                backRight.setPower(-x);
            } else {
                frontLeft.setPower(x / 2);
                frontRight.setPower(x / 2);
                backLeft.setPower(-x / 2);
                backRight.setPower(-x / 2);
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad1.right_stick_x > 0.1 || gamepad1.right_stick_x < -0.1) {
            if (!slow) {
                frontLeft.setPower(-z);
                frontRight.setPower(-z);
                backLeft.setPower(-z);
                backRight.setPower(-z);
            } else {
                frontLeft.setPower(-z / 2);
                frontRight.setPower(-z / 2);
                backLeft.setPower(z / 2);
                backRight.setPower(-z / 2);
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad1.right_trigger == 1.0) {
            // magMotor.setPower(-1);
        } else {
            // magMotor.setPower(0);
        }
        if (gamepad1.a && open) {
            claw.setPosition(0);
            open = false;
        }
        if (gamepad1.b && !open) {

            claw.setPosition(0.5);
            open = true;
        }
        if (gamepad1.y) {
            if (slow) {
                slow = false;
            } else {
                slow = true;
            }
        } else {
            // spinnerMotor.setPower(0);
        }
        if (gamepad1.dpad_up) {
            arm.setPower(1);
        } else if (gamepad1.dpad_down) {
            arm.setPower(-1);
        } else {
            arm.setPower(0);
        }
    }
}