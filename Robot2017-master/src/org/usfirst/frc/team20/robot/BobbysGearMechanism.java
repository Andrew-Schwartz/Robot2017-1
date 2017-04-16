package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class BobbysGearMechanism {
	DoubleSolenoid bobbyPiston;
	OperatorControls operator;
	GroundCollector collector;
	
	public BobbysGearMechanism(OperatorControls o, GroundCollector c) {
		bobbyPiston = new DoubleSolenoid(Constants.GEAR_EXTEND_PORT, Constants.GEAR_RETRACT_PORT);
		operator = o;
		collector = c;
	}

	public boolean intake(){
		collector.intake(1.0);
//		if(collector.collector.getOutputCurrent() > 25.0){ // TODO figure out what the current limit is
//			return true;
//		}
		return true;
	}
	
	public void outtake(){
		collector.outtake(1.0);	//TODO figure out optimal speed
	}
	
	public void retract(){
		bobbyPiston.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void extend(){
		bobbyPiston.set(DoubleSolenoid.Value.kForward);
	}
}