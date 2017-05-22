package creational.abstract_factory;

import creational.abstract_factory.products.Bear;
import creational.abstract_factory.products.Cat;

public interface ToyFactory {
    Bear getBear();
    Cat getCat();
}
