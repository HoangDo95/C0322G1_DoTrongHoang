package bai_thi.khung.util;

import java.util.Scanner;

public class RegexException {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_NUM = "^[0-9]+$";
    private static final String REGEX_BIRTHDAY =
            "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static String inputName() {
        return RegexData.regexName(scanner.nextLine(), REGEX_STR);
    }

    public static String inputNumber() {
        return RegexData.regexNumber(scanner.nextLine(), REGEX_NUM);
    }

    public static String inputDayOfBirth() {
        return RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
    }


}
