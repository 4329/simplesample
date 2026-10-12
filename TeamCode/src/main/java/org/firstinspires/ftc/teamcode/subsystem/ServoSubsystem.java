package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class ServoSubsystem extends SubsystemBase {
    private final CRServo servo;

    public ServoSubsystem(HardwareMap hm) {
        this.servo = hm.get(CRServo.class, "servo");
    }

    public void move(double position) {
        servo.setPower(position);
    }
}
