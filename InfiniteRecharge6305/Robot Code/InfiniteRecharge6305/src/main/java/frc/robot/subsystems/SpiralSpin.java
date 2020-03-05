/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SpiralSpin extends SubsystemBase {

  //Compressor c= new Compressor(Constants.compressorNumber);

  DoubleSolenoid doubleS = new DoubleSolenoid(Constants.doubleSolenoidPort1,Constants.doubleSolenoidPort2);



  

  //Spark spinner = new Spark(Constants.spinnerNumber);
  /**
   * Creates a new SpiralSpin.
   */
  public SpiralSpin() {

    

  }

  public void pushPull(int num){
    if(num == 0){
      doubleS.set(Value.kOff);
    }
    else if(num == 1){
      doubleS.set(Value.kForward);
    }else if(num == -1){
      doubleS.set(Value.kReverse);
    }
  }




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
