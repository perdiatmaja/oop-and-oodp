import object.Bike;
import object.Vehicle;
import oodp.principles.CanSendMessage;
import oodp.principles.HomePhone;
import oodp.puzzle.Condition;
import oodp.puzzle.HPCondition;
import oodp.puzzle.PotionHPBehaviour;

public class Main {

    public static void main(String[] args) {
        separator("OOP Concepts");
        Vehicle vehicle = new Bike();
        vehicle.setDriver("Sim C");
        System.out.println(vehicle.getDriver());
        vehicle.startEngine();

        separator("Design Principle");
        HomePhone homePhone = new HomePhone();
        homePhone.Display();
        homePhone.call();
        homePhone.sendMessage();
        homePhone.setMessageBehaviour(new CanSendMessage());
        homePhone.sendMessage();

        separator("Design Puzzle");
        Condition condition = new HPCondition(new PotionHPBehaviour());
        condition.low();
    }

    private static void separator(String message){
        System.out.println("------------------------------------");
        System.out.println(message);
    }
}
