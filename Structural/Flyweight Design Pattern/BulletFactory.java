import java.util.LinkedHashMap;
import java.util.Map;

public class BulletFactory {

    private static Map<EnumBulletSize, Bullet> map = new LinkedHashMap<>();

    public static Bullet createBullet(EnumBulletSize bulletSize) {

        Bullet bullet = map.get(bulletSize);

        if (bullet == null) {
            bullet = new Bullet(bulletSize);
            map.put(bulletSize, bullet);
        }

        return bullet;
    }
}
