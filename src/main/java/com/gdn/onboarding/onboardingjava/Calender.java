package com.gdn.onboarding.onboardingjava;

public class Calender {

    private final int month;

    public Calender(int month) {

        this.month = month;
    }

    public String showMonth() throws Exception{
        switch(month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                throw new Exception();
        }
    }
}