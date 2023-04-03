import java.util.*;
public class charcprint implements Runnable {
    private char startChar;
    private char endChar;
    
    public charcprint(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }
    
    public void run() {
        for (char ch = startChar; ch <= endChar; ch++) {
            System.out.print(ch + " ");
            try {
                Thread.sleep(1000); // Wait for one second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the starting Character:");
        char startChar =s.next().charAt(0);
        System.out.println("Enter the Endding Character:");
        char endChar = s.next().charAt(0);
        
        CharacterPrinter characterPrinter = new charcprint(startChar, endChar);
        Thread thread = new Thread(charcprint);
        thread.start();
    }
}