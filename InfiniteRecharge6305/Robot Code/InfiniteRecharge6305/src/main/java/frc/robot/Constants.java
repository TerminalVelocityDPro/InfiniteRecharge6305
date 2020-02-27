/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DigitalSource;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final double EncoderDistancePerPulse = 0;
	public static int frontLeftMotor = 1;
	public static int backLeftMotor = 4;
	public static int frontRightMotor = 2;
	public static int backRightMotor = 3;
	public static int spinnerNumber ;
	public static int shooterNumber = 6;
	public static int rotatorNumber = 8;
	public static int ballPutterNumber = 7;
	
	public static int climbMotor1Number;
	public static int climbMotor2Number;
	public static final double ksVolts = 0;
	public static final double kvVoltSecondsPerMeter = 0;
	public static final double kaVoltSecondsSquaredPerMeter = 0;

	public static final double kPDriveVel = 8.5;
	public static final double kTrackwidthMeters = 0.69;
	public static final DifferentialDriveKinematics kDriveKinematics = new DifferentialDriveKinematics(kTrackwidthMeters);

	public static final double kMaxSpeedMetersPerSecond = 0;
	public static final double kMaxAccelerationMetersPerSecondSquared = 3;

	public static final double kRamseteB = 0;
	public static final double kRamseteZeta = 0;


	
	

}
