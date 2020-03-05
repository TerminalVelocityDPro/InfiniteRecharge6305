/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
//import frc.robot.XboxController;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.AutoDrive;
import frc.robot.commands.ComplexAuto1;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.MoveShooter;
import frc.robot.commands.Shoot;
import frc.robot.commands.Spin;
import frc.robot.commands.TankDrive;
import frc.robot.commands.intakeUp;
import frc.robot.commands.suckIn;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.SpiralSpin;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final DriveTrain m_robotDrive = new DriveTrain();
  private final Shooter shooter = new Shooter();
  private final SpiralSpin spinner = new SpiralSpin();
  private final Intake intake = new Intake();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  public static Joystick leftJoystick = new Joystick(0);
  public static Joystick rightJoystick = new Joystick(1);

  public static XboxController xbox = new XboxController(2);
  




  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    
    // Configure the button bindings
    configureButtonBindings();

    m_robotDrive.setDefaultCommand(new TankDrive(m_robotDrive, 
    () -> leftJoystick.getY(), 
    () -> rightJoystick.getY()));

    spinner.setDefaultCommand(new Spin(spinner, 0));



    

    
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //new JoystickButton(xbox, Button.kA.value)
        //.whenPressed(new Shoot(shooter, 0.5));
   // new JoystickButton(xbox, Button.kB.value).whenPressed(new suckIn(intake, 0.5));
    //new JoystickButton(xbox, Button.kX.value).whenPressed(new suckIn(intake, -0.5));

    new JoystickButton(xbox, Button.kA.value).whileHeld(new Shoot(shooter, 0.75));
    new JoystickButton(xbox, Button.kB.value).whileHeld(new Shoot(shooter, -0.75));
    new JoystickButton(xbox, Button.kA.value).whenInactive(new Shoot(shooter, 0));
    new JoystickButton(xbox, Button.kB.value).whenInactive(new Shoot(shooter, 0));
    //new JoystickButton(xbox, Button.kStart.value).whenPressed(new Spin(spinner, 0));
    //new JoystickButton(xbox, Button.kX.value).whileHeld(new suckIn(intake, 1));  
    //new JoystickButton(xbox, Button.kX.value).whenInactive(new suckIn(intake, 0));  
    //new JoystickButton(xbox, Button.kY.value).whileHeld(new suckIn(intake, -1));
    //new JoystickButton(xbox, Button.kY.value).whenInactive(new suckIn(intake, 0));

    new JoystickButton(xbox, Button.kX.value).whenPressed(new Spin(spinner, 1));
    new JoystickButton(xbox, Button.kY.value).whenPressed(new Spin(spinner, -1));
    //new JoystickButton(xbox, , buttonNumber)
    //new JoystickButton(xbox, Button.kBumperLeft.value).whileHeld(new MoveShooter(intake, 0.5));
    new JoystickButton(xbox, Button.kBumperLeft.value).whileHeld(new intakeUp(intake, 0.5, 1));
    new JoystickButton(xbox, Button.kBumperLeft.value).whenInactive(new intakeUp(intake, 0, 0));
    //new JoystickButton(xbox, Button.kBumperRight.value).whileHeld(new MoveShooter(intake, -0.5));
    new JoystickButton(xbox, Button.kBumperRight.value).whileHeld(new intakeUp(intake, -0.5, -1));
    new JoystickButton(xbox, Button.kBumperRight.value).whenInactive(new intakeUp(intake, 0, 0));
    new JoystickButton(xbox, Button.kStart.value).whileHeld(new suckIn(intake, 0));
    new JoystickButton(xbox, Button.kStart.value).whileHeld(new MoveShooter(intake, 0));
    //new JoystickButton(xbox, Button.k)
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    SequentialCommandGroup drive = new ComplexAuto1(m_robotDrive, shooter);
    return drive;
  }
}
