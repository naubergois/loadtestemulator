package br.unifor.nauber;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class EmulateTimeResponse {
	
	
	public static HashMap<String,Integer> scenariosExecution;
	public static HashMap<String,List<Scenarios>> scenariosConfiguration;
	
	
	public EmulateTimeResponse() throws IOException{
		if (scenariosExecution==null){
			scenariosExecution=new HashMap<String,Integer>();
		}
		if (scenariosConfiguration==null){
			scenariosConfiguration=DecodeScenarios.getScenarios();
		}
	}
	
	
	public void chooseScenario(){
		int threadNumber=java.lang.Thread.activeCount();
		
		
		
	}
	
	
	public void emulate(String scenario,long time) throws InterruptedException{
		
	 
		
		
		Thread.sleep(time);
		
		
	}

}
