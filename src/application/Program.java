package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Product;
//import entities.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		System.out.print("Price min: ");
		Double min = sc.nextDouble();
		
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		sc.close();
		
	}

}
