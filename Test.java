package RPG;

public class Test {
    public static void main(String[] args) throws KeineKraftException {
        Zauberer sf = new Zauberer("Gilgamesh", 4, 10);
        Elfe elfe = new Elfe("Dimiugrte", 10);
        try {
            sf.laufen();
            sf.kaempfen();
            sf.zaubern();
            elfe.rennen();
        } catch (KeineKraftException e){
            System.out.println(e);
        }

    }
}
