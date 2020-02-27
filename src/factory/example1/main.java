package factory.example1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("Ship type? (U / R / B)");
            if (cin.hasNextLine()){
                String typeOfShip = cin.nextLine();
                theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            }
            if (theEnemy != null)
            {
                doStuffEnemy(theEnemy);
            } else System.out.println("Wrong input, enter U, R or B.");
        } while (theEnemy == null);


      }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.DisplayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.EnemyShipShoots();
    }
}
