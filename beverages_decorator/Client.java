package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());
		
		
		coffee = new Milk(coffee);
		System.out.println("Cappuccino + Milk: " + coffee.cost());
	}

}