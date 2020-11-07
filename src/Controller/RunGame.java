package Controller;

import Model.Grid;
import View.Gameview;

public class RunGame {
    public void setUp(int width,int height,int cellSize){
        Grid grid = new Grid(width,height,cellSize);
        GameController gameController = new GameController(grid);
        Gameview gameview = new Gameview(grid);

    }

    public void draw(){

    }
}
