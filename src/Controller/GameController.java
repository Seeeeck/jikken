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

    public boolean startButton(){
        //game startボタンを機能させる、Start文字の範囲内にクリックしたらfalseを返す,else trueを返す
        boolean flag = false;
        return flag;
    }

    public boolean restartButton(){
        //restartボタンを機能させる　,restart文字の範囲内にクリックしたらflaseを返す、else trueを返す
        boolean flag = false;
        return flag;
    }


}
