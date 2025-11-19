public class MapView {

    public void display(LocationModel location) {
        System.out.println("Visited locations: " + location.getVisited());
        System.out.println("Available locations: " + location.getAvailable());
    }
}