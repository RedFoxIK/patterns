package creational.builder;

public class CheapComputerBuilder extends ComputerBuilder {
    public void buildProcessor() {
        computer.setProcessor("Intel i3");
    }

    public void buildMemory() {
        computer.setMemory("1 Gb");
    }

    public void buildDisplay() {
        computer.setDisplay("15.6");
    }
}
