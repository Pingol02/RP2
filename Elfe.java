package RPG;

public class Elfe extends Spielfigur{

    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }

    public void rennen() throws KeineKraftException {
        if (getStaerkepunkte() <= 1) {
            throw new KeineKraftException("rennen ", getName());
        } else {
            System.out.println(getName() + " rennt, zwei Stärkepunkte wird verbraucht.");
            setStaerkepunkte(getStaerkepunkte() -2);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
