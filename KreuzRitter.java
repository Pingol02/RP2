package RPG;

public class KreuzRitter extends Spielfigur {

    private int zauberpunkte;

    public KreuzRitter(String name, int staerkepunkte, int zauberpunkte) {
        super(name, staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void laeutern(Spielfigur sf) throws KeineKraftException {
        if (zauberpunkte <= 4) {
            throw new KeineKraftException("läutern ", getName());
        } else {
            System.out.println(getName() + " läutert, fünf Zauberpunkte wird verbraucht.");
            zauberpunkte -= 5;
            sf.setHp(getHp() - 15);
        }
    }

    public void heilen(Spielfigur sf) throws KeineKraftException {
        if (zauberpunkte <= 5) {
            throw new KeineKraftException("heilen ", getName());
        } else {
            System.out.println(getName() + " heilt, sechs Zauberpunkte wird verbraucht.");
            zauberpunkte -= 6;
            sf.setHp(getHp() + 17);
        }
    }
}
