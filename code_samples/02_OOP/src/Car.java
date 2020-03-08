public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car() {
        this("Unknown");
    }

    public Car(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car porsche = new Car("Carrera");
        System.out.println(porsche.getModel());

        Car audi = new Car();
        audi.setModel("a3");
        System.out.println(audi.getModel());

        Car unknown = new Car();
        System.out.println(unknown.getModel());
    }
}
