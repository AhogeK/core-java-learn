package ahogek.com.github.welcome;

/**
 * javac -d out/production/core-java-learn src/ahogek/com/github/welcome/Welcome.java
 * java -cp out/production/core-java-learn ahogek.com.github.welcome/Welcome
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
