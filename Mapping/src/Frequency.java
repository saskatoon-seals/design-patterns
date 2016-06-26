
public class Frequency extends MappingComponent {
	FrequencyData frequency;
	
	Frequency(Double frequency) {
		this.frequency = new FrequencyData(frequency);
	}
	
	FrequencyData getData() {
		return this.frequency;
	}
}
