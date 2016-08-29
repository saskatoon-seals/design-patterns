import java.net.InetAddress;
import java.net.UnknownHostException;

import datastructures.ConfigParam;
import datastructures.FpgaConfig;
import datastructures.IpAddress;
import datastructures.MacAddress;

public class ClassicalConstruction {
	public FpgaConfig create(int demodId, String host, byte[] mac) {
		FpgaConfig fpgaConfig = new FpgaConfig(demodId);
		
		//IP Address
		try {
			ConfigParam ipAddress = new IpAddress();		
			ipAddress.setValue(InetAddress.getByName(host));			
			fpgaConfig.addParam(ipAddress.getClass().getName(), ipAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//MAC Address
		ConfigParam macAddress = new MacAddress();
		macAddress.setValue(mac);
		fpgaConfig.addParam(macAddress.getClass().getName(), macAddress);
		
		return fpgaConfig;
	}
}
