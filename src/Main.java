import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FootBallPlayer player1 = new FootBallPlayer(8, "Lamar Jackson");
        FootBallPlayer player2 = new FootBallPlayer(62,"Jason Kelce");
       //System.out.println(player1.getName());
       //System.out.println(player2.getJerseyNumber());
       //player2.setJerseyNumber(15);
       //System.out.println(player2.getJerseyNumber());

        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a jersey number");
        int jersey = input.nextInt();
        input.nextLine();
        System.out.println("Please give me the player name");
        String name = input.nextLine();
        FootBallPlayer player3 = new FootBallPlayer(jersey,name);
        System.out.println(player3);
    }
}