
public class Button extends Widget {

	public Button(DialogManager manager) {
		super(manager);
	}

	@Override
	public void handleMouse(MouseEvent event) {
		changed();
	}

}
