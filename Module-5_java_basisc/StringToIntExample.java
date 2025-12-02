public class StringToIntExample {
    public static void main(String[] args) {
        String name;
        if (args.length >= 1) {
            name = args[0];
        } else {
            name = "abc"; 
        }

        try {
            String firstThree = name.substring(0, 3);
            int val = Integer.parseInt(firstThree);
            System.out.println("Parsed value: " + val);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: input too short: '" + name + "'");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: cannot convert first 3 characters to integer: '" + name.substring(0, Math.min(3, name.length())) + "'");
        }
    }
}
