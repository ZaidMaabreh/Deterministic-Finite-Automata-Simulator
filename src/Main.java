import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       String input, alphabet;
       String symbol;
       int stateName, numOfStates, fromState, toState, inputNum;
       boolean Final , Start ;
       System.out.println("-------------------------\n");
       System.out.println( "Please enter the language alphabet concatenated ex: ab , 01 , abc\n" ) ;

       Scanner sc = new Scanner(System.in);
       alphabet = sc.nextLine();
       Automata automaton = new Automata(alphabet);
       System.out.println("\n------------------------\n");
       System.out.println("Please enter the number of states in the automaton\n");

       numOfStates = sc.nextInt() ;

       for (int i = 0; i < numOfStates; i++)
       {
           System.out.println("\nEnter the state number (integer) and if its a start state 0 or 1 and if its a final state 0 or 1\nEample: 1 0 0 , 0 0 1\n");
           stateName = sc.nextInt();
           Start = sc.nextBoolean();
           Final = sc.nextBoolean();

           automaton.createState(stateName, Start, Final);
       }
       System.out.println( "\n------------------------\n");
       System.out.println("Please enter the arcs (edges) in this format:\n symbol fromState toState ex: a 0 0 (loop)");
       for (int i = 0; i < alphabet.length() * numOfStates; i++)
       {
           System.out.println( "\nEnter Arc:  " );
           symbol = sc.next() ;
           fromState = sc.nextInt() ;
           toState = sc.nextInt() ;
           automaton.createArc(symbol, fromState, toState);
       }

       System.out.println("\n------------------------\n");
       System.out.println( "Please the number of inputs you want to check\n");
       inputNum = sc.nextInt();
       for (int i = 0; i < inputNum; i++)
       {
           System.out.println( "\n------------------------");
           System.out.println( "\nEnter the input to check:  ");
           input = sc.nextLine();
           if (automaton.checkString(input))
               System.out.println("\nThe string \"" + input + "\" is Accepted");
           else
               System.out.println( "\nThe string \"" + input + "\" is Rejected");
       }

     }
    }
