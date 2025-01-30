package Assignment;
public class StringBufferMutabilityExample {
    public static void main(String[] args) {
        // Create a StringBuffer object with a different variable name
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);  // Output: Hello

        // Modify the StringBuffer by appending text
        sb.append(", World!");  // Modifies the same StringBuffer object
        System.out.println("After appending: " + sb);  // Output: Hello, World!

        // Modify the StringBuffer by inserting text at a specific position
        sb.insert(6, "Java ");  // Modifies the same StringBuffer object
        System.out.println("After inserting: " + sb);  // Output: Hello Java, World!

        // Modify the StringBuffer by deleting a portion of text
        sb.delete(5, 10);  // Modifies the same StringBuffer object
        System.out.println("After deleting: " + sb);  // Output: Hello World!
       
    }
}

