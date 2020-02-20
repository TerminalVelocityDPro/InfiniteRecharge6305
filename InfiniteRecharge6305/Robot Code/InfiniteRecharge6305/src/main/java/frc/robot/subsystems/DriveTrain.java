/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
//import edu.wpi.first.wpilibj.SpeedControllerGroup;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.TankDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  CANSparkMax frontLeft = new CANSparkMax(Constants.frontLeftMotor, MotorType.kBrushless);
  CANSparkMax backLeft = new CANSparkMax(Constants.backLeftMotor, MotorType.kBrushless);
  //private final SpeedControllerGroup m_leftMotors = new SpeedControllerGroup(frontLeft, backLeft);
  CANSparkMax frontRight = new CANSparkMax(Constants.frontRightMotor, MotorType.kBrushless);
  CANSparkMax backRight = new CANSparkMax(Constants.backRightMotor, MotorType.kBrushless);
  //private final SpeedControllerGroup m_rightMotors = new SpeedControllerGroup(frontRight, backRight);

  //private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

 


  


  

  

  
  
  public DriveTrain() {
    

  }

  public void drive(double left, double right){
    frontLeft.set(-left);
    backLeft.set(-left);
    frontRight.set(right);
    backRight.set(right);

    //m_drive.tankDrive(left, right);
  }

  

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}
