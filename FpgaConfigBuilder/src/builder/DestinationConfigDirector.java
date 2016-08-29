package builder;

import java.net.UnknownHostException;

import datastructures.FpgaConfig;

//e.g. enableMapping (output map part)
public class DestinationConfigDirector { 
	FpgaConfig create(int demodId) {
		ConfigBuilder configBuilder = new ConfigBuilder();
		
		configBuilder.buildConfig(demodId);												//1st step
		try {
			configBuilder.buildIpAddress("127.0.0.1");									//2nd step
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		configBuilder.buildMacAddress(new byte[] {0xA, 0xB, 0xC, 0xD, 0xE, 0xF});		//3rd step
		
		return configBuilder.getResult();												//last step!
	}
}
