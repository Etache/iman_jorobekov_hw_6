public class Boss extends GameEntity {
    private WeaponType weaponType;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Boss() {
        super();
    }
    public String printInfo(){
        return "Name: " + this.heroType + "\nHealth: " + this.health + "\nDamage: " + this.damage + "\nWeapon type: " + this.weaponType ;
    }
}
