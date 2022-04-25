package RPG;

public abstract class Spielfigur {

    private String name;
    private int staerkepunkte;

    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void laufen() throws KeineKraftException {
        if (staerkepunkte <= 0) {
            throw new KeineKraftException("läufen ", name);
        } else {
            System.out.println(name + " läuft, ein Stärkepunkt wird verbraucht");
            staerkepunkte--;
        }
    }

    public void klettern() throws KeineKraftException {
        if (staerkepunkte <= 1) {
            throw new KeineKraftException("klättern ", name);
        } else {
            System.out.println(name + " klättert, zwei Stärkepunkt wird verbraucht");
            staerkepunkte -= 2;
        }
    }

    public void kaempfen() throws KeineKraftException {
        if (staerkepunkte <= 2) {
            throw new KeineKraftException("kämpfen ", name);
        } else {
            System.out.println(name + " kämpft, drei Stärkepunkt wird verbraucht");
            staerkepunkte -= 3;
        }
    }

    @Override
    public String toString() {
        return "RPG.Spielfigur{" +
                "name='" + name + '\'' +
                ", staerkepunkte=" + staerkepunkte +
                '}';
    }

}
