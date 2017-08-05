package orderprocessingsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OrderProcessingSystem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        ArrayList<String> password=new ArrayList<>();
        ArrayList<Integer> items=new ArrayList<>();
        ArrayList<Integer> quantity=new ArrayList<>();
        int price=0;
        while(true){
            System.out.println("1.Login \t 2.Register \t 3.Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Name: ");
                    String n=sc.next();
                    System.out.println("Enter Password: ");
                    String p=sc.next();
                    Iterator it1=name.iterator();
                    Iterator it2=password.iterator();
                    int flag=0;
                    while(it1.hasNext() && it2.hasNext())
                    {
                        if(it1.next().equals(n) && it2.next().equals(p))
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1)
                    {
                        while(true){
                            System.out.println("Items to buy");
                            System.out.println("1. Monitor-Rs.1000\t2. CPU-Rs.1500\t3. Keyboard-Rs.300\t4. Mouse-Rs.200");
                            System.out.println("Enter item number you want to buy: ");
                            items.add(sc.nextInt());
                            System.out.println("Enter quantity: ");
                            quantity.add(sc.nextInt());
                            System.out.println("Do you want to add more items?(y/n)");
                            char c=sc.next().charAt(0);
                            if(c=='y'||c=='Y')
                            {
                                continue;
                            }
                            else
                            {
                                Iterator i1=items.iterator();
                                Iterator i2=quantity.iterator();
                                price=0;
                                while(i1.hasNext() && i2.hasNext())
                                {
                                    switch((int)i1.next())
                                    {
                                        case 1:
                                            price+=1000*(int)i2.next();
                                            break;
                                        case 2:
                                            price+=1500*(int)i2.next();
                                            break;
                                        case 3:
                                            price+=300*(int)i2.next();
                                            break;
                                        case 4:
                                            price+=200*(int)i2.next();
                                            break;
                                    }
                                }
                                System.out.println("Your total bill is : "+price);
                                System.out.println("Do you want to confirm the order?(y/n)");
                                char c1=sc.next().charAt(0);
                                if(c1=='y'||c1=='Y')
                                {
                                    System.out.println("Your order has been confirmed!");
                                    for(long i=0;i<1000000000;i++);
                                    for(long i=0;i<1000000000;i++);
                                    for(long i=0;i<1000000000;i++);
                                    System.out.println("Your order has been packed!");
                                    for(long i=0;i<1000000000;i++);
                                    for(long i=0;i<1000000000;i++);
                                    for(long i=0;i<1000000000;i++);
                                    System.out.println("Your order has been dispatched!");
                                    for(long i=0;i<1000000000;i++);
                                    for(long i=0;i<1000000000;i++);
                                    for(long i=0;i<1000000000;i++);
                                    System.out.println("Your order has been delivered! Thank you for shopping with us!");
                                    break;
                                }
                                else{
                                    System.out.println("Do you want to add more items?(y/n)");
                                    char c2=sc.next().charAt(0);
                                    if(c2=='y'||c2=='Y'){
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Credentials, please try again!");
                        System.out.println("Do you want to continue? (y/n)");
                        char ch=sc.next().charAt(0);
                        if(ch=='y'||ch=='Y')
                        {
                            continue;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter your Name: ");
                    String n1=sc.next();
                    name.add(n1);
                    System.out.println("Enter new Password");
                    String p1=sc.next();
                    password.add(p1);
                    System.out.println("Sending you to LOGIN page!");
                    continue;
                default:
                    System.out.println("Exiting!!!");
            }
            break;
        }
    }
}
