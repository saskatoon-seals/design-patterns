package tuneqamparams;
import java.util.EnumMap;

public class InputMap {
	EnumMap<MapComponent, Object> components;
	
	public InputMap(Integer frequency, QamOrder qamOrder) {
		components = new EnumMap<>(MapComponent.class);
		
		components.put(MapComponent.FREQUENCY, frequency);
		components.put(MapComponent.QAM_ORDER, qamOrder);
	}
}
