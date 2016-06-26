import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<MappingComponent> mappingComponents = new LinkedList<MappingComponent>();
		
		mappingComponents.add(new QamOrder(QamOrderData.QAM_256));
		mappingComponents.add(new Frequency(11.12));
		
		for (MappingComponent mappingComponent : mappingComponents) {
			System.out.println(mappingComponent.getData());
		}
	}

}
