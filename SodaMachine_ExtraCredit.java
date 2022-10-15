
/**
 * SodaMachine will make a SodaMachine object, with prices that depend on
 * temperature.
 *
 * @author (Henry)
 * @version (10/11/22)
 */

import java.util.Scanner;
//import for currency (chapter 4)
public class SodaMachine
{
    private double temp;
    private int roundedTemp;
    private double price;
    private double money;
    private double change;
    Scanner scanTemp = new Scanner(System.in);
    Scanner scanMoney = new Scanner(System.in);
    public void getTemp()
    {
        System.out.println("Enter the temperature outside:");
        System.out.println(" ");
        temp = scanTemp.nextDouble();
        System.out.println(" ");
        temp = (temp + .5);
        roundedTemp = (int)(temp);
        System.out.println("Temperature is: " + roundedTemp);
        System.out.println(" ");
    }

    public void getMoney()
    {
        System.out.println("Enter your money:");
        System.out.println(" ");
        money = scanMoney.nextDouble();
        System.out.println(" ");
        System.out.println("Money entered: $" + money);
        System.out.println(" ");
    }

    public void getPrice()
    {
        if (temp > 90)
        {
            price = 1.00;
        }
        else if (temp >= 86 && temp <= 90)
        {
            price = .90;
        }
        else if (temp >= 81 && temp <= 85)
        {
            price = .85;
        }
        else if (temp >= 76 && temp <= 80)
        {
            price = .80;
        }
        else if (temp >= 71 && temp <= 75)
        {
            price = .75;
        }
        else if (temp >= 66 && temp <= 70)
        {
            price = .65;
        }
        else if (temp >= 61 && temp <= 65)
        {
            price = .60;
        }
        else if (temp >= 50 && price <= 60)
        {
            price = .55;
        }
        else if (price < 50)
        {
            price = .50;
        }
        System.out.println("At the temperature " + roundedTemp + " degrees the price is $" + price);
        System.out.println(" ");
    }

    public void getChange()
    {
        change = (money - price);
        if (change < 0.0)
        {
            System.out.println("You need more money!");
            System.out.println(" ");
            System.out.print("Thank you for choosing APCS Soda Company®. \n" +
                "See you next time!");
            return;
        }
        else if (change == 0.0)
        {
            return;
        }
        else if (change > 100.0)
        {
            System.out.println("We don't have enough money to give you.");
            System.out.println(" ");
            System.out.print("Thank you for choosing APCS Soda Company®. \n" +
                "See you next time!");
            return;
        }
        System.out.println("Your change is $" + change + ".");
        System.out.println(" ");
        System.out.print("Thank you for choosing APCS Soda Company®. \n" +
            "See you next time!");
    }
}
