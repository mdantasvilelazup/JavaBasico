public class Fibbonaci {
    public static void main(String[] args) {
        int n = Input.readInt();
        Input.close();

        for(int i = 1; i<4 && i<=n; i++) {
            switch (i) {
                case 1:
                    print(0);
                    break;
                case 2, 3:
                    print(1);
                default:
                    break;
            }
        }

        if(n < 4) { return; }

        int number = 1;
        int prev = 1;
        int temp;

        for(int i = 3; i<n; i++) {
            temp = number;
            number += prev;
            prev = temp;
            print(number);
        }
    }

    static void print(int num) {
        System.out.print(num + ", ");
    }
}
