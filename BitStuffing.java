
import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data bits: ");
        String data = sc.nextLine();

        String flag = "01111110";
        StringBuilder stuffed = new StringBuilder();

        int count = 0;

        // Bit Stuffing
        for (int i = 0; i < data.length(); i++) {

            char bit = data.charAt(i);
            stuffed.append(bit);

            if (bit == '1') {
                count++;

                if (count == 5) {
                    stuffed.append('0');
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        // Add flags
        String frame = flag + stuffed + flag;

        System.out.println("\nOriginal Data: " + data);
        System.out.println("Stuffed Data: " + stuffed);
        System.out.println("Flag Pattern: " + flag);
        System.out.println("Transmitted Frame: " + frame);

        sc.close();
    }
}

