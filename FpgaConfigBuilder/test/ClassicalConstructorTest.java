import static org.junit.Assert.*;

import java.net.InetAddress;
import org.junit.*;

import datastructures.*;

public class ClassicalConstructorTest {
	ClassicalConstruction classicalConstructor;
	public static final int DEMOD_ID = 255;
	public static final String HOST = "127.0.0.1";
	public static final byte[] MAC = {0xA, 0xB, 0xC, 0xD, 0xE, 0xF}; 
	
	@Before
	public void setup() {
		classicalConstructor = new ClassicalConstruction();
	}
	
	@Test
	public void testCreatesFpgaDestinationConfigSuccess() {
		FpgaConfig fpgaDestinationConfig = classicalConstructor.create(DEMOD_ID, HOST, MAC);
				
		InetAddress ipAddress = (InetAddress) fpgaDestinationConfig.getParam(IpAddress.class.getName()).getValue();
		String ipAddressValue = ipAddress.getHostAddress(); //Nice!
		assertEquals(HOST, ipAddressValue);
		
		//What to do with arrays?
		assertArrayEquals(MAC, (byte []) fpgaDestinationConfig.getParam(MacAddress.class.getName()).getValue()); //@TODO: think about representation
	}
}
