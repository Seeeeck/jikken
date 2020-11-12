package Model;
import java.util.LinkedList;

public class Snake{
    private LinkedList<Node> body = new LinkedList<Node>();
    private Direction direction;
    public Node eat(){

        return null;
    }

    public Node move(Direction direction){

        return null;
    }

    public Snake(Direction direction){
        this.direction = direction;
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