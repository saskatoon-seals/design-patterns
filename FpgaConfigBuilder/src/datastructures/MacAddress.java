package datastructures;

public class MacAddress extends ConfigParam {
	byte[] value;
	
	@Override
	public void setValue(Object value) {
		this.value = (byte[]) value;
	}
	
	@Override
	public byte[] getValue() {
		return value;
	}
}
