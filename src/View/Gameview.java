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
        //ゲームサイズとかの初期設定

    }

    public void showStartGame(){
        //start画面を表示する。
    }

    public int showScore(){
        //スコアを表示する
        return 0;
    }

    public void drawSnake(LinkedList<Node> body){
        //蛇を表示する
    }

    public Node drawFood(Node food){
        //foodを表示する
        return food;
    }

    public void showGameover(){
        //gameover画面を表示する
    }

}
