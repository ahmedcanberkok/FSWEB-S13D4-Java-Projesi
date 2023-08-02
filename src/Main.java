public class Main {
    public static void main(String[] args) {
        System.out.println("****************POINT*********************");
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());
        System.out.println("****************WEAPON*********************");
        Player player1 = new Player("CANBERK", 100, Weapon.KAR98);
        player1.loseHealth(Weapon.BOMB);
        System.out.println("Initial health: " + player1.healthRemaining());
        System.out.println("After damage: " + player1.healthRemaining());

        player1.restoreHealth(20);
        System.out.println("After restoring health: " + player1.healthRemaining());


    }
}