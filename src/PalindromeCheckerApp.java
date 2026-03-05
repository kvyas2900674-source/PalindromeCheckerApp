interface PalindromeStrategy {
    boolean check(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

public static void uc12_StrategyMethod() {

    String input = "refer";

    PalindromeStrategy strategy = new StackStrategy();  // choose algorithm

    boolean result = strategy.check(input);

    System.out.println("UC12 Input : " + input);
    System.out.println("Is Palindrome? : " + result + "\n");
}
