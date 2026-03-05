public static void uc13_PerformanceComparison() {

    String input = "refer";

    long start = System.nanoTime();

    boolean result = input.equals(new StringBuilder(input).reverse().toString());

    long end = System.nanoTime();

    System.out.println("UC13 Input : " + input);
    System.out.println("Is Palindrome? : " + result);
    System.out.println("Execution Time (ns) : " + (end - start) + "\n");
}
