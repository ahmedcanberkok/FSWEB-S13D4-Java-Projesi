public class Player {

    String name;
    int healthPercentage;
    Weapon weapon;

    public Player (String name, int healthPercentage, Weapon weapon ) {
        this.name = name ;
        if (healthPercentage > 100 ) {
            this.healthPercentage = 100 ;

        } else if (healthPercentage < 0 ) {
            this.healthPercentage = 0 ;
        }else {
            this.healthPercentage = healthPercentage ;
        }
        this.weapon = weapon ;

    }

    public int healthRemaining () {
        return  healthPercentage;
    }
    public void loseHealth( Weapon weapon) {
        healthPercentage -= weapon.getDamage();
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of the game");
        }

    }
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }


    }

}
