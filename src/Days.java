public enum Days {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
    ;
    private int day;

    Days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public  void run() {
        switch (this.day) {
            case 1 -> System.out.println(MONDAY);
            case 2 -> System.out.println(TUESDAY);
            case 3 -> System.out.println(WEDNESDAY);
            case 4 -> System.out.println(THURSDAY);
            case 5 -> System.out.println(FRIDAY);
            case 6 -> System.out.println(SATURDAY);
            case 7 -> System.out.println(SUNDAY);
        }
    }

}
