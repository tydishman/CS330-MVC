public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        AdvModel john = new AdvModel();
        LocationModel location = new LocationModel();
        MapModel map = new MapModel();

        AdvController johnController = new AdvController(john, location, map);
    }
}