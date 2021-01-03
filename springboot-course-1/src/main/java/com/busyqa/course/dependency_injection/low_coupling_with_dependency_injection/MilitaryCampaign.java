package com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection;

import com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection.mission.IMission;
import com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection.mission.KoreaMission;
import com.busyqa.course.dependency_injection.low_coupling_with_dependency_injection.mission.VietnamMission;

public class MilitaryCampaign {

    public static void main(String[] args) {

    	/*
    	 * As you might notice here. Soldier class doesn't need to be modified to
    	 * add new missions. We only need inject the desired mission to the Soldier 
    	 * object using the method "soldier.setMission()". See lines 24 and 33.
    	 */
        Soldier soldier = new Soldier();

    	/*
    	 * 1st. Korea Mission
    	 */
        
        IMission km = new KoreaMission(); /* KoreaMission Creation. */

        soldier.setMission(km);
        soldier.goToMission();

    	/*
    	 * 2nd. Vietnam Mission
    	 */
        
        IMission vm = new VietnamMission(); /* VietnamMission Creation. */

        soldier.setMission(vm);
        soldier.goToMission();


    }

}
