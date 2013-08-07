


public class Node {

    private char character;
    private int state;
    private boolean acceptedState;
    int a;
    public Node(char character, int state, boolean acceptedState) {
        this.character = character;
        this.state = state;
        this.acceptedState = acceptedState;
    }

    public char getCharacter() {
        return character;
    }

    public int getState() {
        return state;
    }

    public boolean isAcceptedState() {
        return acceptedState;
    }

    

}
