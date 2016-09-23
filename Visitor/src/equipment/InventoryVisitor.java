package equipment;

public class InventoryVisitor implements EquipmentVisitor {
	
	private Inventory inventory;
	
	public Inventory getInventory() {
		return inventory;
	}

	@Override
	public void visitFloppyDisk(FloppyDisk floppyDisk) {
		inventory.accumulate(floppyDisk);
	}

	@Override
	public void visitCard(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitChassis(Chassis chassis) {
		inventory.accumulate(chassis);		
	}

	@Override
	public void visitBus(Bus bus) {
		// TODO Auto-generated method stub
		
	}

}
