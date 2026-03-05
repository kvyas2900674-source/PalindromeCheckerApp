public static boolean checkPalindrome(String str, int start, int end) {

    if (start >= end)
        return true;

    if (str.charAt(start) != str.charAt(end))
        return false;

    return checkPalindrome(str, start + 1, end - 1);
}

public static void uc9_RecursiveMethod() {

    String input = "refer";

    boolean result = checkPalindrome(input, 0, input.length() - 1);

    System.out.println("UC9 Input : " + input);
    System.out.println("Is Palindrome? : " + result + "\n");
}
