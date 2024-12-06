package Software.ulpgc.kata5;

public class DayOfYearAdapter {
    private static final int[] daysInMonth = {
    31, 20, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String converDayTodDate(int dayOfyear){
        int month = 0;
        int dayOfMonth = dayOfyear;

        while(dayOfMonth > daysInMonth[month]){
            dayOfMonth -= daysInMonth[month];
            month++;
        }

        return String.format("%d de %s", dayOfMonth, getMonth(month));
    }

    private static String getMonth(int month) {
        String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return months[month];
    }
}
