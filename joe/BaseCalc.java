import java.util.Scanner;
//Group project Started by Joe
public class BaseCalc {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = 0;
        while(a != -1){
            String[] argz = (input.nextLine()).split(" ");//Read new line and Split that into tokens
            String[] num1 = argz[0].split("_");//Grab left and right of underscore
            String[] num2 = argz[2].split("_");//Grab left and right of underscore
            if(num1[1].equals(num2[1])){
                if(num1[1].equals("10")){
                    a = Integer.parseInt(num1[0]);
                    a += Integer.parseInt(num2[0]);
                }else{Integer b1 = Integer.valueOf(num1[0], Integer.parseInt(num1[1]));
                      Integer b2 = Integer.valueOf(num2[0], Integer.parseInt(num2[1]));
                      a = b1 + b2;}
                System.out.println("Total: " + a);
            }else{System.out.println("N/A");}
        }
       
    }
}
