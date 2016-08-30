package br.unifor.nauber;

import java.util.List;

public class Util {
	
	public static int searchResponseTime(List<Scenarios> list,int numberOfUsers ){
		
		int minDelta=0;
		int searchReturn=0;
		
		
		for (Scenarios scenarios : list) {
			
			int delta=scenarios.getUsers()-numberOfUsers;
			
			if ((delta<minDelta)&&(delta>0)){
				minDelta=delta;
				searchReturn=scenarios.getResponseTime();
			}
			
		}		
		
		return searchReturn;
		
		
	}

}
