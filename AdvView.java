public class AdvView {

    public void display(AdvModel player, LocationModel location, MapModel map) {
        int[] return_arr;
        
        System.out.println("Welcome to the " + location.getName() + "!");
        System.out.println("There is a chest here, open it? (y/n)");
        // scanner stuff
        if(choice.equals("n")) {
            System.out.println("You leave without opening the chest. You take some damage");
            return_arr[0] = 0;
        }
        else if(choice.equals("y")) {
            System.out.println("You open the chest. There's a " + location.getTreasure() + " in it, take it? (y/n)");
            
            if(choice.equals("y")) {
                System.out.println("You took the " + location.getTreasure() + "!");
                return_arr[0] = 1;
            }
            else if(choice.equals("n")) {
                System.out.println("You leave without taking the item. You take some damage");
                return_arr[0] = 0;
            }
        }

        System.out.print("Where to next: ");
        System.out.println(map.getAvailable());

        // scanner stuff


        return return_arr;
    }
}