package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.abitur.datenstrukturen.Vertex;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Kugel (einen Kreis), der in eine Schlange eingefügt werden soll. Dabei muss jeder QueueBall immer
 * seinen Vorgänger kennen, damit er zu ihm Abstand halten kann.
 */
public class Rectangel extends GraphicalObject {

    Vertex vertex;
    /**
     * Erzeugt einen neuen QueueBall
     * @param x Startposition x
     * @param y Startposition y
     */
    public Rectangel(double x, double y,String id){
        this.x = x;
        this.y = y;;
        vertex = new Vertex(id);
    }


    /**
     * Selbsterklärend: zeichnet den QueueBall. Wird vom Framework automatisch aufgerufen (jede Frame 1x).
     */
    @Override
    public void draw(DrawTool drawTool) {
        if(vertex.isMarked()){
            drawTool.setCurrentColor(Color.RED);
        }else{
            drawTool.setCurrentColor(Color.BLACK);
        }
        drawTool.drawRectangle(x,y,40);
        drawTool.drawText(x+15,y+25, vertex.getID());
    }

    /**
     * Wird mit jeder Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){

    }

    public Vertex getVertex() {
        return vertex;
    }

}
