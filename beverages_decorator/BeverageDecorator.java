package beverages_decorator;

public abstract class BeverageDecorator extends Beverage{
    Beverage beverage;
    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public abstract int cost();
}
