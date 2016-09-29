package config;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConfigTests {
	private static final byte[] DOCUMENT_BYTES = "<xml></xml>".getBytes(); 
	
	private ConfigSubject configSubject;
	private RfSwitchObserver rfSwitchObserver;
	private MappingObserver mappingObserver;
	
	@Before
	public void setup() {
		configSubject = new ConfigSubject();
		rfSwitchObserver = new RfSwitchObserver(configSubject);
		mappingObserver = new MappingObserver(configSubject);
		
		configSubject.addObserver(rfSwitchObserver);
		configSubject.addObserver(mappingObserver);
	}
	
	@Test
	public void setDocumentUpdatesMappingAndRfSwitchObservers() {		
		configSubject.setDocument(DOCUMENT_BYTES);		
		
		assertArrayEquals(DOCUMENT_BYTES, mappingObserver.getResult());
		assertArrayEquals(DOCUMENT_BYTES, rfSwitchObserver.getResult());		
	}
}
