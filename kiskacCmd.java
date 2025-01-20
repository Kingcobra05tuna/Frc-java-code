package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.kiskac;

public class kiskacCmd extends Command {
  kiskac mKiskac;
  double mSpeed;
  public kiskacCmd(kiskac sparkcik, double speed) {
    this.mKiskac = sparkcik;
    this.mSpeed = speed;
    addRequirements(mKiskac);
    // Use addRequirements() here to declare subsystem dependencies. 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mKiskac.setMotor(mSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mKiskac.setMotor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
