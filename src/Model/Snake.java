package Model;
import java.util.LinkedList;

public class Snake{
    private LinkedList<Node> body = new LinkedList<Node>();

    public Node eat(){
        //頭のx,yがfoodのx,yが一致したらmove()で消されたNodeをaddTailで追加する。

        return null;
    }

    public Node move(Direction direction){
        //蛇の方向に応じて一コマ移動する。
        //ヒント:bodyの先頭にNode一個追加し、最後の要素を消す。
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