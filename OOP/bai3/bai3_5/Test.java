package bai3.bai3_5;

public class Test {
    public static void main(String[] args) {
                MyDate date = new MyDate(2021, 2, 28);
                System.out.println("Ngày hiện tại: " + date);

                date.nextDay();
                System.out.println("Ngày sau: " + date);

                date.previousDay();
                date.previousDay();
                System.out.println("Ngày trước: " + date);
            }
        }

