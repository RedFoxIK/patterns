package creational.abstract_factory;

import creational.abstract_factory.products.Bear;
import creational.abstract_factory.products.Cat;
import creational.abstract_factory.products.WoodenBear;
import creational.abstract_factory.products.WoodenCat;

public class WoodenToyFactory implements ToyFactory {
    public Bear getBear() {
        return new WoodenBear();
    }

    public Cat getCat() {
        return new WoodenCat();
    }
}
