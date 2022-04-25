package RPG;

public class Test {
    public static void main(String[] args) throws KeineKraftException {
        Zauberer sf = new Zauberer("Gilgamesh", 4, 10);
        try {
            sf.laufen();
            sf.kaempfen();
            sf.zaubern();
        } catch (KeineKraftException e){
            System.out.println(e);
        }

    }
}
