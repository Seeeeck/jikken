package View;

import Model.Grid;
import Model.Node;

import java.util.LinkedList;

public class Gameview {
    private final int winWidth;
    private final int winHeight;
    private final int cellSize;
    private Grid grid;

    public Gameview(Grid grid){
        this.grid = grid;
        winWidth = grid.getWidth();
        winHeight = grid.getHeight();
        cellSize = grid.getCellSize();
    }

    public void initGame(){

    }

    public void showStartGame(){

    }

    public int showScore(){

        return 0;
    }

    public void drawSnake(LinkedList<Node> body){

    }

    public Node drawFood(Node food){

        return food;
    }

    public void showGameover(){

    }

}
