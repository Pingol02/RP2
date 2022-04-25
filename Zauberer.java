package RPG;

public class Zauberer extends Spielfigur{

    private int zauberpunkte;

    public Zauberer(String name, int staerkepunkte, int zauberpunkte) {
        super(name, staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void zaubern() throws KeineKraftException{
        if (zauberpunkte <= 0) {
            throw new KeineKraftException("zauberen ", getName());
        } else {
            System.out.println(getName() + " zaubert, ein Zauberpunkte wird verbraucht.");
            zauberpunkte--;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "RPG.Zauberer{" +
                "zauberpunkte=" + zauberpunkte +
                '}';
    }
}
