import java.util.AbstractMap;
import java.util.HashMap;

public class FontDialogManager extends DialogManager {

	Widget listBox, entryField, button;
	
	AbstractMap<Widget, Command> processors = new HashMap<>();
	
	public FontDialogManager() {
		createWidgets();
		processors.put(button, new ButtonCommand());
		processors.put(entryField, new EntryFieldCommand());
	}
	
	@Override
	public void showDialog() {
		// TODO Auto-generated method stub
	}

	//@TODO: Solve the problem without violating OCP and keep the mediator philosophy! 
	@Override
	public void widgetChanged(Widget widget) {
		processors.get(widget).execute();
	}

	@Override
	protected void createWidgets() {
		listBox = new ListBox(this);
		entryField = new EntryField(this);
		button = new Button(this);
	}
}
