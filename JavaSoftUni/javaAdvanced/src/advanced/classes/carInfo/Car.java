package advanced.classes.carInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    Car(String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }
    Car(String brand,String model, int horsePower){
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void carInfo() {
        System.out.println(String.format(
                "The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower()
        ));
    }
}
