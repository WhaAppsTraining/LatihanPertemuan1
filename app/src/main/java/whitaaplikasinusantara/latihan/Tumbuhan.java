package whitaaplikasinusantara.latihan;

/**
 * @author hendrawd on 15/04/18
 */
// contoh abtract class
public abstract class Tumbuhan {

    // abstract method cuma
    // bisa di abstract class
    abstract boolean bisaDimakan();

    abstract boolean berAkar();

    // method that has implementation
    boolean berwarnaHijau() {
        return true;
    }
}
