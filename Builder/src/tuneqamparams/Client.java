package tuneqamparams;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TuneQamParams tuneQamParams = new TuneQamParams();
		InputMap inputMap = new InputMap(56333200, QamOrder.QAM_256);
		
		Mapping mapping = new Mapping(inputMap, tuneQamParams);
		mapping.buildTuneQamParams();
		
		//Get result from builder (with the expected datatypes)
		System.out.println(tuneQamParams.getFrequency());
		System.out.println(tuneQamParams.getQamOrder());
	}

}
