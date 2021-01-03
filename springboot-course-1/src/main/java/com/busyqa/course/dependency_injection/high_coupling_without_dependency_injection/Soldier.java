package com.busyqa.course.dependency_injection.high_coupling_without_dependency_injection;

import com.busyqa.course.dependency_injection.high_coupling_without_dependency_injection.mission.KoreaMission;
import com.busyqa.course.dependency_injection.high_coupling_without_dependency_injection.mission.VietnamMission;

public class Soldier {
	
	/*
	 * There is high coupling between Soldier and his Missions. If we need to add
	 * a new mission, we need to modify the Soldier class to add more Missions.
	 */
	
	/*
	 * 1st. Korea Mission
	 */
	
    KoreaMission km = new KoreaMission(); /* High Coupling */

    public void goToKoreaMision(){
        km.executeKoreaMision();
    }

	/*
	 * 2nd. Vietnam Mission
	 */
    
    VietnamMission vm = new VietnamMission(); /* High Coupling */
    
    public void goToVietnamMision(){
    	km.executeKoreaMision();
    }
    
}
