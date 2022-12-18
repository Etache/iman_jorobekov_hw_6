import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHeroType("Sauron");
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeaponType(WeaponType.ELEMENTAL);

        System.out.println(boss.printInfo());


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHeroType("Skeleton archer 1");
        skeleton1.setHealth(100);
        skeleton1.setDamage(20);
//        skeleton1.setWeaponType(WeaponType.FIRE_ARROWS);
        skeleton1.setArrowAmount(20);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHeroType("Skeleton archer 2");
        skeleton2.setHealth(90);
        skeleton2.setDamage(15);
//        skeleton2.setWeaponType(WeaponType.ICE_ARROWS);
        skeleton2.setArrowAmount(20);

        System.out.println("\n" + skeleton1.printSkeletonInfo() + "\n" + skeleton2.printSkeletonInfo());

    }
}