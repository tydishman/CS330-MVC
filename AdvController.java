public class AdvController{
    AdvModel adventurer;
    LocationModel location;
    MapModel map;
    AdvView adventureView;
    LocationView locationView;
    OrgView orgView;

    
    public AdvController(AdvModel adv, LocationModel location, MapModel map){
        this.adventurer = adv;
        this.location = location;
        this.map = map;
    }

    public void updatePlayerEquipment(LocationModel loc, AdvModel player) {
        player.
    }


    public void setAdventureSword(String sword){
        adventurer.setSword(sword);
    }

}