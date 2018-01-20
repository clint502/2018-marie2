package org.usfirst.frc.team4931.robot.commands;

import org.usfirst.frc.team4931.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OpenGrabber extends Command {
	
	public OpenGrabber() {
		requires(Robot.grabber);
		setInterruptible(false);
	}

	@Override
	public void start() {
		Robot.grabber.captureCube();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
