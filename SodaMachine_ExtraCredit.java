
/**
 * SodaMachine_ExtraCredit will make a SodaMachine_ExtraCredit object, with prices that depend on
 * temperature.
 *
 * @author (Henry)
 * @version (10/11/22)
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
//import for currency (chapter 4)
public class SodaMachine_ExtraCredit
{
    double temp;
    double price;
    double money;
    double change;
    int quarters;
    int dimes;
    int nickles;
    int pennies;
    String quarterSingle;
    String dimeSingle;
    String nickleSingle;
    String pennySingle;
    String outputMsg;
    Scanner scanTemp = new Scanner(System.in);
    Scanner scanMoney = new Scanner(System.in);
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    public void getTemp()
    {
        temp = (int)(Math.random()*100);
        System.out.println("The temperature outside is " + temp + " degrees:");
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
        System.out.println("At the temperature " + temp + " degrees the price is " + fmt.format(price));
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
        change = (int)(change*100);
        quarters = (int)(change/25);
        change = (int)(change-(quarters*25));
        dimes = (int)(change/10);
        change = (int)(change-(dimes*10));
        nickles = (int)(change/5);
        pennies = (int)(change-(nickles*5));
        if (quarters == 1)
        {
            quarterSingle = (quarters + " quarter\n");
        }
        else if (quarters == 0)
        {
            quarterSingle = (" ");
        }
        else 
        {
            quarterSingle = (quarters + " quarters\n");
        }
        if (dimes == 1)
        {
            dimeSingle = (dimes + " dime\n");
        }
        else if (dimes == 0)
        {
            dimeSingle = (" ");
        }
        else
        {
            dimeSingle = (dimes + " dimes\n");
        }
        if (nickles == 1)
        {
            nickleSingle = (nickles + " nickle\n");
        }
        else if (nickles == 0)
        {
            nickleSingle = (" ");
        }
        else
        {
            nickleSingle = (nickles + " nickles\n");
        }
        if (pennies == 1)
        {
            pennySingle = (pennies + " penny\n");
        }
        else if (pennies == 0)
        {
            pennySingle = (" ");
        }
        else
        {
            pennySingle = (pennies + " pennies\n");
        }
        outputMsg = ("Your change is:\n" + quarterSingle + dimeSingle + nickleSingle + pennySingle);
        System.out.println(outputMsg);
        System.out.println(" ");
        System.out.print("Thank you for choosing APCS Soda Company®. \n" +
            "See you next time!");
    }
}
