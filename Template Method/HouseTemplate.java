public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){ 
        System.out.println("--Starting Construction--.");
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        buildRoof();
        System.out.println("--House is Built--.");
    }
    
    //default implementation
    public void buildFoundation() {
        System.out.println("Building foundation with Cement, Iron Rods and Sand");
    }

    //methods to be implemented by subclasses
    public abstract void buildPillars();
    public abstract void buildWalls();
    
    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    public void buildRoof() {
        System.out.println("Building Roof");
    }
}