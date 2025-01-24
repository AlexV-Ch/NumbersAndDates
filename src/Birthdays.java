import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthdays {
    public static String collectBirthdays(int year, int month, int day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E");
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        String text = "";
        int i = 0;
        text = i + " - " + formatter.format(birthday) + System.lineSeparator();

        while (birthday.isBefore(today)) {
            birthday = birthday.plusYears(1);
            text = text + ++i + " - " + formatter.format(birthday) + System.lineSeparator();

        }
        return text;
    }
}
