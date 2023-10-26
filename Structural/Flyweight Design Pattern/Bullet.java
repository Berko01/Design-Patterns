public class Bullet {

    private EnumBulletSize bulletSize;

    public Bullet(EnumBulletSize bulletSize) {
        this.bulletSize = bulletSize;

        System.out.println(bulletSize.getSize() + " mm bullet created");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fire() {
        System.out.println("Fire");
    }
}