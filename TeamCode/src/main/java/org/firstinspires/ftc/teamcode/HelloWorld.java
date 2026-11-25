package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled

@Autonomous


public class HelloWorld extends OpMode {

    @Override
    public void init_loop() {
        telemetry.addData("Hello","Sam");
    }

    @Override
    public void loop() {

    }
}
