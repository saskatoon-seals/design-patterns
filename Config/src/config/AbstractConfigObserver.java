package config;

import java.util.Observable;
import java.util.Observer;

import org.w3c.dom.Document;

public abstract class AbstractConfigObserver implements Observer {
	ConfigSubject configSubject;
	
	public AbstractConfigObserver(ConfigSubject configSubject) {
		this.configSubject = configSubject;
	}

	@Override
	public void update(Observable configSubject, Object document) {
		if (isMySubject(configSubject)) {
			process((Document) document); 
		}
	}
	
	private boolean isMySubject(Observable configSubject) {
		return this.configSubject == configSubject;
	}
	
	abstract void process(Document document);
	abstract byte[] getResult();
}
