package StrategyDesignPatternBASIC;


public class ABECADLO {

    Czynnosc rodzajrobienia;

    String sprobujZrobic(){
        return rodzajrobienia.dzialanie();
    }



void setCzyrobi(Czynnosc rodzajrobienia){
    this.rodzajrobienia =rodzajrobienia;
}

}
