package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.abitur.datenstrukturen.Edge;
import KAGO_framework.model.abitur.datenstrukturen.Vertex;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class EdgePath extends GraphicalObject {

    Edge edge;
    double x1;
    double x2;
    double y1;
    double y2;
    Vertex v1;
    Vertex v2;

    public EdgePath(Vertex v1, Vertex v2, double x1, double y1, double x2, double y2){
        edge = new Edge(v1, v2,0);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.v1 = v1;
        this.v2 = v2;
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


    public boolean controllEdge(Vertex vertex1, Vertex vertex2){
        if(vertex1 == v1 && vertex2 == v2){
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
