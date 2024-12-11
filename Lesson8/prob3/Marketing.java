package Lesson8.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}



	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Marketing marcomp = (Marketing) obj;
		return Double.compare(salesamount, marcomp.salesamount) == 0 &&
				employeename.equals(marcomp.employeename) &&
				productname.equals(marcomp.productname);
	}

	@Override
	public String toString() {
		return employeename + " " + productname + " " + salesamount;
	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		List<Marketing> filteredList = new ArrayList<>();

		for (Marketing marketing : list) {
			if (marketing.getSalesamount() > 1000) {
				filteredList.add(marketing);
			}
		}

		filteredList.sort(Comparator.comparing(Marketing::getEmployeename));

		return filteredList;
	}

	public static void main(String[] args) {
		List <Marketing> list1 = new ArrayList<Marketing>();
		list1.add (new Marketing("amin", "test product", 1500.0));
		list1.add (new Marketing("hcinet", "test product2", 1250.0));
		list1.add (new Marketing("Ziad", "test product3", 5000.0));
		list1.add (new Marketing("Alex", "test product4", 1150.0));
		list1.add (new Marketing("jack", "test product5", 500.0));
		list1.add (new Marketing("amin", "test product", 1500.0));
		list1.add (new Marketing("hcinet", "test product2", 1250.0));
		list1.add (new Marketing("Ziad", "test product3", 5000.0));
		list1.add (new Marketing("amin", "test product", 1500.0));
		list1.add (new Marketing("hcinet", "test product2", 1250.0));
		list1.add (new Marketing("Ziad", "test product3", 5000.0));


		System.out.println("before removal: " + list1);



		list1.remove(list1.get(1));
		System.out.println("After removal: " + list1);
		System.out.println("Size of the list  " + list1.size());
		System.out.println("element at position 3 " + list1.get(3));
		Marketing updatedMarketing = new Marketing("Updated Name", "Updated Product", 9999.0);
		list1.set(1, updatedMarketing);


		Comparator<Marketing> salesAmountComparator = Comparator.comparingDouble(Marketing::getSalesamount);

		list1.sort(salesAmountComparator);

		List<Marketing> sortedList = listMoreThan1000(list1);

		System.out.println("Employees with sales > 1000 sorted by name:");
		for (Marketing marketing : sortedList) {
			System.out.println(marketing);
		}

	}



}

