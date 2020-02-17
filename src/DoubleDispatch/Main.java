package DoubleDispatch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var objects = List.of(
                new FlamingAsteroid(0, 0, 5, 5),
                new SpaceStationMir(1, 1, 2, 2),
                new Meteoroid(10,10,15,15),
                new SpaceStationIss(12,12,14,14)
        );
        objects.forEach(o -> System.out.println(o.toString()));
        {
            System.out.println("");
        }

        objects.forEach(o1 -> objects.forEach(o2 -> {
            if (o1 != o2 && o1.intersectsWith(o2)){
                o1.collision(o2);
            }
        }));
        System.out.println("");

        objects.forEach(o -> System.out.println(o.toString()));
        System.out.println("");
    }
}
