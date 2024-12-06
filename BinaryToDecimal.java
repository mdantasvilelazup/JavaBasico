public class BinaryToDecimal {
    public static void main(String args[]) {
        String binary = Input.readString();
        Input.close();

        int number = 0;
        for(int i = 0; i<binary.length(); i++) {
            char digitChar = binary.charAt(i);
            String digitString = String.valueOf(digitChar);

            int digit = Integer.parseInt(digitString);
            if(digit < 1) { continue; }

            int power = binary.length() - i - 1;

            number += Power.calculate(2, power);
        }

        System.out.println(number);
    }
}