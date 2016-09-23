package equipment;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Chassis extends Equipment {
	
	List<Equipment> parts = new ArrayList<>();

	@Override
	public Watt getPower() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Currency getNetPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Currency getDiscountPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		parts.forEach(part -> part.accept(visitor));
	}

}
