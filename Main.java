package com.gmail.s.granovskiy;

public class Main {
    public static void main(String[] args) {

        /* catMurchik object */
        /* properties */
        System.out.println("These are the properties of catMurchik object: ");
        Cat catMurchik = new Cat("Murchik", "White", 5.2, 7, 5, 7, 9);
        catMurchik.print();
        System.out.println();
        /* call of method mew */
        System.out.println("This is the work of method mew of catMurchik object:");
        catMurchik.mew();
        System.out.println();
        /* call of method changeTwoProperties */
        System.out.println("These are the changed properties: weight and age of catMurchik object: ");
        catMurchik = catMurchik.changeTwoProperties(catMurchik, 6.5, 8);
        catMurchik.print();
        System.out.println();

        /* catBella object */
        /* properties */
        System.out.println("These are the properties of catBella object: ");
        Cat catBella = new Cat("Bella", "Grey", 3.1, 3, 4, 8, 9);
        catBella.print();
        System.out.println();
        /* call of method screem */
        System.out.println("This is the work of method screem of catBella object:");
        catBella.scream();
        System.out.println();
        /* call of method changeThreeProperties */
        System.out.println("These are the changed properties: strength, health and intellect of catBella object: ");
        catBella.changeThreeProperties(catBella, 5, 9, 10);
        catBella.print();
        System.out.println();

        /*  Calling the toString() method to see the state of the objects  */
        System.out.println(catMurchik);
        System.out.println(catBella);
    }
}
