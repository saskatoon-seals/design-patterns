package datastructures;

import java.net.InetAddress;

public class IpAddress extends ConfigParam {
	InetAddress value;
	
	@Override
	public void setValue(Object value) {
		this.value = (InetAddress) value;
	}
	
	@Override
	public InetAddress getValue() {
		return value;
	}
}
