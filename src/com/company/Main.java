package com.company;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

import static com.company.Day.TUESDAY;
import static java.time.DayOfWeek.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter day of WEEK!");
            String input = scanner.next();

            if (input.toUpperCase().equals(Day.MONDAY.name())) {
                System.out.println("Дүйшөмбү Кундун сабагы жава жана софт скилл\n");
            } else if (input.toUpperCase().equals(Day.TUESDAY.name())) {
                System.out.println("Шейшемби Кундун сабагы практика жана англиский\n");
            } else if (input.toUpperCase().equals(Day.WEDNESDAY.name())) {
                System.out.println("Шаршемби Кундун сабагы жава жана софт скилл\n");
            } else if (input.toUpperCase().equals(Day.THURSDAY.name())) {
                System.out.println("Бейшенби Кундун сабагы практика жана англиский\n");
            } else if (input.toUpperCase().toUpperCase().equals(Day.FRIDAY.name())) {
                System.out.println("Жума Кундун сабагы жава жана софт скилл\n");

            } else if (input.toUpperCase().equals(Day.SATURDAY.name())) {
                System.out.println("Ишемби куну сабак  жок демалыш\n");

            } else if (input.toUpperCase().equals(Day.SUNDAY.name())) {

                System.out.println("Жекшемби куну сабак  жок демалыш\n");
            } else if (input.toUpperCase().equals("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("жуманын кунун туура жазыныз!\n");
            }
        }




    }
}
