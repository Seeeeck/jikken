package Model;

import jdk.jshell.SnippetEvent;

import java.util.LinkedList;

public class Grid {
    private boolean isdead;
    private final boolean status[][];
    private final int width;
    private final int height;
    private final int cellSize;
    private Snake snake;
    private Node food;
    private Direction snakeDirection = Direction.L;

    public Grid(int width,int height,int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        status = new boolean[height][width];
        initSnake();
        crateFood();
    }

    public Node crateFood() {

        return food;
    }

    private Snake initSnake() {

        isdead=false;
        return snake;
    }

    public boolean nextRound(){

        return isdead;
    }

    private boolean isLegal(Snake snake){
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

    public void changeDirection(Direction newDirection) {
        if (snakeDirection.compatibleWith(newDirection)) {
            snakeDirection = newDirection;
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
}
