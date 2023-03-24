import java.util.Scanner;

public class JavaDraw {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;

	System.out.print( "\nWhich animal would you like to draw?\n" );
        System.out.println( "Write 1 for butterfly " );
	System.out.println( "Write 2 for elephant  " );
	System.out.println( "Write 3 for bear      " );
        System.out.println( "Write 4 for snake     " );

        //Task 1 – Pick up the user's choice.
        choice = scan.nextInt();
        //Task 3 – Call the draw function, and pass in the user's choice.
        ChooseAnimal(choice);
        scan.close();
    }


       //Task 2 – Write a function 
    public static void ChooseAnimal(int animal){
            switch (animal) {
                    case 1:
                            Butterfly();
                            break;
                    case 2:
                            Elephant();
                            break;
                    case 3:
                            Bear();
                            break;
                    case 4:
                            Viper();
                            break;
                    default:
                            System.out.println("Out of range!");
        }
    }
    /**
     * Function name: draw - draws an animal that the user chooses.
     * @param choice: (int)
     * 
     * Inside the function: 
     *  • Based on the choice, draw:
     *      1. a butterfly
     *      2. elephant
     *      3. bear
     *      4. snake
     */  

     
     
//      Animal 1
    public static void Butterfly(){
        System.out.println("  .==-.                   .-==.     ");
        System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
        System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
        System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
        System.out.println("      `._... .q(_)p. ..._.'         ");
        System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
        System.out.println("        .\"\"' .'|=|`. `\"\".       ");
        System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
        System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
        System.out.println("      \\O `::/       \\::' O/       ");
        System.out.println("       \"\"--'         `--\"\"      ");


    }


        
//     Animal 2
public static void Elephant()
{
            System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
            System.out.println("   _.-'         \\ __...----...__ /         '-._");
            System.out.println(" .'      .:::...,'              ',...:::.      '.");
            System.out.println("(     .'``'''::;                  ;::'''``'.     )");
            System.out.println(" \\             '-)              (-'             /");
            System.out.println("  \\             /                \\             /");
            System.out.println("   \\          .'.-.            .-.'.          /");
            System.out.println("    \\         | \\0|            |0/ |         /");
            System.out.println("    |          \\  |   .-==-.   |  /          |");
            System.out.println("     \\          `/`;          ;`\\`          /");
            System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
            System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
            System.out.println("               / /`;   .==.   ;`\\ \\");
            System.out.println("         .---./_/   \\  .==.  /   \\ \\");
            System.out.println("        / '.    `-.__)       |    `\"");
            System.out.println("       | =(`-.        '==.   ;");
            System.out.println("        \\  '. `-.           /");
            System.out.println("         \\_:_)   `\"--.....-'");
        
    }
            




//     Animal 3
public static void Bear(){

        System.out.println("            ___   .--. ");
        System.out.println("      .--.-\"   \"-' .- |");
        System.out.println("     / .-,`          .'");
        System.out.println("     \\   `           \\");
        System.out.println("      '.            ! \\");
        System.out.println("        |     !  .--.  |");
        System.out.println("        \\        '--'  /.____");
        System.out.println("       /`-.     \\__,'.'      `\\");
        System.out.println("    __/   \\`-.____.-' `\\      /");
        System.out.println("    | `---`'-'._/-`     \\----'    _");
        System.out.println("    |,-'`  /             |    _.-' `\\");
        System.out.println("   .'     /              |--'`     / |");
        System.out.println("  /      /\\              `         | |");
        System.out.println("  |   .\\/  \\      .--. __          \\ |");
        System.out.println("   '-'      '._       /  `\\         /");
        System.out.println("               `\\    '     |------'`");
        System.out.println("                 \\  |      |");
        System.out.println("                  \\        /");
        System.out.println("                   '._  _.'");
        System.out.println("                      ``");
}




//     Animal 4
public static void Viper(){

        System.out.println("         ,,'6''-,.");
        System.out.println("        <====,.;;--.");
        System.out.println("        _`---===. \"\"\"==__");
        System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
        System.out.println("     |( @@@  |===|  @@@  ||");
        System.out.println("      \\\\ @@   |===|  @@  //");
        System.out.println("        \\\\ @@ |===|@@@ //");
        System.out.println("         \\\\  |===|  //");
        System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
        System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
        System.out.println("             |==||                           `\\   \\");
        System.out.println("            |==| |                             )   |");
        System.out.println("           |==| |       _____         ______,--'   '");
        System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
        System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
        System.out.println("                \"\"\"\"		");


}
         
     
     

}
