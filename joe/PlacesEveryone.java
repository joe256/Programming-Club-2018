
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmitc
 */
public class PlacesEveryone {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int a,b;
      char c = ' ';
      //Read numbers from keyboard
      a = scan.nextInt();
      b = scan.nextInt();
      
      while(a != -1 && b != -1){//while both numbers are not -1
        String one = "";
        String two = "";
        String three = "";
        
        boolean pos = false;
        
        one += a;
        two += b;
        for(int k = 0; k < one.length(); k++){//Test all combinations (necessary for final edge case)
            for(int i = k; i < one.length(); ){
                three += two.charAt(i);
                i++;
                if(i == one.length()){
                    i = 0;
                }
                if(i == k){
                    break;
                }
            }
            if(three.equals(one)){//test if each combination is equal to the first string.
                pos = true;
            }
            three = "";//reset testing string.
        }
        
        if(pos){//Display results:)
            System.out.println("They are positional");
        }else{
            System.out.println("They are not positional");
        }
        a = scan.nextInt();//reprompt user input
        b = scan.nextInt();
      }
  }  
}
