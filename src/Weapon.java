//Sabit degerleri tutmak icin kullaniriz.
public enum Weapon {
    RIFLE (50) ,
    SHOTGUN(60),
    BOMB(70),
    KNIFE(15),
    KAR98(105);
    private  int damage ;

    Weapon (int damage) {
        this.damage = damage ;
    }

    public int getDamage() {
        return damage;
    }
}
