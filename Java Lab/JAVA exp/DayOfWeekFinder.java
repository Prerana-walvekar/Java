import java.time.*;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DayOfWeekFinder YYYY-MM-DD");
            return;
        }

        String inputDate = args[0];

        if (!isValidDate(inputDate)) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            return;
        }

        LocalDate date = LocalDate.parse(inputDate);
        String dayOfWeek = date.getDayOfWeek().toString();
        System.out.println("The day of the week for " + inputDate + " is " + dayOfWeek);
    }

    private static boolean isValidDate(String dateStr) {
        if (dateStr.length() != 10) return false;
        if (dateStr.charAt(4) != '-' || dateStr.charAt(7) != '-') return false;

        String[] parts = dateStr.split("-");
        if (parts.length != 3) return false;

        for (String part : parts) {
            if (!part.matches("\\d+")) return false;
        }

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return month >= 1 && month <= 12 && day >= 1 && day <= 31;
    }
}
