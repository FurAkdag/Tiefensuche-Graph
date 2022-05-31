package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.abitur.datenstrukturen.Edge;
import KAGO_framework.model.abitur.datenstrukturen.List;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class EdgeList extends GraphicalObject {

    private List<Edge> edgeList;
    private List<Edge> currentEdgeList;
    private String wholeList = "";
    private String currentList = "";

    public EdgeList(){

    }

    public void setList(List<Edge> l) {
        this.edgeList = l;
        wholeList = "";
        edgeList.toFirst();
        while (edgeList.hasAccess()){
            wholeList += edgeList.getContent().getVertices()[0].getID() + " --> " + edgeList.getContent().getVertices()[1].getID() + " || ";
            edgeList.next();
        }
    }

    public void setCurrentEdgeList(List<Edge> currentEdgeList) {
        this.currentEdgeList = currentEdgeList;
        currentList = "";
        currentEdgeList.toFirst();
        while (currentEdgeList.hasAccess()){
            currentList += currentEdgeList.getContent().getVertices()[0].getID() + " --> " + currentEdgeList.getContent().getVertices()[1].getID() + " || ";
            currentEdgeList.next();
        }
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawText(100,50, wholeList);
        drawTool.drawText(100,25,"Liste der Edges");
        drawTool.drawText(100,100, currentList);
        drawTool.drawText(100,75,"Freunde vom Current");
    }
}
