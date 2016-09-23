package equipment;

import java.util.Currency;

public abstract class Equipment {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public abstract Watt getPower();
	public abstract Currency getNetPrice();
	public abstract Currency getDiscountPrice();
	
	public abstract void accept(EquipmentVisitor visitor);
}
