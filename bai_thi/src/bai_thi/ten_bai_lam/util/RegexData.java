package bai_thi.khung.util;

import bai_thi.khung.util.exception.AgeException;
import bai_thi.khung.util.exception.NameException;
import bai_thi.khung.util.exception.NumException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    public static Scanner scanner = new Scanner(System.in);
    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 20) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
                    }
                } else {
                    throw new AgeException("Đinh dạng nhập vào không đúng");
                }

            } catch (AgeException e){
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexName(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new NameException("Sai định dạng, Chữ cái đầu viết hoa ");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexNumber(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                } else {
                    throw new NumException("Sai định dạng, giá tiền phải là số dương");
                }
            } catch (NumException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
