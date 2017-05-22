package creational.builder;

public class GameComputorBuilder extends ComputerBuilder {
    public void buildProcessor() {
        computer.setProcessor("Intel Core i7");
    }

    public void buildMemory() {
        computer.setMemory("16 Gb");
    }

    public void buildDisplay() {
        computer.setDisplay("32");
    }
}
