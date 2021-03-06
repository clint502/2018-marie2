package org.usfirst.frc.team4931.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4931.robot.commands.ChangeGear;
import org.usfirst.frc.team4931.robot.commands.ChangeGrabberState;
import org.usfirst.frc.team4931.robot.commands.ResetGrabber;
import org.usfirst.frc.team4931.robot.enums.Gear;
import org.usfirst.frc.team4931.robot.enums.GrabberState;

public class OperatorInput {

  private Joystick joystick;

  public OperatorInput() {
    joystick = new Joystick(RobotMap.JOYSTICK.getValue());

    /* Grabber */
    Button grabberOpen = new JoystickButton(joystick, 1);
    grabberOpen.whenPressed(new ChangeGrabberState(GrabberState.OPENED));
    Button grabberClose = new JoystickButton(joystick, 2);
    grabberClose.whenPressed(new ChangeGrabberState(GrabberState.CLOSED));
    Button grabberReset = new JoystickButton(joystick, 7);
    grabberReset.whenPressed(new ResetGrabber());
    Button shiftLow = new JoystickButton(joystick, 11);
    shiftLow.whenPressed(new ChangeGear(Gear.LOW));
    Button shiftHigh = new JoystickButton(joystick, 12);
    shiftHigh.whenPressed(new ChangeGear(Gear.HIGH));

    /* Grabber Position*/
    //    RobotMap[] grabberPositions = {
    //      RobotMap.GRABBER_POSITION_FORWARD_DOWN,
    //      RobotMap.GRABBER_POSITION_FORWARD_STRAIGHT,
    //      RobotMap.GRABBER_POSITION_FORWARD_SWITCH,
    //      RobotMap.GRABBER_POSITION_VERTICAL,
    //      RobotMap.GRABBER_POSITION_BACKWARD_SWITCH,
    //      RobotMap.GRABBER_POSITION_BACKWARD_STRAIGHT,
    //      RobotMap.GRABBER_POSITION_BACKWARD_DOWN
    //    };
    //    for (RobotMap grabberPosition : grabberPositions) {
    //      Button button = new JoystickButton(joystick, grabberPosition.getValue());
    //      button.whenPressed(
    //          new
    // ChangeGrabberPosition(GrabberPosition.valueOf(grabberPosition.name().substring(17))));
    //    }

    /* Shifting */

  }

  public Joystick getJoystick() {
    return joystick;
  }
}
