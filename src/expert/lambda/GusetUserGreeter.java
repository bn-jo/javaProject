package expert.lambda;

public class GusetUserGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Welcome to our app . please create an account or log in");
    }
}
