package agh.czyzowsk;

import java.util.Random;

public class RigidBody {

    private double srodekMasy, srodekMasyX, srodekMasyY, srodekMasyZ;
    private double momentBezwladnosciX,momentBezwladnosciY, momentBezwladnosciZ, momentBezwladnosci, masaCalkowita;
    private double[][] points;

    RigidBody(double[][] newPoints){
        points = newPoints;
        srodekMasy();
    }

    RigidBody(){
        Random rand = new Random();
        int numOfPoints = rand.nextInt(100) + 1;
        points = new double[numOfPoints][4];
        for (int i = 0; numOfPoints > i; i++){
            points[i][0] = rand.nextDouble() + rand.nextInt(50);
            points[i][1] = rand.nextDouble() + rand.nextInt(50);
            points[i][2] = rand.nextDouble() + rand.nextInt(50);
            points[i][3] = rand.nextDouble();
        }
        srodekMasy();
    }

    public void newRigidBody(double[][] newRigidBody){
        points = newRigidBody;
        srodekMasy();
    }

    public double getMomentBezwladnosciX(){
        momentBezwladnosciX = masaCalkowita*(Math.pow(srodekMasyY, 2) + Math.pow(srodekMasyZ, 2));
        return momentBezwladnosciX;
    }

    public double getMomentBezwladnosciY(){
        momentBezwladnosciY = masaCalkowita*(Math.pow(srodekMasyX, 2) + Math.pow(srodekMasyZ, 2));
        return momentBezwladnosciY;
    }

    public double getMomentBezwladnosciZ(){
        momentBezwladnosciZ = masaCalkowita*(Math.pow(srodekMasyX, 2) + Math.pow(srodekMasyY, 2));
        return momentBezwladnosciZ;
    }

    public double getMomentBezwladnosci(){
        momentBezwladnosci = masaCalkowita* Math.pow(srodekMasy, 2);
        return momentBezwladnosci;
    }

    private void srodekMasy(){
        masaCalkowita = 0;
        srodekMasyX = 0;
        srodekMasyY = 0;
        srodekMasyZ = 0;
        for(int i = 0; i < points.length; i++){
            masaCalkowita += points[i][3];
            srodekMasyX += points[i][3]*points[i][0];
            srodekMasyY += points[i][3]*points[i][1];
            srodekMasyZ += points[i][3]*points[i][2];
        }
        srodekMasyX = srodekMasyX/masaCalkowita;
        srodekMasyY = srodekMasyY/masaCalkowita;
        srodekMasyZ = srodekMasyZ/masaCalkowita;
        srodekMasy = Math.sqrt(Math.pow(srodekMasyX, 2) + Math.pow(srodekMasyY, 2) + Math.pow(srodekMasyZ, 2));
    }

    public double getMasaCalkowita(){
        return masaCalkowita;
    }

    public double getSrodekMasy(){
        return srodekMasy;
    }
}
