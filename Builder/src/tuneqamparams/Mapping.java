package tuneqamparams;
//Director - knows the rules of how to build the final object
public class Mapping {

	private InputMap inputMap;
	private TuneQamParams tuneQamParams;
	
	public Mapping(InputMap inputMap, TuneQamParams tuneQamParams) {
		this.inputMap = inputMap;
		this.tuneQamParams = tuneQamParams;
	}
	
	void buildTuneQamParams() {
		for(MapComponent mapComponentName : inputMap.components.keySet()) {
			tuneQamParams.setTuneQamParam(mapComponentName, inputMap.components.get(mapComponentName));
		}
	}
}

//THIS FUNCTION IS REPLACED WITH THE FUNCTION ABOVE:
//void buildTuneQamParams() {
//	tuneQamParams.setFrequency(inputMap.getFrequency());
//	tuneQamParams.setQamOrder(inputMap.getQamOrder());
//}