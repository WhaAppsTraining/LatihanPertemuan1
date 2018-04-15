package whitaaplikasinusantara.latihan;

/**
 * @author hendrawd on 15/04/18
 */
// public adalah access modifier
// terdapat 4 access modifier di java, yaitu
// private = dapat diakses oleh kelas itu sendiri
// protected = dapat diakses oleh kelas di package yang sama
//             atau turunan dari kelas itu
// public = dapat diakses oleh semua kelas
// default(kosongan) = dapat diakses oleh package yang sama
public class Animal {

    protected boolean isBerbulu = false;
    boolean isWalking = false;

    // enkapsulasi/encapsulation
    private boolean isBreathing = true;

    private int counterIsBreathingCall = 0;

    public boolean isBreathing() {
        return isBreathing;
    }

    public void setBreathing(boolean breathing) {
        isBreathing = breathing;
        counterIsBreathingCall++;
    }
}
