package restaurants;

public class employee {
	enum depart {
		manager, busboy, chef, server, hostess
	};

	int index[] = new int[5];

	public class empdetails

	{
		String name, department;
		int salary, did;
		boolean availability;

		public void setname(String l) {
			name = l;
		}

		public void setdep(String k) {
			department = k;
		}

		public void setsalary(int m) {
			salary = m;
		}

		public void setdid(int n) {

			did = n;
		}

		public void setavail() {
			availability = false;
		}

		public void freeavail() {
			availability = true;
		}

		public String getname() {
			return (name);
		}

		public String getdep() {
			return (department);
		}

		public int getsalary() {
			return (salary);
		}

		public int getdid() {

			return (did);
		}

		public boolean getavail() {
			return (availability);
		}

	}

	public int dequeue(empdetails e[], int i) {
		return (2);
	}

	empdetails[][] em = new empdetails[10][10];

	public int allot(empdetails e[][],int i){
		return(dequeue(e[i][ ],i));
	}

	public static void main(String args[]) {
		employee[] a = new employee[20];

	}
}
