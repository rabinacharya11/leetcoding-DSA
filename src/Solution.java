import java.util.Scanner;

// Abstract class

abstract  class Animal {

    abstract void breathe();

    abstract  void eats();
}



class Dog extends Animal {

    @Override
    void breathe() {

        System.out.println("Dog is breathing");

    }

    @Override
    void eats() {

    }
}



enum ConnectionState {

    waiting, done, error
}


public class Solution  {



    public static void main (String[] args) {

        //Abstract class
        Dog dog = new Dog();
        dog.breathe();
        dog.eats();

        // polymorphysm

        Sita sita= new Sita();
        sita.profession();

        Ram ram = new Ram() ;
        ram.profession();

        //enums


        checkingEnums(ConnectionState.done);

    }


   public static void checkingEnums(ConnectionState state) {


        if( state==ConnectionState.waiting ) {

            System.out.println("Connection is waiting!");


        }
        else if(state == ConnectionState.error) {
            System.out.println("Connection gave some errors!");

        }
        else {

            System.out.println("Connection established successfully!");

        }


    }

}

class Human {

    void profession() {
        System.out.println("Human is a working professional");
    }
}

class Sita extends Human {

    void profession() {
        System.out.println("Human is a working as doctor");
    }
}

class Ram  extends Human {

    void profession() {
        System.out.println("Human is a working as engineer");
    }
}


