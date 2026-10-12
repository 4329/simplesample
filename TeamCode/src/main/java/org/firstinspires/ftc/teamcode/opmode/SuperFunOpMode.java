package org.firstinspires.ftc.teamcode.opmode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.command.ServoCommand;
import org.firstinspires.ftc.teamcode.subsystem.MotorSubsystem;
import org.firstinspires.ftc.teamcode.subsystem.ServoSubsystem;

@TeleOp(name = "super duper fun op mode")
public class SuperFunOpMode extends CommandOpMode {
    private GamepadEx operator;
    private ServoSubsystem servoSubsystem = null;
    private MotorSubsystem motorSubsystem = null;
    private ServoCommand servoCommand = null;

    @Override
    public void initialize() {
        this.servoSubsystem = new ServoSubsystem(hardwareMap);
        this.operator = new GamepadEx(gamepad2);
        this.servoCommand = new ServoCommand(servoSubsystem);
        this.motorSubsystem = new MotorSubsystem(hardwareMap);

        operator.getGamepadButton(GamepadKeys.Button.B).whenPressed(servoCommand);
        operator.getGamepadButton(GamepadKeys.Button.A).whenPressed(new InstantCommand(() -> servoSubsystem.move(-1)));

        operator.getGamepadButton(GamepadKeys.Button.X).whenPressed(new InstantCommand(() -> motorSubsystem.move(-.5)));
        operator.getGamepadButton(GamepadKeys.Button.Y).whenPressed(new InstantCommand(() -> motorSubsystem.move(.5)));


    }
}
