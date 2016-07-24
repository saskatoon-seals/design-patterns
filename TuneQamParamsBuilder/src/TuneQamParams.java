//This is a BUILDER class, that is not building another object, but rather itself.

import java.util.EnumMap;

public class TuneQamParams {
	private EnumMap<MapComponent, Object> parameters;
	
	public TuneQamParams() {
		parameters = new EnumMap<>(MapComponent.class);
	}
	
	//Build method:
	void setTuneQamParam(MapComponent paramName, Object paramValue) {
		parameters.put(paramName, paramValue);
	}
	
	//The reset: getter methods
	Integer getFrequency() {
		return (Integer) parameters.get(MapComponent.FREQUENCY);
	}
	
	QamOrder getQamOrder() {
		return (QamOrder) parameters.get(MapComponent.QAM_ORDER);
	}
}
