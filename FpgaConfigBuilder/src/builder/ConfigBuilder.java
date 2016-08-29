package builder;

import java.net.InetAddress;
import java.net.UnknownHostException;

import datastructures.ConfigParam;
import datastructures.FpgaConfig;
import datastructures.IpAddress;
import datastructures.MacAddress;

public class ConfigBuilder {
	FpgaConfig fpgaConfig;
	
	void buildConfig(int demodId) {
		fpgaConfig = new FpgaConfig(demodId);
	}
	
	void buildIpAddress(String host) throws UnknownHostException {
		ConfigParam ipAddress = new IpAddress();
		ipAddress.setValue(InetAddress.getByName(host));
		fpgaConfig.addParam(IpAddress.class.getName(), ipAddress);
	}
	
	void buildMacAddress(byte[] mac) {
		ConfigParam macAddress = new MacAddress();
		macAddress.setValue(mac);
		fpgaConfig.addParam(MacAddress.class.getName(), macAddress);
	}
	
	FpgaConfig getResult() {
		return fpgaConfig;
	}
}