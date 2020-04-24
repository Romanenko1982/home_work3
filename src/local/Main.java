package local;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car mers = new Car(0);
        mers.drive(140);
        System.out.println("------------");

        mers.driveDo();
        System.out.println("------------");

        Car moto = new Car(Car.quantityWheels.MOTO, 250);
        System.out.println(moto.wheels);
        Car tricicle = new Car(Car.quantityWheels.TRICICLE, 200);
        System.out.println(tricicle.wheels);
        Car avto = new Car(Car.quantityWheels.AVTO, 170);
        System.out.println(avto.wheels);

        int[] arr = new int[10];
        entryOutput(arr);
        System.out.println("------------");

        stringArray();
        System.out.println("------------");

        sort(arr);
        System.out.println("------------");

        String[] str = {"Cat", "Dog", "Lion", "Horse", "Pig", "Mouse"};
        forEach(arr);
        forEach(str);
    }

    public static void entryOutput(int[] a) {
        System.out.println("Random array ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void stringArray() {
        String[] surname = {"Иванов", "Петров", "Сидоров"};
        System.out.println(Arrays.toString(surname));

        for (int i = 0; i < surname.length; i++) {
            System.out.print(surname[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] a) {
        System.out.println("Sorted array ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void forEach(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void forEach(String[] a) {
        for (String element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
