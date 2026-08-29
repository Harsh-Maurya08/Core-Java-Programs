package Packages.Challenges.Challenge97.EnumsEnhance;

public enum WeekDays {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false) ;

    private final boolean isWeekday;

    WeekDays(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }
}
