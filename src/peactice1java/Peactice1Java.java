/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peactice1java;
/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Peactice1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	System.out.println("Enter the number");
	String s1 = reader.nextLine();
        String[] a = s1.split(" ");
        int[] c = new int[a.length];
        for(int i=0; i< a.length ;i++){
            int b = Integer.parseInt(a[i]);
            c[i] = b;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < c.length; i++) { //find max number
            if (c[i] > max) { 
                max = c[i];
                }
            }
        System.out.println("max=" + max);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < c.length; i++) { //find max number
            if (c[i] < min) { 
                min = c[i];
                }
            }
        System.out.println("min=" + min);
        int sum = 0;
        for(int i = 0; i < c.length; i++) { //find max number
            sum = sum+c[i];
            }
        System.out.println("sum=" + sum);
        int avg = sum/c.length;
        System.out.println("avg=" + avg);
        
    }
    
}
