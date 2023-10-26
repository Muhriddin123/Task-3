package koschei.models;

public class Deth8 {
    private final Egg6 egg6;

    public Deth8(Egg6 egg6){
        this.egg6=egg6;
    }
    @Override
    public String toString(){
        return", в яйце иголка" + egg6.toString();
    }
}
