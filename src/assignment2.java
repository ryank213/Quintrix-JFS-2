import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class assignment2 {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		ZonedDateTime laTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime koreaTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy E hh:mm:ss a");
		
		String laText = laTime.format(dateFormat);
		System.out.println(laText + " [" + laTime.getZone().toString() + "]");
		String parisText = parisTime.format(dateFormat);
		System.out.println(parisText + " [" + parisTime.getZone().toString() + "]");
		String koreaText = koreaTime.format(dateFormat);
		System.out.println(koreaText + " [" + koreaTime.getZone().toString() + "]");
		
		System.out.println("\nCurrent Time (Los Angeles): \n" + laText);
		String addEightLaText = laTime.plusHours(8).format(dateFormat);
		System.out.println("Current Time +8 Hours: \n" + addEightLaText);

		System.out.println();
		Human bob = new Human("Bob",24);
		Eatable lambdaEatable = () -> System.out.println("Mmmm yummy food");
		eatFood(lambdaEatable);
	}
	
	static void eatFood(Eatable food) {
		food.eat();
	}

}
