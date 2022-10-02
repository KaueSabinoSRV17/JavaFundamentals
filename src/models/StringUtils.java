package models;

import java.math.BigDecimal;
import java.util.Scanner;

public class StringUtils {


    private final Scanner keyboard = new Scanner(System.in);

    public String stringInput(String text) {
        System.out.println(text);
        return keyboard.next();
    }

    public Integer intInput(String text) {
        System.out.println(text);
        return keyboard.nextInt();
    }

    public BigDecimal bigDecimalInput(String text) {
        System.out.println(text);
        return keyboard.nextBigDecimal();
    }
}
