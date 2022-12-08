// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  Compressor compressor = new Compressor(14, PneumaticsModuleType.REVPH);

  public Pneumatics() {
    System.out.println("Pneumatics Subsystem Initialized");
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Pressure: ", compressor.getPressure());
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void run() {
    compressor.enableAnalog(60, 120);
    System.out.println("Run Method exeuted");
  }
}
