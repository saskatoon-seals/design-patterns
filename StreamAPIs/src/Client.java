import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> squareNumbers = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		
		squareNumbers.forEach(System.out::println);
	}

}
