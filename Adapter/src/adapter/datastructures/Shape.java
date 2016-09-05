package adapter.datastructures;

public interface Shape {

	void BoundingBox(Point bottomLeft, Point topRight);
	Manipulator createManipulator(); //Factory method
}
