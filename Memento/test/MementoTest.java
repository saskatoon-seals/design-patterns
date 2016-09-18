import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MementoTest {
	Caretaker caretaker;
	Originator originator;
	
	@Before
	public void setup() {
		originator = new Originator();
		caretaker = new Caretaker(originator);		
	}
	
	@Test
	public void undoesOriginatorStateAfterItsStateChanges() {
		State initialState = originator.state.copy();
		originator.operation();		
		
		assertNotEquals(initialState.getValue(), originator.state.getValue());
		caretaker.restoreOriginator(originator);		
		assertEquals(initialState.getValue(), originator.state.getValue());
	}
}
