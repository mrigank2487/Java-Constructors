/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructors;

/**
 *
 * @author Sandeep
 */
import java.io.*;
import java.util.Scanner;
class test
{
    private int x,y;
    test()
    {
        x=50;
        y=10;
    }
    
    test(int u, int v)
    {
        x=u;
        y=v;
    }
    
    test (test T)
    {
        x=T.x;
        y=T.y;
    }
    
    void display()
    {
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
    }
}


public class Constructors 
{

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException 
    {
        Scanner Sc= new Scanner(System.in);
        test t= new test();
       int u,v;
       System.out.println("Enter a value: ");
       u=Sc.nextInt();
       System.out.println("Enter another value: ");
       v=Sc.nextInt();
       test t1= new test(u,v);
       test t2= new test(t);       
       t.display();
       t1.display();
       t2.display();
    }
    
}
