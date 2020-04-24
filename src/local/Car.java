package local;

public class Car {

    public quantityWheels model;
    public int speed;
    public int wheels = 4;
    final int RUL = 1;

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(quantityWheels model, int speed) {
        this.model = model;
        this.speed = speed;
        if (model == quantityWheels.MOTO) {
            wheels = 2;
        } else if (model == quantityWheels.TRICICLE) {
            wheels = 3;
        } else {
            wheels = 4;
        }
    }

    public void drive(int x) {
        System.out.println("Разгон ");
        while (speed < x) {
            if (speed < 10) {
                System.out.println("Едем на 1 скорости ");
            } else if (speed < 30) {
                System.out.println("Едем на 2 скорости ");
            } else if (speed < 60) {
                System.out.println("Едем на 3 скорости ");
            } else if (speed < 90) {
                System.out.println("Едем на 4 скорости ");
            } else {
                System.out.println("Едем на 5 скорости");
            }
            speed += 10;
        }
    }

    public void driveDo() {
        System.out.println("Торможение ");
        do {
            if (speed <= 0) {
                System.out.println("Остановка ");
            } else if (speed < 15) {
                System.out.println("Едем на 1 скорости ");
            } else if (speed < 30) {
                System.out.println("Едем на 2 скорости ");
            } else if (speed < 60) {
                System.out.println("Едем на 3 скорости ");
            } else if (speed < 90) {
                System.out.println("Едем на 4 скорости ");
            } else {
                System.out.println("Едем на 5 скорости");
            }
            speed -= 10;
        } while (speed >= 0);
    }

    public enum quantityWheels {
        AVTO, MOTO, TRICICLE;
    }
}
