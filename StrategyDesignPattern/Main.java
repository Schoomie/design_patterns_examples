package StrategyDesignPattern;



public class Main {

    public static void main(String[] args) {


        Fighter BonusBGC = new KickBoxer();
        Fighter Drwal = new MuayThaiFighter();
        System.out.println("Fighter BonusBGC: "+ BonusBGC.tryToElbow());
        System.out.println("Fighter Drwal: "+ Drwal.tryToElbow());
        BonusBGC.setElbowAbility(new canElbow());
        System.out.println("Fighter BonusBGC: "+ BonusBGC.tryToElbow());


    }

}
