package org.usfirst.frc.team4931.robot;

import org.usfirst.frc.team4931.robot.enums.Gear;
import org.usfirst.frc.team4931.robot.enums.GrabberPosition;
import org.usfirst.frc.team4931.robot.enums.GrabberState;

public enum RobotMap {

  /* Input */
  JOYSTICK(0),

  DRIVETRAIN_SHIFT_GEAR_TOGGLE(1),

  GRABBER_TOGGLE(2),

  GRABBER_POSITION_FORWARD_DOWN(7),
  GRABBER_POSITION_FORWARD_STRAIGHT(8),
  GRABBER_POSITION_FORWARD_SWITCH(9),
  GRABBER_POSITION_VERTICAL(3),
  GRABBER_POSITION_BACKWARD_SWITCH(12),
  GRABBER_POSITION_BACKWARD_STRAIGHT(11),
  GRABBER_POSITION_BACKWARD_DOWN(10),

  //  /* Motors */
  //  MOTOR_DT_FRONT_LEFT(1),
  //  MOTOR_DT_FRONT_RIGHT(3),
  //  MOTOR_DT_BACK_LEFT(2),
  //  MOTOR_DT_BACK_RIGHT(4),

  /* Motors */
  MOTOR_DT_FRONT_LEFT(2), // 2
  MOTOR_DT_FRONT_RIGHT(1), // 1
  MOTOR_DT_BACK_LEFT(4),
  MOTOR_DT_BACK_RIGHT(3), // 3

  MOTOR_GRABBER(7),

  /* Grabber Config */

  /* The maximum distance the grabber can go to*/
  GRABBER_CONFIG_POSITION_MAX(2276),

  /* The travel speed of the grabber in distance per 100 milliseconds */
  GRABBER_CONFIG_CRUISE_VELOCITY(RobotMap.GRABBER_CONFIG_POSITION_MAX.getValue() / 10),

  /* Figure out this some other time */
  GRABBER_CONFIG_ACCELERATION(RobotMap.GRABBER_CONFIG_POSITION_MAX.getValue() / 3 / 10),

  /* Pneumatic */
  COMPRESSOR(6),

  /* GearBox */
  GEARBOX_1(5),
  GEARBOX_2(4),

  /* Grabber */
  GRABBER_1(6),
  GRABBER_2(7),

  GRABBER_LIMIT_FORWARD(0),
  GRABBER_LIMIT_REVERSE(1);

  public static GrabberPosition defaultGrabberPosition = GrabberPosition.VERTICAL;
  public static GrabberState defaultGrabberState = GrabberState.CLOSED;
  public static Gear defaultGear = Gear.LOW;

  private int value;

  RobotMap(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
