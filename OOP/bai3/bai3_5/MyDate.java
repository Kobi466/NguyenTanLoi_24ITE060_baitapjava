package bai3.bai3_5;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    private static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }


    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Ngày không hợp lệ");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            return day <= (isLeapYear(year) ? 29 : 28);
        }
        return day <= DAYS_IN_MONTHS[month - 1];
    }


    public int getDayOfWeek(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.get(Calendar.DAY_OF_WEEK) - 1;
    }


    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }


    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }


    @Override
    public String toString() {
        return String.format("%s %02d %s %d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }


    public MyDate nextDay() {
        day++;
        if (day > DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0)) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            year++;
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();
            day = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        return this;
    }

    public MyDate previousYear() {
        year--;
        return this;
    }
}