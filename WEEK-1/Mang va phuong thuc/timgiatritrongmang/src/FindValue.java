import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        System.out.println("The application searches for values in an array");

        String[] player = {"Ronaldo", "Messi", "Kaka", "Rooney", "Pogba","Mpape", "lindgar", "Hazard", "Ramos", "De Gea"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's footbal player: ");
        String input_player = sc.nextLine();

        boolean isExit = false;
        for(int i = 0; i < player.length; i++){
            if(player[i].equals(input_player)){
                System.out.println("Position of the football player in the list " + input_player + "is: " + ( i + 1 ));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found " + input_player + " in the list.");
    }
}
