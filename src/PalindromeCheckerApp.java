public static void uc8_LinkedListMethod() {

    String input = "refer";

    LinkedList<Character> list = new LinkedList<>();

    for(char c : input.toCharArray()){
        list.add(c);
    }

    boolean isPalindrome = true;

    int left = 0;
    int right = list.size() - 1;

    while(left < right){
        if(!list.get(left).equals(list.get(right))){
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }

    System.out.println("UC8 Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome + "\n");
}
