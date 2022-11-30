package org.firstinspires.ftc.teamcode;
<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java

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
=======
import com.qualcomm.robotcore.hardware.DcMotor; // allows us to make "DcMotor" objects
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode; // allows us to make "OpMode" objects
import com.qualcomm.robotcore.eventloop.opmode.TeleOp; // allows us to make "TeleOp" objects
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp(name="schizophrenic_ramblings", group="Main")
public class schizophrenic_ramblings extends OpMode {
    private DcMotor frontLeft; // Declares object for motor that turns front left wheel
    private DcMotor frontRight; // Declares object for motor that turns front right wheel
    private DcMotor rearRight; // Declares object for motor that turns back right wheel
    private DcMotor rearLeft;
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
    private Servo claw;
    boolean open = false;
    boolean slow = false;
    private DcMotor arm;
    //private DcMotor magMotor;
    //private DcMotor spinnerMotor; 

    @Override
    public void init() {
<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        arm = hardwareMap.dcMotor.get("arm");
=======
        frontLeft = hardwareMap.dcMotor.get("frontLeft"); // accesses front left motor
        frontRight = hardwareMap.dcMotor.get("frontRight"); // accesses front right motor
        rearRight = hardwareMap.dcMotor.get("rearRight"); // accesses back right motor
        rearLeft = hardwareMap.dcMotor.get("rearLeft"); // accesses back left motor
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
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

<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java
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
=======
        if ((y > 0.1 || y < -0.1) && (x < 0.15 && x > -0.15))  {
            if(!slow){
                frontLeft.setPower(y);
                frontRight.setPower(-y);
                rearLeft.setPower(y);
                rearRight.setPower(-y);}
            else{
                frontLeft.setPower(y/2);
                frontRight.setPower(-y/2);
                rearLeft.setPower(y/2);
                rearRight.setPower(-y/2);
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
            }
        } else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java
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
=======
        if ((x > 0.1 || x < -0.1) && (y < 0.15 && y > -0.15)){
            if(!slow){
                frontLeft.setPower(x);
                frontRight.setPower(x);
                rearLeft.setPower(-x);
                rearRight.setPower(-x);}
            else{
                frontLeft.setPower(x/2);
                frontRight.setPower(x/2);
                rearLeft.setPower(-x/2);
                rearRight.setPower(-x/2);
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
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
<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java
                backLeft.setPower(-z);
                backRight.setPower(-z);
            } else {
                frontLeft.setPower(-z / 2);
                frontRight.setPower(-z / 2);
                backLeft.setPower(z / 2);
                backRight.setPower(-z / 2);
=======
                rearLeft.setPower(-z);
                rearRight.setPower(-z);}
            else{
                frontLeft.setPower(-z/2);
                frontRight.setPower(-z/2);
                rearLeft.setPower(-z/2);
                rearRight.setPower(-z/2);
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
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
<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java
        if (gamepad1.a && open) {
            claw.setPosition(0);
            open = false;
=======
        if (gamepad1.a && open){

                claw.setPosition(0);
                open = false;
        }
        if(gamepad1.b && !open){

            claw.setPosition(0.5);
            open = true;
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
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
<<<<<<< HEAD:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/DriverControl.java
        if (gamepad1.dpad_up) {
            arm.setPower(1);
        } else if (gamepad1.dpad_down) {
            arm.setPower(-1);
        } else {
            arm.setPower(0);
        }
=======
        if(gamepad1.dpad_up){
            arm.setPower(1);
        }
        else if(gamepad1.dpad_down){
            arm.setPower(-1);
        }
        else
            arm.setPower(0);
>>>>>>> 47062bb3cd66e4d8d76f5cd67f2ef7044fa6deb9:FtcRobotController-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/schizophrenic_ramblings.java
    }
}