package restaurants;

import java.util.*;
import java.lang.*;

public class orders extends menu {

	Scanner s = new Scanner(System.in);
	bill b = new bill();
	bill register[] = new bill[20];
	int sno, qty, amount = 0, i = 0, k = 0;
	List<menu> m = new ArrayList<menu>();
//	menu[] m = new menu[40];
//	int totalmenu = m.size();
	String ch;

	public class bill {
		int q[], a[], index = 0;;
		String[] item;
	}

	public void registerbill() {
		register[k++] = b;
		register[k].index = i;
	}

	public void getregister() {
		for (int j = 0; j < k; j++) {
			for (int i = 0; i < register[j].index; i++)
				System.out.println(register[j].item[i] + "\t\t" + register[j].q[i]);
		}
	}

	public void displaybill() {
		System.out.println("Item\t\t Quantity");
		for (int j = 0; j < i; j++) {
			System.out.println(b.item[i] + "\t\t" + b.q[i]);
		}
	}

	public orders() {
		// TODO Auto-generated constructor stub
	}

	public void getorders() {

		displaymenu(m, m.size());// to display menu from the menu object array
		int b_a;
		do {
			System.out.println("Please enter the serial number opposite to the item followed by Qty you wish to order");
			sno = s.nextInt();
			qty = s.nextInt();
			b_a = qty * (m.get(sno).getprice());
			amount = amount + b_a;
			System.out.println(
					"Amount for the item " + m.get(sno).name + "is" + b_a + "and total amount of order till now" + amount);
			System.out.println("Do you want to add more to the order \n Y or N");
			ch = s.next();
			b.q[i] = qty;
			b.item[i] = m[sno].name;
			b.a[i] = b_a;
			i++;
		} while ((ch == "y") || (ch == "Y") || (ch == "Yes") || (ch == "yes"));// to
																				// give
																				// a
																				// pre
																				// check
																				// details
																				// before
																				// finalizing
																				// order
	}

	public int getbill() {
		displaybill();
		registerbill();
		i = 0;
		return (amount);// To give the final amount
	}

	public void changeorder() {// method to modify order placed at any moment
		displaybill();// to display the current bill
		System.out.println("Please enter the sno followed by quantity of the Item to be removed from the menu");
		int r = s.nextInt();
		int j = s.nextInt();
		amount -= (b.q[r] / b.a[r]) * j;// for calculation individual price of
										// an item
		System.out.println("Modified for the bill are below \n" + "-" + b.item[r] + b.q[r] + j);// to
																								// print
																								// value
																								// after
																								// modification
	}

	public void additem() {// to add items to menu
		System.out.println("Please enter number of item you wish to enter");
		int choic = s.nextInt();
		totalmenu += choic;// updation list of items
		addmenu(m, choic);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
