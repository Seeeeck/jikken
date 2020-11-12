package Model;

import jdk.jshell.SnippetEvent;

import java.util.LinkedList;

public class Grid {
    private boolean isdead;
    //盤面の状態を記録し、蛇の体があるところをtrueにする。
    private final boolean status[][];
    private final int width;
    private final int height;
    private final int cellSize;
    private Snake snake;
    private Node food;
    //初期方向:左
    private Direction direction = new Direction('L');


    public Grid(int width,int height,int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        status = new boolean[height][width];
        snake = initSnake();
        food = crateFood();
    }

    public Node crateFood() {
        //foodを乱数で一個作る。foodが蛇の体と重ならないようにする。
        return food;
    }

    private Snake initSnake() {
        //snakeのインスタンスを作り、初期設定をし、盤面情報(status)を更新する。体三つ
        isdead=false;
        return snake;
    }

    private boolean isFood(Node head){
        return head.getX() == food.getX() && head.getY() == food.getY();
    }

    public boolean nextRound(){
        //移動したら蛇がまだ生きていたならtrueを返す。
        /*
        蛇を一歩動かす
        if(頭が合法かどうか){
            if(isFood()){
                eat()
                新しいfoodを作る
            }
            盤面情報を更新する
        }
         */

        return !isdead;
    }

    private boolean isLegal(Snake snake){
        //頭のいる位置が合法的かどうかを判断する
        Node head = snake.getHead();
        LinkedList<Node> body = snake.getBody();
        boolean isInLegalArea = head.getX()>-1 && head.getX()<(width/cellSize) && head.getY()>-1 && head.getY()<(height/cellSize);
        boolean isInBody = false;
        for(int i=1;i<body.size();i++){
            if (head.getX() == body.get(i).getX() && head.getY() == body.get(i).getY()) {
                isInBody = true;
                break;
            }
        }
        isdead = isInBody || !isInLegalArea;
        return !isInBody && isInLegalArea;
    }

    public void changeDirection(char newDirection) {
        if (direction.compatibleWith(newDirection)) {
             direction.setDirectionCode(newDirection);
        }
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getCellSize(){
        return cellSize;
    }

    public boolean getIsdead(){
        return isdead;
    }

    public Snake getSnake(){
        return snake;
    }

    public Node getFood(){
        return food;
    }
}
