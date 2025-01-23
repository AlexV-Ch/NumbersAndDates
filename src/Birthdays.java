import java.time.LocalDate;

public class Birthdays {
    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        System.out.println(birthday);
        while (birthday.isBefore(today)) {
            birthday = birthday.plusYears(1);
            System.out.println(birthday);
        }
        return "---";
    }
}
