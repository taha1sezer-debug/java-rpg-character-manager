import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of character to generate:");
        int crcter = input.nextInt();

        input.nextLine();

        for (int i = 0; i < crcter; i++) {
            System.out.println("Character" + (i + 1));

            System.out.print("Enter character name: ");
            String name = input.nextLine();

            System.out.print("Enter Base Power: ");
            double basePower = input.nextDouble();

            System.out.print("Enter Item Bonus Percentage: ");
            double itemBonusPercentage = input.nextDouble();

            input.nextLine();

            GameCharacter character = new GameCharacter(name,basePower,itemBonusPercentage);

            System.out.println(character.getName()+"'s Total Power:"+ character.getTotalPower());
            System.out.println("Rarity Tier:"+ character.getRarityTier());
            System.out.println("\n");
        }
        System.out.println("Total Characters Created:"+ GameCharacter.getCharacterCount());
    }
}
