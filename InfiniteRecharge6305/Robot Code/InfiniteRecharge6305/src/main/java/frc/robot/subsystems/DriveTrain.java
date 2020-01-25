/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
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

  CANSparkMax frontLeft = new CANSparkMax(Constants.frontLeftMotor, null);
  CANSparkMax backLeft = new CANSparkMax(Constants.backLeftMotor, null);
  private final SpeedControllerGroup m_leftMotors = new SpeedControllerGroup(frontLeft, backLeft);
  CANSparkMax frontRight = new CANSparkMax(Constants.frontRightMotor, null);
  CANSparkMax backRight = new CANSparkMax(Constants.backRightMotor, null);
  private final SpeedControllerGroup m_rightMotors = new SpeedControllerGroup(frontRight, backRight);

  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

  private final Encoder m_leftEncoder = new Encoder(Constants.leftEncoderPorts[0], Constants.leftEncoderPorts[1], Constants.leftEncoderReversed);

  


  public static DriveTrain instance = new DriveTrain();

  public static DriveTrain getInstance(){
    return instance;
  }

  public void drive(double leftSpeed, double rightSpeed){
    frontLeft.set(leftSpeed);
    backLeft.set(leftSpeed);
    backRight.set(rightSpeed);
    frontRight.set(rightSpeed);
  }

  

  
  
  public DriveTrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
