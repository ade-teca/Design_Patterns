package factory.phone;

public class IOS implements Os{
    @Override
    public void spec() {
        System.out.println("Eu sou privada e segura");
    }
}
