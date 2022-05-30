package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.abitur.datenstrukturen.Edge;
import KAGO_framework.model.abitur.datenstrukturen.List;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class EdgeList extends GraphicalObject {

    private List<Edge> edgeList;
    private String output = "";

    public EdgeList(){

    }

    public void setList(List<Edge> l) {
        this.edgeList = l;
        output = "";
        edgeList.toFirst();
        while (edgeList.hasAccess()){
            output += edgeList.getContent().getVertices()[0].getID() + " --> " + edgeList.getContent().getVertices()[1].getID() + " || ";
            edgeList.next();
        }
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawText(100,100, output);
        drawTool.drawText(100,75,"Liste der Edges");
    }
}
