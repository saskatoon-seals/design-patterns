package equipment;

import java.util.Currency;

public class FloppyDisk extends Equipment {

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
		visitor.visitFloppyDisk(this);
	}

}
