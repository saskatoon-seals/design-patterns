package equipment;

public class Main {

	public static void main(String... args) {
		Equipment equipment = new Chassis();
		
		InventoryVisitor visitor = new InventoryVisitor();
		
		equipment.accept(visitor);
		
		System.out.println(String.format("Inventory %s %s", 
										  equipment.getName(), 
										  visitor.getInventory()));
	}
}
