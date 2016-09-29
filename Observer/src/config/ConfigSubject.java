package config;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Observable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ConfigSubject extends Observable {
	Document document;
	
	//Method of interaction (changes state and notifies observers)
	void setDocument(byte[] documentBytes) {
		InputSource documentInputSource = new InputSource(new ByteArrayInputStream(documentBytes));
		
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			setDocument(documentBuilder.parse(documentInputSource));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	void setDocument(Document document) {
		this.document = document;
		
		this.setChanged();
		this.notifyObservers(document);
	}
}
