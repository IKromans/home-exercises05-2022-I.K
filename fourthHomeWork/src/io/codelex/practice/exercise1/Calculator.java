package io.codelex.practice.exercise1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculator {
    private String startDate;
    private String endDate;
    private final int workHours = 8;

    public Calculator(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        calculateWorkingDays();
    }

    public void calculateWorkingDays() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Calendar start = Calendar.getInstance();
            start.setTime(sdf.parse(startDate));
            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(endDate));
            int workingDays = 0;
            while (!start.after(end)) {
                int day = start.get(Calendar.DAY_OF_WEEK);
                if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
                    workingDays++;
                start.add(Calendar.DATE, 1);
            }
            System.out.println("There is " + workingDays * workHours + " work hours in this period.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
