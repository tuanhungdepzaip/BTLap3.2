class Car {
    String brand;
    String model;
    int speed;

    Car(int speed) {
        this.speed = speed;
    }

    void accelerate(int value) {
        speed += value;
    }

    void brake(int value) {
        speed -= value;
        if (speed < 0)
            speed = 0;
    }

    void displayStatus() {
        System.out.println("Model: " + model + " - Speed: " + speed);
    }

    boolean isOverSpeed() {
        return speed > 100;
    }
}
