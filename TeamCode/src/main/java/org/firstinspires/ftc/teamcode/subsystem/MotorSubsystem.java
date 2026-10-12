package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {
    private DcMotorEx motor;

    public MotorSubsystem(HardwareMap hm) {
        this.motor = hm.get(DcMotorEx.class, "motor");
    }

    public void move(double power) {
        this.motor.setPower(power);
    }
}
