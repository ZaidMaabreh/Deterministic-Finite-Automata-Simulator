public class State {
    public  int name;
    public boolean isFinal;
    public boolean isStart;

    State()
    {

    }
    State(int name , boolean isFinal , boolean isStart)
    {
        this.name = name ;
        this.isFinal = isFinal ;
        this.isStart = isStart ;
    }
}
