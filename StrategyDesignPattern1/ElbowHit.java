package StrategyDesignPattern1;


public interface ElbowHit {

    String elbow();

}

class canElbow implements ElbowHit{

    @Override
    public String elbow() {
return "bum łokieto";
    }
}

class cantElbow implements ElbowHit{

    public String elbow() {
        return "nie umiem łokieta";
    }
}