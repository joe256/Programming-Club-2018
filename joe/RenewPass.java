
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j_mitchell22
 */
public class RenewPass {
    public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            
            String f = scan.next();
            String b = "";
            for(int i = f.length()-1; i >= 0; i--){
                b += f.charAt(i);
            }
            if(f.length() == 1 && f.charAt(0) == '0'){
                System.exit(0);
            }
            
            if(f.length() != 6){
                System.out.println("Rejected");
            }else{
                //Check for 3 of a character
                //charAt(grab current char)
                //"abcd"
                char first = f.charAt(0);
                int count = 1;
                for(int i = 1; i < f.length(); i++){
                    if(first != f.charAt(i)){
                        count++;
                    }
                    if(count == 3)
                        break;
                }
            }
            
            
    }
}
