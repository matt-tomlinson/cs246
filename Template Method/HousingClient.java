public class HousingClient {
 
    public static void main(String[] args) {
        System.out.println("");

        HouseTemplate houseType = new WoodenHouse();
         
        //using template method
        houseType.buildHouse();

        System.out.println("");
         
        houseType = new GlassHouse();

        //using template method
        houseType.buildHouse();
        
        System.out.println("");
    }
}