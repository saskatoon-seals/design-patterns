
public class Main {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance().getValue());
		
		Singleton.getInstance().setValue(10);
		
		System.out.println(Singleton.getInstance().getValue());
	}
}
