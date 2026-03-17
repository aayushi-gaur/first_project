package firstjavapackage.runner;

import firstjavapackage.TimeOperations;

public class TimeOperationsRunner {

    public static void main(String[] args) {

        TimeOperations tif = new TimeOperations();

        tif.isWeekDay();
        tif.determineNameofMonth();
        tif.determineNameOfDay();

        TimeOperations t = new TimeOperations();
        System.out.println(t.convertHoursToMinutes(120));
        System.out.println(t.convertDaysToMinutes(12));
    }
}
