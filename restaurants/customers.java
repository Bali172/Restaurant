package restaurants;

public class customers extends employee {
	int customername;
	String dateofbirth;

	int k = 0;
	int tables[] = new int[20];
	int table2[];// Stack implemetation to alllot tables

	public int allottable() {
		if (k == 0) {
			System.out.println(
					"Sorry for the inconvnience we are full for now." + "Please wait while we have a table available");
			return (-1);
		}
		return (table2[k--]);
	}

	public void releasetable(int i) {
		if (k == 20) {
			System.out.println("Please use proper command as we have only 20 tables(No more tables to add)");
		}
		table2[k++] = i;
	}

	public static void main(String args[]) {
		customers[] c = new customers[30];

	}
}
