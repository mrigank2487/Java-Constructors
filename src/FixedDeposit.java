/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep
 */
import java.io.*;
import java.util.Scanner;
class FD
{
  private int principle,year;
  private float rate, mv;
  
  FD()
  {}
   
    FD(int P,int Y,int R)
    {
        principle=P;
        year=Y;
        rate=R;

        int i;
      for(i=1;i<=Y;i++)
        {

            mv=(P*R)/100;
              P=P+mv;
        }
      mv=P;
    }
    FD(int P,int Y,float r)
    {
        principle=P;
        year=Y;
        rate=r;

        int i;
       for(i=1;i<=Y;i++)
       {
           mv=((P*r)/100);
           P=P+mv;
       }
    mv=P;
    }
    void display()
    {
      System.out.println("Principle= "+principle);
      System.out.println("Maturity Value= "+mv);
    }
}


public class FixedDeposit 
{
    public static void main(String args[]) throws IOException
{
    Scanner Sc=new Scanner(System.in);
    int P,Y,R;
    float r;
    System.out.println("Enter principle as integer value: ");
    P=Sc.nextInt();
    System.out.println("Enter year as integer value: ");
    Y=Sc.nextInt();
    System.out.println("Enter rate as integer value: ");
    R=Sc.nextInt();

    FD f1= new FD(P,Y,R);

    System.out.println("Enter principle as integer value: ");
    P=Sc.nextInt();
    System.out.println("Enter year as integer value: ");
    Y=Sc.nextInt();
    System.out.println("Enter rate as float value: ");
    r=Sc.nextFloat();

    FD f2= new FD(P,Y,r);

    System.out.println("Enter principle as integer value: ");
    P=Sc.nextInt();
    System.out.println("Enter year as integer value: ");
    Y=Sc.nextInt();


    f1.display();
    f2.display();

}

}
