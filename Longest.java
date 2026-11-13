import java.util.Arrays;
public class Longest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Max <Strings>");
            return;
        }
        String big = "", first = args[0];
        for (String arg : args) {
            if (arg.length() > big.length()) {
                big = arg;
            }
            if (first.compareToIgnoreCase(arg)>0) {
				first = arg;
			}
        }

        System.out.println("Longest: " + big + " (" + big.length() + ")");
        System.out.println("First alphabetically: " + first);
    }
}
