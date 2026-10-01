package org.firstinspires.ftc.teamcode.opmode;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.command.ServoCommand;
import org.firstinspires.ftc.teamcode.subsystem.ServoSubsystem;

public class SuperFunOpMode extends CommandOpMode {
    private GamepadEx operator;
    private ServoSubsystem servoSubsystem = null;
    private ServoCommand servoCommand = null;

    @Override
    public void initialize() {
        this.servoSubsystem = new ServoSubsystem(hardwareMap);
        this.operator = new GamepadEx(gamepad2);
        this.servoCommand = new ServoCommand(servoSubsystem);

        operator.getGamepadButton(GamepadKeys.Button.B).whenPressed(servoCommand);
    }
}
