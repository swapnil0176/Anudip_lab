//1.  Define Product class with name, price,  and sort it price wise (use comparable interface) .

package thursdayLab10;

import java.util.*;
public class Product implements Comparable<Product>
{
    public String name;
    public Double price;
	public Product(String name,Double price)
	{
		this.name=name;
		this.price=price;
	}
	
//	public String getName()
//	{
//		return name;
//	}
//	
//	public Double getPrice()
//	{
//		return price;
//	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price, o.price);
	}
	@Override
	public String toString() {
        return name + ": Rs. " + price;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many products you want: ");
		int n=sc.nextInt();
		System.out.println("Enter Product details:  ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Name: ");
			String name=sc.next();
			System.out.print("Price: ");
		    Double price=sc.nextDouble();
			products.add(new Product(name, price));
		}
		
        
        Collections.sort(products);
        
        for (Product p : products) {
            System.out.println(p);
        }
	}

	
}
