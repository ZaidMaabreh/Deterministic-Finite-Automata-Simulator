import java.util.*;
import java.lang.String;
public class Automata {
    List<State> States = new ArrayList<>();
    List<Arc> Arcs = new ArrayList<>();
    String ALphabet ;
    State Start ;

    public Automata(String ALphabet)
    {
        this.ALphabet = ALphabet ;
    }
    public void createState(int name, boolean isFinal, boolean isStart)
    {
        State temp = new State(name , isFinal, isStart);
        if (isStart)
        {
            Start = temp;
        }
        States.add(temp);
    }

    public void createArc(String symbol, int startState, int endState) {
        if (ALphabet.contains(String.valueOf(symbol))) {
            Arc temp = new Arc();
            temp.symbol = symbol;
            temp.beginState = startState;
            temp.finishState = endState;
            Arcs.add(temp);
        } else

            System.out.println("The arc symbol you entered does not belong to the alphabet\n");
    }
    public boolean checkString(String input)
    {
        int currentState = Start.name;

        for (int i = 0; i < input.length(); i++)
        {
            currentState = nextState(currentState, input.charAt(i));
        }

        return returnState(currentState).isFinal;

    }
    public int nextState(int currentState, char transition)
    {

        for (int i = 0; i != Arcs.size() ; i++)
        {
            if ((Arcs.get(i)).symbol.compareTo(String.valueOf(transition)) == 0 && (Arcs.get(i)).beginState == currentState)
                return (Arcs.get(i)).finishState;
        }
        return -1;
    }

    public State returnState(int name)
    {
        State temp = new State();
        temp.name = -1;

        for (int i = 0; i != States.size(); i++)
        {
            if ((States.get(i)).name == name)
               return (States.get(i));
        }
        return temp;
    }

}
