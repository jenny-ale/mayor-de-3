
package mayorde3;
import java.util.*;

public class Mayorde3 {

   
    public static void main(String[] args) {
       Scanner lec= new Scanner(System.in);
       
       int a,b,c;
       System.out.println("introduzca un numero");
       a=lec.nextInt();
       
       System.out.println("introduzca un numero");
       b=lec.nextInt();
       
       System.out.println("introduzca un numero");
       c=lec.nextInt();
       
       if(a>b && a>c){
       System.out.println(a+" es el mayor");
      
       } else if(b>a && b>c){
       System.out.println(b+" es el mayor");
       
       } else System.out.println(c+" es el mayor");
     
       
       
    }
    
}
