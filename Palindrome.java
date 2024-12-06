public class Palindrome {
    public static void main(String[] args) {
        String input = Input.readString();
        Input.close();
        
        int last = input.length() - 1;
        boolean isPalindrome = true;

        for(int i = 0; i*2 < input.length(); i++) {
            if(input.charAt(i) == input.charAt(last - i)) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
