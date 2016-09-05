//Adapts/converts TextView's interface to conform with Shape's

package adapter.inheritance;

import adapter.datastructures.Coordinate;
import adapter.datastructures.Manipulator;
import adapter.datastructures.Point;
import adapter.datastructures.Shape;
import adapter.datastructures.TextManipulator;
import adapter.datastructures.TextView;

//publicly inherits Shape and privately TextView (inherits it's implementation)
public class TextShape extends TextView implements Shape {
	
	//----------------------------Shape------------------------------------
	
	public void BoundingBox(Point bottomLeft, Point topRight) {
		Coordinate bottom, left, width, height;
		
		bottom = new Coordinate();
		left = new Coordinate();
		width = new Coordinate();
		height = new Coordinate();
		
		getOrigin(bottom, left);
		getExtent(width, height);
		
		bottomLeft = new Point(bottom, left);
		topRight = new Point(bottom.add(height), left.add(width));		
	}
	
	//Factory method that returns Manipulator type specialized for Text
	public Manipulator createManipulator() {
		return new TextManipulator();
	}
	
	//---------------------------TextView-----------------------------------
	
	@Override
	protected boolean isEmpty() {
		return !TextView.containsElements();
	}
}
