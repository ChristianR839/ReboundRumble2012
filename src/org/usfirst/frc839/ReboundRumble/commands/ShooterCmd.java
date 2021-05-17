// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc839.ReboundRumble.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc839.ReboundRumble.Robot;
import org.usfirst.frc839.utility.UniversalJoystick;

/**
 *
 */
public class  ShooterCmd extends Command 
{
    public ShooterCmd() 
    {
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        UniversalJoystick js1 = Robot.oi.getJoystick1();
        UniversalJoystick js2 = Robot.oi.getJoystick2();
        
        // if either joystick says to spill the shooter, do it.
        
        if ((js1.triggers() > 0.25) || (js2.triggers() > 0.25))
            Robot.shooter.Forward();
        else if ((js1.triggers() < -0.25) || (js2.triggers() > -0.25))
            Robot.shooter.Reverse();
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }
    
    // Called once after isFinished returns true
    protected void end() 
    {
        Robot.shooter.Stop();
    }
    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
        end();
    }
}
