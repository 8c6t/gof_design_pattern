package decorator.case1.decorator;

import decorator.case1.base.IceCream;

public class Strawberry extends Decorator {

    IceCream icecream;

    public Strawberry(IceCream icecream) {
        this.icecream = icecream;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " + 딸기";
    }

    @Override
    public int price() {
        return 500 + icecream.price();
    }

}
