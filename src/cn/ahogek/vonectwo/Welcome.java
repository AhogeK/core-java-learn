package cn.ahogek.vonectwo;

/**
 * this program displays a greeting for the reader
 * <p>
 * javac -d out/production/core-java-learn src/cn/ahogek/vonectwo/welcome/Welcome.java
 * java -cp out/production/core-java-learn cn.ahogek.vonectwo.Welcome
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
