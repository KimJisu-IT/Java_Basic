package javabasic.demo;

public class Car {
    private String color;
    private String model;
    private int power;
    private int carSpeed;

    public Car() {
        carSpeed = 0;
    }

    public Car(String color, String model, int power) {
        this.color = color;
        this.model = model;
        this.power = power;
    }

    public void go() {
        if (power < 200) {
            carSpeed += 10;
        }
        else if (power >= 200) {
            carSpeed += 20;
        }
        System.out.printf("Accelerate %s, Current Speed %d\n", model, carSpeed);
    }

    public void stop() {
        carSpeed = 0;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

}