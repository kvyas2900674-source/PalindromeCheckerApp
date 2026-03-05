class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        String rev = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(rev);
    }
}

public static void uc11_OOPMethod() {

    String input = "refer";

    PalindromeChecker checker = new PalindromeChecker();

    boolean result = checker.checkPalindrome(input);

    System.out.println("UC11 Input : " + input);
    System.out.println("Is Palindrome? : " + result + "\n");
}
