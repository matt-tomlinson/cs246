public class GlassHouse extends HouseTemplate {
 
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }
 
    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Glass Coating");
    }

    @Override
    public void buildFoundation() {
        System.out.println("Building foundation with Glass Blocks");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building Glass Roof");
    }
 
}