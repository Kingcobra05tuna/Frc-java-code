package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class kiskac extends SubsystemBase {
  SparkMax sparkcik = new SparkMax(1, MotorType.kBrushless);
  SparkMaxConfig sparkcigConfig = new SparkMaxConfig();
  public kiskac() {
    sparkcigConfig.inverted(true).idleMode(IdleMode.kBrake).smartCurrentLimit(30);
    sparkcik.configure(sparkcigConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  }

  public void setMotor(double speed) {
    sparkcik.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
