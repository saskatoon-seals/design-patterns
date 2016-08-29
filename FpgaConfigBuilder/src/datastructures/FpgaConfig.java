package datastructures;

import java.util.AbstractMap;
import java.util.HashMap;

public class FpgaConfig {
	Short demodId;	
	AbstractMap<String, ConfigParam> params = new HashMap<>(); 
	
	//*********************************************************************************************
	//									Constructors
	//*********************************************************************************************
	
	public FpgaConfig(short demodId) {
		this.demodId = demodId;
	}
	
	public FpgaConfig(int demodId) {
		this((short) demodId);
	}
	
	//**********************************************************************************************
	//										APIs
	//**********************************************************************************************
	
	public void addParam(String name, ConfigParam value) {
		if (!params.containsKey(name)) {
			params.put(name, value);
		}
	}
	
	public ConfigParam getParam(String name) {
		return params.get(name);
	}
}
