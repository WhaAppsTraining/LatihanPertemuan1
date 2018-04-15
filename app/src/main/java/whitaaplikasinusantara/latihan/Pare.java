package whitaaplikasinusantara.latihan;

/**
 * @author hendrawd on 15/04/18
 */
// Tumbuhan merupakan parent dari Pare
// Pare perupakan child dari Tumbuhan
public class Pare extends Tumbuhan {

    public static void main(String[] args) {
        Pare pohonKeren = new Pare();
        pohonKeren.berwarnaHijau();
    }

    // engga bisa karena Pare
    // bukan abstract class
    // abstract boolean isPait();

    // implementasi dari
    // abstract method parent
    @Override
    boolean bisaDimakan() {
        return false;
    }

    // Annotation
    // Override menandakan bahwa kelas ini
    // mengimplentasikan ulang method dari parent
    @Override
    boolean berAkar() {
        return true;
    }
}
