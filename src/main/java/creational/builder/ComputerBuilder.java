package creational.builder;

public abstract class ComputerBuilder {
    Computer computer;

    public void createNewComputer() {
        this.computer = new Computer();
    }

    public Computer getComputer() {
        return this.computer;
    }

    public abstract void buildProcessor();
    public abstract void buildMemory();
    public abstract void buildDisplay();

}
