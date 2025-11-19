public class OrcFightView {

    public void display(AdvModel player) {
        String sword = player.getSword();
        String shield = player.getShield();

        if(sword.equals("excellent") && shield.equals("shield")) {
            System.out.println("Orc was defeated");
        }
        else {
            System.out.println("You were defeated");
        }
    }
}