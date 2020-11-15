/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
/**
 *
 * @author Mirza ahmad
 */
import javax.swing.*;
import java.util.Scanner;
public class JavaApplication33
{
     /**
     * @param args the command line arguments
     */
    public static void mdarrays(int c)
    {
      JFrame f=new JFrame();
      Scanner is=new Scanner(System.in);
      String b,w;
      int v,sum=0;
      if(c==1)
       {
       b=JOptionPane.showInputDialog(f,"Enter a size of the row:","",JOptionPane.INFORMATION_MESSAGE);
       v=Integer.parseInt(b);
       w=JOptionPane.showInputDialog(f,"Enter a size of the cloumn:","",JOptionPane.INFORMATION_MESSAGE);
       c=Integer.parseInt(w);
       int k[][]=new int[v][c];
       int i,j;
       System.out.println("Enter the elements of the array:");
       for(i=0; i<k.length; i++)
       {
           for(j=0; j<k.length; j++)
           {
            k[i][j]=is.nextInt();
            sum+=k[i][j];
           }
       }
       JOptionPane.showInputDialog(f,"The sum of the 2d array is = " +sum,"Result :",JOptionPane.INFORMATION_MESSAGE);
       }
    }
    public static void minarray(int y)
    {
        
       if(y==2)
       {
         JFrame f=new JFrame();
         Scanner is=new Scanner(System.in);
         int size,q;
         System.out.println("Enter the size of the array:");
         q=is.nextInt();
         int array[]=new int[q];
         System.out.println("Enter the elements of the array:");
         for(int k=0; k<array.length; k++)
         {
          array[k]=is.nextInt();
         }
         int min=array[0];
         for(int h=0; h<array.length; h++)
         {
          if(array[h]<min)
          {
            min=array[h]; 
          }
         }
         JOptionPane.showMessageDialog(f, "The minimum value in the array is = " + min, "Result:",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void maxarray(int u)
    {
       JFrame f=new JFrame();
       Scanner is=new Scanner(System.in);
       if(u==3)
       {
         int size,q;
         System.out.println("Enter the size of the array:");
         q=is.nextInt();
         int array[]=new int[q];
         System.out.println("Enter the elements of the array:");
         for(int k=0; k<array.length; k++)
         {
          array[k]=is.nextInt();
         }
         int max=array[0];
         for(int h=0; h<array.length; h++)
         {
          if(max<array[h])
          {
            max=array[h]; 
          }
         }
         JOptionPane.showMessageDialog(f, "The maximum value in the array is = " + max, "Result:",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void expro(int q)
    {
       if(q==8)
       {
        System.exit(1);
       }
    }
    public static void threadcons(int p)
    {
       if(p==4)
       {
       NewClass t=new NewClass();
       t.Newclass();
       }
    }
    public static void paracons(int e)
    {
        if(e==5)
        {
         NewClass o=new NewClass();
         o.Newclass(10,20);
        }
    }
    public static void sumthread(int b)
    {
        if(b==6)
        {
           NewClass r=new NewClass();
           r.get();
        }
    }
    public static void revorder(int t)
    {
       if(t==7)
       {
         NewClass h=new NewClass();
         h.revarray();
       }
    }
    public static void main(String[] args) 
      {
       JFrame f=new JFrame();
       String b;
       int z;
       b=JOptionPane.showInputDialog(f,"Press 1: For check the sum of the 2d array: \n Press 2: for check minimum value in the array: \n Press 3: Fo check maximum value: \n Press 4 : For check the thread of the constructor:\n Press 5 : For paramertrized thread constructor:\n Press 6: For check the thread of the sum: \n Press 7: For revorder of the arrray: \n Press 8: For exit the program:","",JOptionPane.INFORMATION_MESSAGE);
       z=Integer.parseInt(b);
       mdarrays(z);
       minarray(z);
       maxarray(z);
       threadcons(z);
       expro(z);
       paracons(z);
       sumthread(z);
       revorder(z);
      }
}