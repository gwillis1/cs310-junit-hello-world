package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        // Create a StringBuilder and append the input string
        StringBuilder reversed = new StringBuilder(message);
        
        // Reverse the StringBuilder
        reversed.reverse();
        
        // Convert the reversed StringBuilder back to a string
        return reversed.toString();
    }
}
