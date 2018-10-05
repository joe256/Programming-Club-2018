import java.util.Scanner;
public class Problem1 {
    private static String isPositional(String original, String test) {
        int match= 0;
        int pointer1= 0;
        int pointer2 = 0;
        if(original.length() != test.length()){return "They are not positional.";}
        for (int x = 0; x < original.length(); x++) {
            if (original.charAt(pointer1) == test.charAt(pointer2)) {
                match++;
                pointer1=(pointer1 + 1) % original.length();
                pointer2 = (pointer2 + 1) % test.length();
                for (int y = 0; y < test.length()-1; y++) {
                    if (original.charAt(pointer1) == test.charAt(pointer2)) {
                        match++;
                        pointer1=(pointer1 + 1) % original.length();
                        pointer2 = (pointer2 + 1) % test.length();
                    } else {
                        match = 0;
                        pointer1 = 0;
                        break;
                    }
                }
            }
            else {
                pointer2 = (pointer2 + 1) % test.length();
            }
            if(match==original.length()){return "They are positional.";}
        }
        return "They are not positional.";
    }
    public static void main(String[] args){
        String ask="y";
        Scanner scan = new Scanner(System.in);
        while (ask.equalsIgnoreCase("y")){
            System.out.print("Enter ur first #:");
            String  input1= scan.next();
            System.out.print("Enter ur second #:");
            String input2 = scan.next();
            System.out.println(Problem1.isPositional(input1,input2));
            System.out.println("Try again? y/n");
            ask=scan.next();
        }






    }
}