package config;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class MappingObserver extends AbstractConfigObserver {
	private byte[] documentBytes;
	
	public MappingObserver(ConfigSubject configSubject) {
		super(configSubject);
	}
	
	@Override
	void process(Document document) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		StreamResult result = new StreamResult(bos);
		
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();		
			
			transformer.transform(new DOMSource(document), result);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		this.documentBytes = bos.toByteArray();
	}
	
	@Override
	byte[] getResult() {
		return this.documentBytes;
	}
}
