package lesson1;

import java.awt.*;
import java.util.Random;

public class Background extends GameCanvas{
    GameCanvas gameCanvas;
    private Random rand = new Random();
    public Background(GameCanvas gameCanvas){
        this.gameCanvas = gameCanvas;
        //while (true){
          //  if (System.nanoTime()%2==0){

            //}
      //  }
    }
    public void backG(){
        Color color1 = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
        gameCanvas.setBackground(color1);
    }
}
