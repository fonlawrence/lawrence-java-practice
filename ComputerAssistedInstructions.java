/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.assisted.instructions;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructions {
    
    private static final SecureRandom secure=new SecureRandom();
    private static int a;
    private static int b;
    private static int prod =0;
    private static int input;
    //answer counters
    private static int count;
    private static int pos=0;
    
    private static int difLev=0;
    private static  Scanner scan=new Scanner(System.in);
    private static int z=0;
    
    
    
    public static void main(String[] args) {
        System.out.println("Enter your difficulty level btw 1and 5 ");
        difLev=scan.nextInt();
        difSelect();
    }
    //the generator method
     public static void randGen(){
        
         a=secure.nextInt(z);
         b=secure.nextInt(z);
         prod=a*b;
         
         System.out.println("how much is "+a+" times "+b);
         ansGen();
     }
    //answer checker
     public static void ansGen(){
          
           input=scan.nextInt();
           
          
           //comparing answer
        
             if(input!=prod){
                   System.out.println(negGen());
                   
                   pos++;
                   count++;
                     if(count==10){
             counter();
          }
            ansGen();
             }else{
                System.out.println(posRes());
                 count++;
                   if(count==10){
             counter();
            }
                    randGen();
                 } 
             //counter checker
           }
     public static void counter(){
         int per=pos/10;
            
               if(per>=7.5){
                   System.out.println("Congratulations, you are ready to go to the next level");
                   reset();
               }else{
                   System.out.println("Please ask your teacher for extra help");
                   reset();
               }
         
     }
     
    //positive response selector
     
     public static String posRes(){
         String restype=" ";
         int res=1+secure.nextInt(4);
         switch(res){
             case(1):
                 restype="Very good";
                 break;
                 case(2):
                     restype="Excellent!";
                     break;
                     case(3):
                         restype="Nice Work!";
                         break;
                         case(4):
                             restype="Keep up the good work!";
                             break;
         }
         return restype;
     }
     
     //negative response generator
     
     public static String negGen(){
         
            String restype=" ";
         int res=1+secure.nextInt(4);
         switch(res){
             case(1):
                 restype="No. Please try again.";
                 break;
                 case(2):
                     restype="Wrong. Try once more";
                     break;
                     case(3):
                         restype="Don't give up";
                         break;
                         case(4):
                             restype="No. Keep trying.";
                             break;
         }
         return restype;
         
     }
     public static void reset(){
         count=0;
         pos=0;
         randGen();
     }
     public static void difSelect(){
          int z=0;
         switch(difLev){
             case(1):
                 z=10;
                 break;
             case(2):
                 z=100;
                 break;
             case(3):
                 z=1000;
                 break;
             case(4):
                 z=10000;
             case(5):
                 z=100000;
                 break;
             
         }
         randGen();
     }
}
