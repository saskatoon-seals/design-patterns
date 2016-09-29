package config;

import org.w3c.dom.Document;

public class RfSwitchObserver extends AbstractConfigObserver {
	private byte[] documentBytes;
	
	public RfSwitchObserver(ConfigSubject configSubject) {
		super(configSubject);
	}
	
	@Override
	void process(Document document) {
		
	}
	
	@Override
	byte[] getResult() {
		return this.documentBytes;
	}
}
