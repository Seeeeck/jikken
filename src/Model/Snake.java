package Model;
import java.util.LinkedList;

public class Snake{
    private LinkedList<Node> body = new LinkedList<Node>();

    public Node eat(){

        return null;
    }

    public Node move(Direction direction){

        return null;
    }

    public LinkedList<Node> getBody(){
        return body;
    }

    public Node getHead(){
        return body.getFirst();
    }

    public void addTail(Node tail){
        body.addLast(tail);
    }
}