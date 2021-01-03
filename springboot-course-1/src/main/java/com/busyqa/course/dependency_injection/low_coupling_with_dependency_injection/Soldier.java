package com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection;

import com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection.mission.IMission;

public class Soldier {
	
	/*
	 * There is low coupling between Soldier and his Missions. If we need to add
	 * a new mission, we no longer need to modify the Soldier class. We need to
	 * inject the desired mission through the setMission() method.
	 */
	
    IMission mission = null; /* Low Coupling, any mission implementing IMission 
                              * can be injected. 
                              */

    public void setMission(IMission mission) { /* Injects the Dependency */
        this.mission = mission; 
    }

    public void goToMission(){ /* Executes the mission injected to Soldier*/
    	this.mission.executeMission();
    }

}
