package restaurants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {

	// public class menuitem{
	String category;// Variables to store item names with parameters for each
	String name;
	String desc;
	int price;

	public int getprice() {
		return (price);// returns price of the item
	}

	public menu() {
		category = null;
		name = null;
		price = 0;// Constructor invoking to null to avoid null pointer
					// exception

	}

	public static void displaymenu(List<menu> k, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + "\t " + k.get(i).name + "\t" + k.get(i).desc + "\t" + k.get(i).getprice());
		}
	}

	public menu(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public menu(String cat, String nam, int p) {
		category = cat;
		name = nam;
		price = p;
	}

	public static void addmenu(List<menu> m, int ch) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < ch; i++) {
			m.add(i, new menu());
		}
		for (int i = 0; i < ch; i++) {

			System.out.println("Please enter Name ");
			m.get(i).name = s.next();

			System.out.println("Please enter price for the item followed by category");
			m.get(i).price = s.nextInt();

			m.get(i).category = s.next();
			System.out.println("Please enter Description ");
			m.get(i).desc = "";
			m.get(i).desc = s.next();
			// System.out.println(m[i].name + "\t" + m[i].desc + "\t" +
			// m[i].price);
		}

	}

	public static void main(String Args[]) {
		List<menu> m = new ArrayList<menu>();
		int choice, ch = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Please 1 to enter item \n 2 to display menu \n Any number to exit");
			choice = s.nextInt();
			if (choice == 1) {
				System.out.println("Please enter number of item you wish to enter");
				ch = s.nextInt();
				addmenu(m, ch);
				/*
				 * for(int i=0;i<ch;i++){ m[i]=new menu(); } for(int
				 * i=0;i<ch;i++){
				 * 
				 * System.out.println("Please enter Name "); m[i].name=s.next();
				 * 
				 * System.out.
				 * println("Please enter price for the item followed by category"
				 * ); m[i].price=s.nextInt();
				 * 
				 * m[i].category=s.next();
				 * System.out.println("Please enter Description "); m[i].desc
				 * =s.next(); System.out.println(m[i].name +"\t" +m[i].desc+"\t"
				 * + m[i].price); }
				 */
			} else if (choice == 2) {
				displaymenu(m, ch);

			} else {

				System.out.println("Please enter value with in range provided");
			}

		} while (choice < 3);

		displaymenu(m, ch);
		for (int i = 0; i < ch; i++) {
			System.out.println(i + "\t" + m.get(i).name + "\t" + m.get(i).desc + "\t" + m.get(i).price);
		}

	}

	/*
	 * } //here declarations for the new object for menu item goes here public
	 * class order{ int sno,qty; } public void getorder(){ int sno,q; Scanner
	 * s=new Scanner(System.in); System.out.
	 * println("Please enter the sno followed the quantity you wish to order");
	 * sno=s.nextInt(); q=s.nextInt();
	 */
}
