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

/**
 *
 */

public class  ConveyorReverse extends Command 
{
    public ConveyorReverse() 
    {
        requires(Robot.conveyor);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() 
    {
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        Robot.conveyor.Reverse();
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }
    
    // Called once after isFinished returns true
    protected void end() 
    {
        Robot.conveyor.Stop();
    }
    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
        end();
    }
}
