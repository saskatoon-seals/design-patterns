package equipment;

import java.util.Currency;

public class PricingVisitor implements EquipmentVisitor {

	private Currency total;
	
	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		total = floppyDisk.getNetPrice();
	}

	@Override
	public void visitCard(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitChassis(Chassis chassis) {
		total = chassis.getDiscountPrice();
	}

	@Override
	public void visitBus(Bus bus) {
		// TODO Auto-generated method stub
		
	}
	
}
