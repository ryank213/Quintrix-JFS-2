import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class assignment2 {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		ZonedDateTime laTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime koreaTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));	
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy E hh:mm:ss a");
		
		String laText = laTime.format(dateFormat);
		System.out.println(laText + " [" + laTime.getZone().toString() + "]");
		String parisText = parisTime.format(dateFormat);
		System.out.println(parisText + " [" + parisTime.getZone().toString() + "]");
		String koreaText = koreaTime.format(dateFormat);
		System.out.println(koreaText + " [" + koreaTime.getZone().toString() + "]");
		
		System.out.println("\nCurrent Time (Los Angeles): \n" + localDateTime.format(dateFormat));
		System.out.println("Current Time +8 Hours: \n" + localDateTime.plusHours(8).format(dateFormat));

		System.out.println();
		Human bob = new Human("Bob",24);
		bob.eat();
		Eatable lambdaEatable = () -> System.out.println("Mmmm yummy food");
		eatFood(lambdaEatable);
		
		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("John");
		names.add("Joy");
		
		long count = names.stream().filter(str->str.length()<4).count();
		System.out.println(count + " names with less than 4 characters");
	}
	
	static void eatFood(Eatable food) {
		food.eat();
	}
}
