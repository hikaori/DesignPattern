package comfrom;

/**
 * Created by kaorihirata on 2017-09-03.
 */
public class Hanako implements Chairperson {
    private Taro taro;
    public Hanako(){
        taro = new Taro();
    }

    @Override
    public void organizeClass() {
        taro.enjoyWithAllClassmate();
    }
}
