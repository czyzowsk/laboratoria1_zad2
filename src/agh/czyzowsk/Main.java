package agh.czyzowsk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double[][] testArray = {{30, 0, 0, 1}, {0, -30, 30, 1}, {0, 0, -30, 1}}; // przykladowe punkty

        RigidBody rigidBody = new RigidBody(testArray);//deklaruje obiekt
        RigidBody secRigidBody = new RigidBody();// deklaruje obiekt o losowej ilosci punktow

        System.out.printf("1. Masa obiektu %.2f, Moment bezwladnosci: %.2f, Moment bezwladnosci na osi X: %.2f, Moment " +
                "bezwladnosci na osi Y: %.2f, Moment bezwladnosci na osi Z: %.2f \n \n", rigidBody.getMasaCalkowita(),
                rigidBody.getMomentBezwladnosci(),rigidBody.getMomentBezwladnosciX(),rigidBody.getMomentBezwladnosciY(),
                rigidBody.getMomentBezwladnosciZ());

        System.out.printf("2. Masa obiektu %.2f, Moment bezwladnosci: %.2f, Moment bezwladnosci na osi X: %.2f, Moment " +
                        "bezwladnosci na osi Y: %.2f, Moment bezwladnosci na osi Z: %.2f \n \n",
                secRigidBody.getMasaCalkowita(),secRigidBody.getMomentBezwladnosci(),
                secRigidBody.getMomentBezwladnosciX(),secRigidBody.getMomentBezwladnosciY(),
                secRigidBody.getMomentBezwladnosciZ());

        double[][] newTestArray = {{10, 0, 0, 1}, {0, 0, 30, 1}, {0, 0, 30, 1}};

        secRigidBody.newRigidBody(newTestArray);
        System.out.printf("2. Masa obiektu %.2f, Moment bezwladnosci: %.2f, Moment bezwladnosci na osi X: %.2f, Moment " +
                        "bezwladnosci na osi Y: %.2f, Moment bezwladnosci na osi Z: %.2f \n \n",
                secRigidBody.getMasaCalkowita(),secRigidBody.getMomentBezwladnosci(),
                secRigidBody.getMomentBezwladnosciX(),secRigidBody.getMomentBezwladnosciY(),
                secRigidBody.getMomentBezwladnosciZ());

        //deklarujemy liste obiektow
        ArrayList<RigidBody> listOfRigidBodys = new ArrayList<>();

        //przypisujemy do listy konkretne obiekty
        for(int iloscObiektow = 10; iloscObiektow>0; iloscObiektow--){
            RigidBody tempRigid = new RigidBody();
            listOfRigidBodys.add(tempRigid);
        }
        //wyswietlamy obiekty i info o nich
        for (RigidBody newRigidBody : listOfRigidBodys){
            System.out.printf("%d. Masa obiektu %.2f, Moment bezwladnosci: %.2f, Moment bezwladnosci na osi X: %.2f, " +
                            "Moment bezwladnosci na osi Y: %.2f, Moment bezwladnosci na osi Z: %.2f \n \n",
                    listOfRigidBodys.indexOf(newRigidBody)+3, newRigidBody.getMasaCalkowita(),
                    newRigidBody.getMomentBezwladnosci(),newRigidBody.getMomentBezwladnosciX(),
                    newRigidBody.getMomentBezwladnosciY(),newRigidBody.getMomentBezwladnosciZ());
        }

    }
}
