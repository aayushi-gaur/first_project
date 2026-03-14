package firstjavapackage;

public class TimeUnitConverter {
    public static int convertHoursToMinutes(int hours) {
        if (hours < 0) {
            return -1;
        }
        return hours * 60;
    }

    public static int convertDaysToMinutes(int days) {
        if (days < 0) {
            return -1;
        }
        return days * 24 * 60;
    }

    public static void main(String[] args) {
        TimeUnitConverter t = new TimeUnitConverter();
        System.out.println(t.convertHoursToMinutes(120));
        System.out.println(t.convertDaysToMinutes(12));
    }
}