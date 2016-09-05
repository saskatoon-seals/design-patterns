package adapter.composition;

import adapter.datastructures.Coordinate;
import adapter.datastructures.Manipulator;
import adapter.datastructures.Point;
import adapter.datastructures.Shape;
import adapter.datastructures.TextManipulator;
import adapter.datastructures.TextView;

public class TextShape implements Shape {
	
	private TextView textView;
	
	//This adapter works with all of the subclasses of TextView (higher flexibility)
	public TextShape(TextView textView) {
		this.textView = textView;
	}
	
	public void BoundingBox(Point bottomLeft, Point topRight) {
		Coordinate bottom, left, width, height;
		
		bottom = new Coordinate();
		left = new Coordinate();
		width = new Coordinate();
		height = new Coordinate();
		
		textView.getOrigin(bottom, left);
		textView.getExtent(width, height);
		
		bottomLeft = new Point(bottom, left);
		topRight = new Point(bottom.add(height), left.add(width));
	}
	
	public Manipulator createManipulator() {
		return new TextManipulator();
	}
}
