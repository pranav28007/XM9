
public class ByteStuffing {
    public static void main(String[] args) {

        String data = "HELLO DOODLE GOOGLE";
        char flag = 'F';
        char esc = 'E';

        StringBuilder frame = new StringBuilder();

        // Add starting flag
        frame.append(flag);

        // Perform byte stuffing
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            if (ch == flag || ch == esc) {
                frame.append(esc);
            }

            frame.append(ch);
        }

        // Add ending flag
        frame.append(flag);

        System.out.println("Original Data: " + data);
        System.out.println("Stuffed Frame: " + frame);
    }
}

