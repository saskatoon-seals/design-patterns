
public class Caretaker {
	Memento memento;
	
	public Caretaker(Originator originator) {
		memento = originator.createMemento();
	}
	
	public void restoreOriginator(Originator originator) {
		originator.setMemento(memento);
	}
}
