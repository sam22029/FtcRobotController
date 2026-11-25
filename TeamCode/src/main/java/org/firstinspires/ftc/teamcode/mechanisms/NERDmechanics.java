package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class NERDmechanics {

    private DcMotor linearSlideMotor0;

    public void init(HardwareMap hwMap) {

        linearSlideMotor0 = hwMap.get(DcMotor.class,"linearSlideMotor0");
        linearSlideMotor0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

public void setLinearSlideMotor0(double speed){

        linearSlideMotor0.setPower(speed);
}
}
