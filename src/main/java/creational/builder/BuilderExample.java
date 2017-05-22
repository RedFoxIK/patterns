package creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        Director director = new Director();
        CheapComputerBuilder ccb = new CheapComputerBuilder();

        director.setComputerBuilder(ccb);
        director.constructComputer();

        Computer computer = director.getComputer();
    }
}
