package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class ServoSubsystem extends SubsystemBase {
    private Servo servo = null;

    public ServoSubsystem(HardwareMap hm) {
        this.servo = hm.get(Servo.class, "servo");
    }

    public void move(double position) {
        servo.setPosition(position);
    }
}
