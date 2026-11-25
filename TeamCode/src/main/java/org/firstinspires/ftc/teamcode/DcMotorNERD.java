package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.NERDmechanics;
@TeleOp
public class DcMotorNERD extends OpMode {


     NERDmechanics bench = new NERDmechanics();

    @Override
    public void init(){
      bench.init(HardwareMap);

    }
    @Override
    public void loop(){

     bench.setLinearSlideMotor0(0.5);
    }



}
