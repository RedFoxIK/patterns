package creational.abstract_factory;

import creational.abstract_factory.products.Bear;
import creational.abstract_factory.products.Cat;
import creational.abstract_factory.products.TeddyBear;
import creational.abstract_factory.products.TeddyCat;

public class TeddyToyFactory implements ToyFactory {
    public Bear getBear() {
        return new TeddyBear();
    }

    public Cat getCat() {
        return new TeddyCat();
    }
}
