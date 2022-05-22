package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.abitur.datenstrukturen.Edge;
import KAGO_framework.model.abitur.datenstrukturen.Vertex;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class EdgePath extends GraphicalObject {

    private Edge edge;
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private Rectangel r1;
    private Rectangel r2;

    public EdgePath(Rectangel r1, Rectangel r2, double x1, double y1, double x2, double y2){
        edge = new Edge(r1.getVertex(), r2.getVertex(),0);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawLine(x1,y1,x2,y2);
    }

    public Edge getEdge() {
        return edge;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public Rectangel getR1() {
        return r1;
    }

    public Rectangel getR2() {
        return r2;
    }

    public boolean isEdge(Rectangel rectangel1, Rectangel rectangel2){
        if(rectangel1 == r1 && rectangel2 == r2){
            return true;
        }
        if(rectangel1 == r2 && rectangel2 == r1){
            return true;
        }
        return false;
    }

    /**
     * Wird mit jeder Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){

    }
}
