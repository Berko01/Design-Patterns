public abstract class Soldier {

    private EnumBulletSize bulletSize;

    public Soldier(EnumBulletSize bulletSize) {
        this.bulletSize = bulletSize;
    }

    public void fire() {

        Bullet bullet = BulletFactory.createBullet(bulletSize);
        bullet.fire();
    }

    public void patrol() {

        for (int i = 0; i < 5; i++) {
            fire();
        }
    }
}
