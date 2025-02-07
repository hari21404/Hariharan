package Weak2Task.PrimitiveandReferenceVariable;

enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class HolidayorNotHoliday {
    public static void checkHoliday(DaysOfWeek day) {
        if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
            System.out.println(day + ": Holiday");
        } else {
            System.out.println(day + ": Not Holiday");
        }
    }

    public static void main(String[] args) {
        checkHoliday(DaysOfWeek.MONDAY);
        checkHoliday(DaysOfWeek.SATURDAY);
        checkHoliday(DaysOfWeek.WEDNESDAY);
        checkHoliday(DaysOfWeek.SUNDAY);
    }

}
