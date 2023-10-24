public class Game {
    private Consol consol;

    public Game() {
        System.out.println("Oyun basliyor");

        consol = new Offense();
    }

    public void triangle() {
        consol.pressTriangle();
    }

    public void square() {
        consol.pressSquare();
    }

    public void circle() {
        consol.pressCircle();
    }

    public void x() {
        consol.pressX();
    }

    public void getTheBall() {
        System.out.println("Top kapildi. Hucuma cikiliyor!");
        consol = new Offense(); 
    }

    public void loseTheBall() {
        System.out.println("Top kaptirildi! Allah'ini seven defansa gelsin.");
        consol = new Defense();
    }

}
