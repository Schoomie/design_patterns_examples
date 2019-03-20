package StrategyDesignPattern1;

/**
 * Created by Kuba on 19/03/2019.
 */
public class KickBoxer extends Fighter{

    public void hit(){
        System.out.println("bum kołowrotek (kickboxer)");
    }

    public KickBoxer(){
        super();


        ifElbow = new cantElbow();

    }
}
