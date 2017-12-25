package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NullableStreams {
	
	public static void main(String[] args) {
		Map<Integer,	String>	weekDays	=	new	HashMap<>();
		weekDays.put(1,	"Domingo");
		weekDays.put(2,	"Segunda");
		weekDays.put(3,	"Terça");
		weekDays.put(4,	"Quarta");
		weekDays.put(5,	"Quinta");
		weekDays.put(6,	"Sexta");
		weekDays.put(7,	"Sábado");
		weekDays.put(8,	null);
		
		List<String>	dayNames = weekDays
				.entrySet()
				.stream()
				.flatMap(e	->	Stream.of(e.getValue()))
//				.flatMap(e	->	Stream.ofNullable(e.getValue()))
				.map(s	->	s.substring(0,3))
				.collect(Collectors.toList());
		
		System.out.println(dayNames);
	}

}
