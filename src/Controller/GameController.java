package Controller;

import Model.Grid;
import View.Gameview;

public class GameController {
    private Grid grid;
    private Gameview gameview;

    public GameController(Grid grid,Gameview gameview){
        this.grid=grid;
        this.gameview=gameview;
    }

    public void changeDirection(){
        //キーボードでsnakeDirectionを変える。
    }

    public void startButton(){
        //game startボタンを機能させる
    }

    public void restartButton(){
        //restartボタンを機能させる　
    }


}
