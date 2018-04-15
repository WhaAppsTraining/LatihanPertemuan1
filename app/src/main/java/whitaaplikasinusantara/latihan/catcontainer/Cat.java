package whitaaplikasinusantara.latihan.catcontainer;

import whitaaplikasinusantara.latihan.Animal;
import whitaaplikasinusantara.latihan.Ilama;
import whitaaplikasinusantara.latihan.Predator;

/**
 * @author hendrawd on 15/04/18
 */
// konsep inheritance(penurunan)
public class Cat extends Animal implements Predator  {

    public static void main(String[] args) {
        Cat bobby = new Cat();

        // Kita engga bisa bikin object/instance dari
        // kelas abstract
        // Tumbuhan kecambah = new Tumbuhan() {
        //     @Override
        //     public int hashCode() {
        //         return super.hashCode();
        //     }
        // };

        // interface bisa dibikin instancenya
        Predator edi = new Predator() {
            @Override
            public void makan(Animal animal) {
            }
        };

        // isBreathing tidak bisa diakses karena private
        // bobby.isBreathing = false;

        // isWalking tidak bisa diakses karena default(tidak ada access modifier),
        // serta Cat dan Animal berbeda package
        // bobby.isWalking = true;

        bobby.isBerbulu = true;
        bobby.makan(new Ilama());
    }

    @Override
    public void makan(Animal animal) {

    }
}
