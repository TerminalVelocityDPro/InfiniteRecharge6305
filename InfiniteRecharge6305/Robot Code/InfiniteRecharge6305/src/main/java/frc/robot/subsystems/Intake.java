/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  Spark rotator = new Spark(Constants.rotatorNumber);
  Spark ballPutter = new Spark(Constants.ballPutterNumber);
  /**
   * Creates a new Intake.
   */
  public Intake() {

  }

  public void suckIn(double speed){
    ballPutter.set(speed);
  }


  public void moveUp(double speed){
    rotator.set(speed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
