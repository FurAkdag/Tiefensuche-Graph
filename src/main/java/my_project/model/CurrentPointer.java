package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class CurrentPointer extends GraphicalObject {

    double xt;
    double yt;
    boolean moving = false;

    public CurrentPointer(double x, double y){
        this.x = x;
        this.y = y;
        xt = x;
        yt = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledCircle(x,y,20);
    }

    @Override
    public void update(double dt){
        if(x > xt){
            x -= dt*5;
        }else if(y < yt){
            x += dt*5;
        }
        if(y > yt){
            y -= dt*5;
        }else if(y < yt){
            y += dt*5;
        }
        if(x > xt + 3 && x < xt -3 && y > yt +3 && y < yt-3){
            moving = false;
        }else{
            moving = true;
        }
    }

    public void setXt(double xt) {
        this.xt = xt;
    }

    public void setYt(double yt) {
        this.yt = yt;
    }
}
