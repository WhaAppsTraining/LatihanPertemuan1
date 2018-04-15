package whitaaplikasinusantara.latihan;

import whitaaplikasinusantara.latihan.catcontainer.Cat;

/**
 * @author hendrawd on 15/04/18
 */
public class PenjinakBinatang {

    public static void main(String[] args) {
        PenjinakBinatang reno = new PenjinakBinatang();
        // Polymorphism(mempunyai banyak bentuk)
        reno.jinakin(new Ilama());
        reno.jinakin(new Cat());
        reno.jinakin(new Animal());
    }

    public void jinakin(Animal animal) {

    }

}
