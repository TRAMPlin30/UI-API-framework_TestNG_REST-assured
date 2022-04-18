package testApi.registration.validDataForRegistration;

import java.security.SecureRandom;

public class PasswordData {

    static String  charUpperCase = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
    static String charLowerCase = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String symbols = "!@#$%^&*()_+-=";

    static SecureRandom random = new SecureRandom();


    public static String upperSymbol() {
        StringBuilder upperSymbol = new StringBuilder();
            char ch = charUpperCase.charAt(random.nextInt(charUpperCase.length()));
            upperSymbol.append(ch);
            return upperSymbol.toString();
    }

    public static String lowerSymbol() {
        StringBuilder lowerSymbol = new StringBuilder();
        char ch = charLowerCase.charAt(random.nextInt(charLowerCase.length()));
        lowerSymbol.append(ch);
        return lowerSymbol.toString();
    }

    public static String numberSymbol() {
        StringBuilder numberSymbol = new StringBuilder();
        char ch = numbers.charAt(random.nextInt(numbers.length()));
        numberSymbol.append(ch);
        return numberSymbol.toString();
    }

    public static String symbolsSymbol() {
        StringBuilder symbolsSymbol = new StringBuilder();
        char ch = symbols.charAt(random.nextInt(symbols.length()));
        symbolsSymbol.append(ch);
        return symbolsSymbol.toString();
    }
}
