/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] prices1 = new double[100];
        boolean[] isPet1 = new boolean[100];
        boolean done = false;
        int i = 0;
        
        while(!done)
        {
            System.out.println("Enter the item price or -1 to quit: ");
            if(scnr.hasNextDouble())
            {
                double itemPrice = scnr.nextDouble();
                if(itemPrice == -1)
                {
                    done = true;
                   
                }
                else
                {
                    prices1[i] = itemPrice;
                    System.out.println("Is it a pet? y/n");
                    String petYesNo = scnr.next();
                    
                    if(petYesNo.equals("y") || petYesNo.equals("y"))
                    {
                        isPet1[i] = true;
                    }
                    else
                    {
                isPet1[i] = false;
                }
            i++;
            }
            
        }
        else
            {
                done = true;
            }
        
    }
    discount(prices1, isPet1, i);
}
    public static void discount(double[] prices, boolean[] isPet, int nItems)
    {
        boolean petFlag = false;
        double total = 0.0;
        int pets = 0;
        
        if(nItems >= 6)
        {
            for(int i = 0; i < isPet.length; i++)
            {
                if(isPet[i] == true)
                {
                    pets++;
                    petFlag = true;
                }
            }
            
            if(petFlag == true && (nItems - pets) >= 5)
            {
                for(int i = 0; i < prices.length; i++)
                {
                    if(isPet[i] == true)
                    {
                        total = total + prices[i];
                    }
                    else
                    {
                        total = total + prices[i] * .8;
                    }
                }
            }
            System.out.printf("final price after discount: $%.2f%n", total);
        }
        else
        {
            double finalTotal = 0; 
            for(int i = 0; i < prices.length; i++)
            {
                finalTotal += prices[i];
            }
            System.out.printf("No available discount. Final total: $%.2f%n", finalTotal);
        }
    }
            
    
}
