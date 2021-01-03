package com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection.mission;

public class VietnamMission implements IMission{

	/*
	 * VietnamMission class implements IMission. This way VietnamMission class can   
	 * be injected to the Soldier class. See line 13 of MilitaryCampaign class. 
	 */
	
    public void executeMission(){ /* Implements the interface's abstract method.*/
        System.out.println("Executing Vietnam Mission...");
    }

}
