public class KnightCreator extends UnitCreator {

    @Override
    public IUnit createUnit() {
        return new Knight();
    }
}