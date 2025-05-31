public class UnicodeTest {

    public static void main(String[] arguments) {
        System.out.println("Mikus1");
        char letter = '\u0000';
        int counter = 0;
        while (letter < '\uFFFF') {
            // turns out Konsole can't print control characters, but VS Code terminal can
            if (Character.isISOControl(letter)) {
                letter++;
                continue;
            }
            System.out.print(letter);
            // System.out.printf("U+%04X: %c%n", (int) letter, letter);
            /*
             * "U+": Literal text: starts the output with U+ to resemble Unicode notation
             * like U+0041
             * "%X": Format the number as hexadecimal, using uppercase letters (A to F)
             * "04": Pad with leading zeroes so it's always 4 digits (e.g., 0041, 000A)
             * Example: if letter = 'A' (65 in decimal), this prints as 0041
             * ":": Just a literal colon and space for formatting
             * "%c": Print the value as a character.
             * "%n": Print a newline (platform-independent line break).
             */
            counter++;
            if (counter > 80) {
                System.out.println();
                counter = 0;
                System.out.print(letter / 80 + ": ");
            }
            letter++;
        }
    }
}
