import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        System.out.print("Enter its base (2, 8, 10, or 16): ");
        int base = input.nextInt();

        int value = Integer.parseInt(number, base);

        int unsignedValue = value;

        if (value < 0) {
            unsignedValue = value + 256;
        }

        int signedValue = unsignedValue;

        if (unsignedValue >= 128) {
            signedValue = unsignedValue - 256;
        }

        String binary =
                Integer.toBinaryString(unsignedValue);

        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Unsigned decimal: " + unsignedValue);
        System.out.println("Signed decimal: " + signedValue);
        System.out.println(
                "Octal: " + Integer.toOctalString(unsignedValue));
        System.out.println(
                "Hexadecimal: "
                        + Integer.toHexString(unsignedValue)
                                .toUpperCase());

        input.close();
    }
}
