package oodp.principles;

public class HomePhone extends Phone {
    public HomePhone(){
        setMessageBehaviour(new CantSendMessage());
    }

    @Override
    public void Display() {
        System.out.println("Wired");
    }

    @Override
    public void call() {
        System.out.println("Call");
    }
}
