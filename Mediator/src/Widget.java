
public abstract class Widget {
	
	private DialogManager manager;
	
	public Widget(DialogManager manager) {
		this.manager = manager;
	}
	
	public void changed() {
		manager.widgetChanged(this);
	}
	
	public abstract void handleMouse(MouseEvent event);
}
