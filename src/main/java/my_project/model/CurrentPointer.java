package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class CurrentPointer extends GraphicalObject {

    private double tX;
    private double tY;
    private boolean moving = false;
    private double Ratio;

    public CurrentPointer(double x, double y){
        this.x = x;
        this.y = y;
        tX = x;
        tY = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledCircle(x,y,20);
    }

    @Override
    public void update(double dt){
        Ratio = (tY - y)/(tX - x);
        if(Ratio != 0){
            y += Ratio*10*dt;
            x += 10*dt;
        }else {
            if (tX < x) {
                x += 3 * dt;
            } else if (tX > x) {
                x -= 3 * dt;
            }
            if (tX < y) {
                y += 3 * dt;
            } else if (tY > y) {
                y -= 3 * dt;
            }
        }
        if(x < tX + 5 && x > tX -5 && y < tY +5 && y > tY -5){
            moving = false;
        }else{
            moving = true;
        }

    }

    public void settX(double tX) {
        this.tX = tX;
    }

    public void settY(double tY) {
        this.tY = tY;
    }

    public boolean isMoving() {
        return moving;
    }
}
