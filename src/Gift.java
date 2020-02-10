package newyeargift.newyeargift;

import java.util.Scanner;
public class Gift extends App implements Totals{
	     //New Year gift you want to give others.So it is our wish to add different sweeets and chocolates into it.
	    //what sweets would you like to gift 1.type of sweet 2.number of sweets of that type
	    //what chocolates would you like to put in  gift 1.type of chocolate 2. number of chocolates of that tyoe
	    //display that paticular combination of sweets and chocolates in the final output with their total weight and total cost for that gift
	    Gift() {
	    }
	    Scanner s = new Scanner(System.in);
	    Perk d = new Perk();
	    Milkybar b = new Milkybar();
	    Candies c = new Candies();
	    Sweets w = new Sweets();
	    int tot_weight=0;
	    int tot_cost=0;
	        public void sweets () {
	            System.out.println("Sweets you want to add in your gift.\n Choose one");
	            int ch, number;
	            System.out.println("1.KajuBarfi\n2.Kova\n3.Laddu\n");
	            ch = s.nextInt();
	            if (ch == 1) {
	                System.out.println("-----Kajubarfi-----");
	                //cost of each sweet in rupees
	                int cost=15;
	                System.out.println("Enter weight of kajubarfi in kgs:");
	                int weight = s.nextInt();
	                //per_sweet_weight of kajubarfi is 0.1kg
	                number = (int) (weight/0.1);
	                System.out.println("The number of sweets you would get :"+number);
	                tot_weight=w.total_weight(number, weight);
	                System.out.println("Total weight of KajuBarfi:"+tot_weight);
	                tot_cost=w.total_cost(tot_weight, cost);
	                System.out.println("Total Cost of KajuBarfi:"+tot_cost);
	            } else if (ch == 2) {
	                System.out.println("-----Kova-----");
	                int cost = 10;
	                System.out.println("Enter weight of kova in kgs :");
	                int weight = s.nextInt();
	                //per_sweet_weight of kova is 0.1kg
	                 number = (int) (weight/0.1);
	                System.out.println("The number of sweets you would get :"+number);
	                tot_weight=w.total_weight(number, weight);
	                System.out.println("Total weight of Kova:"+tot_weight);
	                tot_cost=w.total_cost(tot_weight, cost);
	                System.out.println("Total Cost of Kova:"+tot_cost);
	            } else if (ch == 3) {
	                System.out.println("-----Laddu-----");
	                int cost =5;
	                System.out.println("Enter weight of laddu in kgs:");
	                int weight = s.nextInt();
	                //per_sweet_weight of laddu is 0.1kg
	                number = (int) (weight/0.1);
	                System.out.println("The number of sweets you would get :"+number);
	                tot_weight=w.total_weight(number, weight);
	                System.out.println("Total weight of Laddu:"+tot_weight);
	                tot_cost=w.total_cost(tot_weight, cost);
	                System.out.println("Total Cost of Laddu:"+tot_cost);
	            }
	            else{
	                System.out.println("Invalid Choice");
	            }
	        }
	        public void chocolates () {
	            System.out.println("Chocolates you want to add in your gift\n Choose one");
	            int ce, num;
	            System.out.println("1.Perk\n2.Milkybar\n3.Candies\n");
	            ce = s.nextInt();
	            if (ce == 1) {
	                System.out.println("Enter number of Perk chocolates you want to add:");
	                num = s.nextInt();
	                tot_weight=tot_weight+d.total_weight(num);
	                System.out.println("Total weight of Perk chocolates you have ordered :"+d.total_weight(num));
	                tot_cost=tot_cost+d.total_cost(num);
	                System.out.println("Total cost of Perk:"+d.total_cost(num));

	            } else if (ce == 2) {
	                System.out.println("Enter number of Milkybar chocolates you want to add:");
	                num = s.nextInt();
	                tot_weight=tot_weight+b.total_weight(num);
	                tot_cost=tot_cost+b.total_cost(num);
	                System.out.println("Total weight of Milkybar chocolates you have ordered :"+b.total_weight(num));
	                System.out.println("Total cost of Milkybar:"+b.total_cost(num));
	            } else if (ce == 3) {
	                System.out.println("Enter number of Candies you want to add:");
	                num = s.nextInt();
	                tot_weight=tot_weight+c.total_weight(num);
	                tot_cost=tot_cost+c.total_cost(num);
	                System.out.println(c.total_cost(num));
	                System.out.println("Total weight of Candies you have ordered :"+c.total_weight(num));
	                System.out.println("Total cost of Candies:"+c.total_cost(num));
	            }
	            else{
	                System.out.println("Invalid Choice");
	            }
	    }
	    public void display(){
	            System.out.println("Total Weight Of Sweets And Chocolates you have chosen to gift on New Year is "+tot_weight);
	            System.out.println("Total Cost Of Sweets And Chocolates you have chosen to gift on New Year is "+tot_cost+" rupees");

	    }
}


