public class HugoBOSS extends GameEntity{

    public WeaponType getGiveWeaponToBoss() {
        return giveWeaponToBoss;
    }

    public void setGiveWeaponToBoss(WeaponType giveWeaponToBoss) {
        this.giveWeaponToBoss = giveWeaponToBoss;
    }

    private WeaponType giveWeaponToBoss;

    @Override
    public String toString() {
        return getName() + "\nhealth = "+ getHealth()+
                "\ndamage = " + getDamage() +
                "\nattack = " + getAttack() +
                "\ndefence = " + getDefence() +
                "\ngiveWeaponToBoss = " + getGiveWeaponToBoss();
    }

    public HugoBOSS(String boss, int health, int damage, int attack, int defence, WeaponType giveWeaponToBoss) {
        super(boss, health, damage, attack, defence);
        this.giveWeaponToBoss = giveWeaponToBoss;
    }
}
