package com.company;
import javax.swing.JOptionPane;

public class pi {
    public static void main(String [] args)
    {
        final double PI = 22/7.0;
        double rad=6;
        System.out.println("Radius is "+rad);
        //circumference of a circle
        double circuference =2*rad*PI;
        System.out.println("circuference is "+circuference);

        //exc H
        int a=Integer.valueOf(JOptionPane.showInputDialog("Give me an a"));
        int b=Integer.valueOf(JOptionPane.showInputDialog("Give me an b"));
        int c = a*a + b*b;

        System.out.println("The square of the hypotenuse of a right angled triangle whose other sides are "+ a +" and "+ b +" is "+c);
        

    }
}
