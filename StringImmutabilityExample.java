package Assignment;
public class StringImmutabilityExample {
    public static void main(String[] args) {
        String greeting = "Hello";  // Create a new String object
        System.out.println("Original String: " + greeting);  // Output: Hello
        
        // Modify the String (Note: String is immutable)
        greeting = greeting + ", World!";  // Creates a new String object

        // Original String object is unchanged
        System.out.println("Modified String: " + greeting);  // Output: Hello, World!
        
        // Demonstrate the original object still exists with its original value
        String originalGreeting = "Hello";  // New reference to "Hello"
        System.out.println("Original Greeting: " + originalGreeting);  // Output: Hello
    }
}

