public class TrollCreator extends UnitCreator{
    @Override
    public IUnit createUnit(){
        return new Troll();
    }
}
