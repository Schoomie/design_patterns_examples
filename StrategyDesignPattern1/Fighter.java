package StrategyDesignPattern1;

/**
 * Created by Kuba on 19/03/2019.
 */
public class Fighter {

    ElbowHit ifElbow;



    private String name;
    private double height;
    private double weight;
    private double armsReach;
    private int punchForce;

    // START OF GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0 ){
            System.out.println("Height have to be 0<...");
        }
        else {
            this.height = height;
        }
        }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<0){
            System.out.println("Weight have to be 0<... ");
        }
        this.weight = weight;
    }

    public double getArmsReach() {
        return armsReach;
    }

    public void setArmsReach(double armsReach) {
        this.armsReach = armsReach;
    }

    public int getPunchForce() {
        return punchForce;
    }

    public void setPunchForce(int punchForce) {
        this.punchForce = punchForce;
    }
    //FINISH OF GETTERS AND SETTERS

    public String tryToElbow(){
        return ifElbow.elbow();
    }

    public void setElbowAbility(ElbowHit newIfElbow){
        ifElbow = newIfElbow;
    }

}
