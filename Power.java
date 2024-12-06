public class Power {
    public static void main(String[] args) {
        int base = Input.readInt();
        int power = Input.readInt();
        Input.close();

        System.out.println(calculate(base, power));
    }

    static int calculate(int base, int power) {
        int result = 1;

        for(int i = 0; i<power; i++) {
            result *= base;
        }

        return result;
    }
}
