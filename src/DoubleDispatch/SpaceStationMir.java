package DoubleDispatch;

public class SpaceStationMir extends GameObject{

    public SpaceStationMir(int left, int top, int right, int bottom) {
        super(left, top, right, bottom);
    }

    @Override
    public void collision(GameObject gameObject) {
       gameObject.collisionResolve(this);
    }

    @Override
    public void collisionResolve(FlamingAsteroid asteroid) {
        System.out.println(asteroid.getClass().getSimpleName() + " is damaged! " + this.getClass().getSimpleName() + " is set on fire!");
        setDamaged(true);
        setOnFire(true);
    }

    @Override
    public void collisionResolve(Meteoroid meteoroid) {
        System.out.println(meteoroid.getClass().getSimpleName() + " is damaged! ");
        setDamaged(true);
    }

    @Override
    public void collisionResolve(SpaceStationMir mir) {
        System.out.println(mir.getClass().getSimpleName() + " is damaged! ");
        setDamaged(true);
    }

    @Override
    public void collisionResolve(SpaceStationIss iss) {
        System.out.println(iss.getClass().getSimpleName() + " is damaged! ");
        setDamaged(true);
    }
}
