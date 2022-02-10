
    package com.advanced.lambda;

    import java.util.Scanner;

    public class FunctionalProgrammingApp {
        public static void main(String[] args) {
            WelcomeMessageService welcomeMessageService = new WelcomeMessageService();
            Scanner userStatusScanner = new Scanner(System.in);
            String userStatus = userStatusScanner.nextLine();

            Greeter greeter ;
            if ("guest".equals(userStatus)) {
                greeter = () -> System.out.println("Welcome to our app . please create an account or log in");
            }else if ("loggedIn".equals(userStatus)){
                greeter = () -> System.out.println("Welcome back");
            }else {
                greeter = ()-> System.err.println("unknown user status !");
            }
            Greeter loggedInUserGreeter = ()-> System.out.println("Welcome back");
            welcomeMessageService.greet ( greeter);

        }
    }

