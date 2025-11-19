import java.util.ArrayList;

public class MapModel{
    private ArrayList<String> visited = new ArrayList<>();
    private ArrayList<String> available = new ArrayList<>();

    public ArrayList<String> getVisited(){
        return visited;
    }

    public void setVisited(String location){
        visited.add(location);
    }

    public ArrayList<String> getAvailable(){
        return available;
    }

    public void setAvailable(String location){
        available.add(location);
    }
}