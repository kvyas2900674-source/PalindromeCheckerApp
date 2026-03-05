public static void uc10_CaseInsensitiveMethod() {

    String input = "Never Odd Or Even";

    String normalized = input.replaceAll("\\s+", "").toLowerCase();

    boolean isPalindrome = normalized.equals(
            new StringBuilder(normalized).reverse().toString()
    );

    System.out.println("UC10 Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome + "\n");
}
