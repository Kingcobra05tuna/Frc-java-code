package frc.robot;

import frc.robot.commands.kiskacCmd;
import frc.robot.subsystems.kiskac;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  PS5Controller kumanda = new PS5Controller(0);
  kiskac kiskac = new kiskac();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
   new JoystickButton(kumanda , 1).whileTrue(new kiskacCmd(kiskac, 0.5));
   new JoystickButton(kumanda, 2).whileTrue(new kiskacCmd(kiskac, -0.35));
  }
}
