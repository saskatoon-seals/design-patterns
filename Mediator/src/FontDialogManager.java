
public class FontDialogManager extends DialogManager {

	Widget listBox, entryField, button;
	
	public FontDialogManager() {
		createWidgets();
	}
	
	@Override
	public void showDialog() {
		// TODO Auto-generated method stub
	}

	//@TODO: Solve the problem without violating OCP and keep the mediator philosophy! 
	@Override
	public void widgetChanged(Widget widget) {
		// Violation of OCP!
		if (widget == listBox) {
			
		} else if (widget == entryField) {
			
		} else if (widget == button) {
			
		}
	}

	@Override
	protected void createWidgets() {
		listBox = new ListBox(this);
		entryField = new EntryField(this);
		button = new Button(this);
	}
}
