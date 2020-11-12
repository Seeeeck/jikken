package Controller;

import Model.Grid;
import View.Gameview;

public class RunGame {
    public void setUp(int width,int height,int cellSize){
        Grid grid = new Grid(width,height,cellSize);
        Gameview gameview = new Gameview(grid);
        GameController gameController = new GameController(grid,gameview);


    }

    public static void main(String[] args) {
        int width = 900;int height = 600; int cellSize = 30;
        Grid grid = new Grid(width,height,cellSize);
        Gameview gameview = new Gameview(grid);
        GameController gameController = new GameController(grid,gameview);

    }
}
