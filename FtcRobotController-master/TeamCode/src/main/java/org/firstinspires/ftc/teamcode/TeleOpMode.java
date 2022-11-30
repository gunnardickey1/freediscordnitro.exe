package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "TeleOp", group = "Main")
public class TeleOpMode extends OpMode {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor rearRight;
    private DcMotor rearLeft;
    // private Servo claw;
    // boolean open = false;
    boolean slow = false;
    private DcMotor magMotor;
    private DcMotor spinnerMotor;

    @Override
    public void init() {
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        rearRight = hardwareMap.dcMotor.get("rearRight");
        rearLeft = hardwareMap.dcMotor.get("rearLeft");
        // claw = hardwareMap.servo.get("claw");
        magMotor = hardwareMap.dcMotor.get("magMotor");
        spinnerMotor = hardwareMap.dcMotor.get("spinnerMotor");
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

        if ((y > 0.1 || y < -0.1) && (x < 0.15 && x > -0.15))  {
            if (!slow) {
                frontLeft.setPower(y);
                frontRight.setPower(-y);
                rearLeft.setPower(y);
                rearRight.setPower(-y);
            } else {
                frontLeft.setPower(y / 2);
                frontRight.setPower(-y / 2);
                rearLeft.setPower(y / 2);
                rearRight.setPower(-y / 2);
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            rearLeft.setPower(0);
            rearRight.setPower(0);
        }
        if ((x > 0.1 || x < -0.1) && (y < 0.15 && y > -0.15)) {
            if (!slow) {
                frontLeft.setPower(x);
                frontRight.setPower(x);
                rearLeft.setPower(-x);
                rearRight.setPower(-x);
            } else {
                frontLeft.setPower(x / 2);
                frontRight.setPower(x / 2);
                rearLeft.setPower(-x / 2);
                rearRight.setPower(-x / 2);
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            rearLeft.setPower(0);
            rearRight.setPower(0);
        }
        if (gamepad1.right_stick_x > 0.1 || gamepad1.right_stick_x < -0.1) {
            if (!slow) {
                frontLeft.setPower(-z);
                frontRight.setPower(-z);
                rearLeft.setPower(-z);
                rearRight.setPower(-z);
            } else {
                frontLeft.setPower(-z/2);
                frontRight.setPower(-z/2);
                rearLeft.setPower(-z/2);
                rearRight.setPower(-z/2);
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            rearLeft.setPower(0);
            rearRight.setPower(0);
        }
        if (gamepad1.right_trigger == 1.0) {
            magMotor.setPower(1);
        } else {
            magMotor.setPower(0);
        }
        /*
        if (gamepad1.a && open) {
            claw.setPosition(0);
            open = false;
        }
        if(gamepad1.b && !open){
            claw.setPosition(0.5);
            open = true;
        }
        if (gamepad1.y) {
            if (slow) {
                slow = false;
            } else {
                slow = true;
        }
        */
        if (gamepad1.left_trigger == 1.0) {
            spinnerMotor.setPower(-1);
        } else {
            spinnerMotor.setPower(0);
        }
    }
}