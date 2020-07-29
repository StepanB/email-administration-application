package cz.stepanbohm.emailapp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Email em1 = new Email("John", "Doe");
        System.out.println(em1.toString());

        em1.setAlternateEmail("js@gmail.com");
        System.out.println(em1.toString());
    }
}
