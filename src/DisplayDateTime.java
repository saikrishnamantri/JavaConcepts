import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDateTime {
    public static void main(String[] args) {
        //Get current date
        LocalDateTime now = LocalDateTime.now();

        //Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("Current Date and Time: " + formattedDateTime);

        //Print individual parts
        System.out.println("Date: " + now.toLocalDate());
        System.out.println("Time: " + now.toLocalTime());
        System.out.println("Day of Week: " + now.getDayOfWeek());
    }
}
