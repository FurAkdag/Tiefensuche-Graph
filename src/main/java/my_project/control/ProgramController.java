package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Graph;
import KAGO_framework.model.abitur.datenstrukturen.List;
import KAGO_framework.model.abitur.datenstrukturen.Vertex;
import my_project.model.CurrentPointer;
import my_project.model.EdgeList;
import my_project.model.EdgePath;
import my_project.model.Rectangel;
import my_project.view.InputManager;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute

    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private List<EdgePath> edgePathList = new List<>();
    private CurrentPointer currentPointer;
    private List<Double> xhelp;
    private List<Double> yhelp;
    private Rectangel r1;
    private List<Rectangel> rectangelList;
    private List<Rectangel> allRectangel;
    private EdgeList edgeList;
    private boolean automatic = false;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    private Graph graph = new Graph();

    public ProgramController(ViewController viewController){
        this.viewController = viewController;
        currentPointer = new CurrentPointer(120,420);
        viewController.draw(currentPointer);

        edgeList = new EdgeList();
        viewController.draw(edgeList);

        new InputManager(this,viewController);
        xhelp = new List<>();
        yhelp = new List<>();
        rectangelList = new List<>();
        allRectangel = new List<>();
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstellt und zeichnet die Vertexes und Edges.
        fillGraph();
        edgeList.setList(graph.getEdges());
        Tiefensuche();
    }

    public void Tiefensuche(){
        Tiefensuche(r1);
        xhelp.toFirst();
        yhelp.toFirst();
        rectangelList.toFirst();
    }

    public void reset(){
            graph.setAllVertexMarks(false);
            currentPointer.setX(120);
            currentPointer.setY(420);
            currentPointer.settX(120);
            currentPointer.settY(420);
            allRectangel.toFirst();
            while (allRectangel.hasAccess()) {
                allRectangel.getContent().setMarked(false);
                allRectangel.next();
            }
            xhelp = new List<>();
            yhelp = new List<>();
            rectangelList = new List<>();
            automatic = false;
    }

    public void fillGraph(){
        //Recangel & Vertex
        r1 = new Rectangel(100,400,"1");
        graph.addVertex(r1.getVertex());
        Rectangel r2 = new Rectangel(300,200,"2");
        graph.addVertex(r2.getVertex());
        Rectangel r3 = new Rectangel(300,400,"3");
        graph.addVertex(r3.getVertex());
        Rectangel r4 = new Rectangel(300,600,"4");
        graph.addVertex(r4.getVertex());
        Rectangel r5 = new Rectangel(500,200,"5");
        graph.addVertex(r5.getVertex());
        Rectangel r6 = new Rectangel(500,400,"6");
        graph.addVertex(r6.getVertex());
        Rectangel r7 = new Rectangel(500,600,"7");
        graph.addVertex(r7.getVertex());
        Rectangel r8 = new Rectangel(500,800,"8");
        graph.addVertex(r8.getVertex());
        Rectangel r9 = new Rectangel(700,200,"9");
        graph.addVertex(r9.getVertex());
        Rectangel r10 = new Rectangel(700,600,"10");
        graph.addVertex(r10.getVertex());
        Rectangel r11 = new Rectangel(700,800,"11");
        graph.addVertex(r11.getVertex());

        allRectangel.append(r1);
        allRectangel.append(r2);
        allRectangel.append(r3);
        allRectangel.append(r4);
        allRectangel.append(r5);
        allRectangel.append(r6);
        allRectangel.append(r7);
        allRectangel.append(r8);
        allRectangel.append(r9);
        allRectangel.append(r10);
        allRectangel.append(r11);

        //Edges
        EdgePath e12 = new EdgePath(r1, r2, r1.getX()+40, r1.getY(),r2.getX(), r2.getY()+40);
        graph.addEdge(e12.getEdge());
        edgePathList.append(e12);
        EdgePath e14 = new EdgePath(r1, r4, r1.getX()+40, r1.getY()+40,r4.getX(), r4.getY());
        graph.addEdge(e14.getEdge());
        edgePathList.append(e14);
        EdgePath e25 = new EdgePath(r2, r5, r2.getX()+40, r2.getY()+20,r5.getX(), r5.getY()+20);
        graph.addEdge(e25.getEdge());
        edgePathList.append(e25);
        EdgePath e35 = new EdgePath(r3, r5, r3.getX()+40, r3.getY(),r5.getX(), r5.getY()+40);
        graph.addEdge(e35.getEdge());
        edgePathList.append(e35);
        EdgePath e26 = new EdgePath(r2, r6, r2.getX()+40, r2.getY()+40,r6.getX(), r6.getY());
        graph.addEdge(e26.getEdge());
        edgePathList.append(e26);
        EdgePath e36 = new EdgePath(r3, r6, r3.getX()+40, r3.getY()+20,r6.getX(), r6.getY()+20);
        graph.addEdge(e36.getEdge());
        edgePathList.append(e36);
        EdgePath e37 = new EdgePath(r3, r7, r3.getX()+40, r3.getY()+40,r7.getX(), r7.getY());
        graph.addEdge(e37.getEdge());
        edgePathList.append(e37);
        EdgePath e47 = new EdgePath(r4, r7, r4.getX()+40, r4.getY()+20,r7.getX(), r7.getY()+20);
        graph.addEdge(e47.getEdge());
        edgePathList.append(e47);
        EdgePath e48 = new EdgePath(r4, r8, r4.getX()+40, r4.getY()+40,r8.getX(), r8.getY());
        graph.addEdge(e48.getEdge());
        edgePathList.append(e48);
        EdgePath e78 = new EdgePath(r7, r8, r7.getX()+20, r7.getY()+40,r8.getX()+20, r8.getY());
        graph.addEdge(e78.getEdge());
        edgePathList.append(e78);
        EdgePath e59 = new EdgePath(r5, r9, r5.getX()+40, r5.getY()+20,r9.getX(), r9.getY()+20);
        graph.addEdge(e59.getEdge());
        edgePathList.append(e59);
        EdgePath e710 = new EdgePath(r7, r10, r7.getX()+40, r7.getY()+20,r10.getX(), r10.getY()+20);
        graph.addEdge(e710.getEdge());
        edgePathList.append(e710);
        EdgePath e810 = new EdgePath(r8, r10, r8.getX()+40, r8.getY(),r10.getX(), r10.getY()+40);
        graph.addEdge(e810.getEdge());
        edgePathList.append(e810);



        //Draw
        viewController.draw(r1);
        viewController.draw(r2);
        viewController.draw(r3);
        viewController.draw(r4);
        viewController.draw(r5);
        viewController.draw(r6);
        viewController.draw(r7);
        viewController.draw(r8);
        viewController.draw(r9);
        viewController.draw(r10);
        viewController.draw(r11);
        viewController.draw(e12);
        viewController.draw(e14);
        viewController.draw(e25);
        viewController.draw(e26);
        viewController.draw(e35);
        viewController.draw(e36);
        viewController.draw(e37);
        viewController.draw(e47);
        viewController.draw(e48);
        viewController.draw(e59);
        viewController.draw(e78);
        viewController.draw(e710);
        viewController.draw(e810);
        //viewController.draw(e910);
    }

    public void Tiefensuche(Rectangel r){
        rectangelList.append(r);
        r.getVertex().setMark(true);
        List<Rectangel> friends = findFriends(r);
        friends.toFirst();
        while(friends.hasAccess()){

            if(!friends.getContent().getVertex().isMarked()) {
                xhelp.append(r.getX()+20);
                yhelp.append(r.getY()+20);
                rectangelList.append(r);
                xhelp.append(friends.getContent().getX()+20);
                yhelp.append(friends.getContent().getY()+20);
                Tiefensuche(friends.getContent());
            }
            friends.next();
        }
        xhelp.append(r.getX()+20);
        yhelp.append(r.getY()+20);
        rectangelList.append(r);
    }

    public void next(){
        if(xhelp.hasAccess()){
            currentPointer.settX(xhelp.getContent());
            currentPointer.settY(yhelp.getContent());
            xhelp.remove();
            yhelp.remove();
            if(rectangelList.hasAccess()){
                rectangelList.getContent().setMarked(true);
                rectangelList.remove();
            }
        }
    }

    public List<Rectangel> findFriends(Rectangel r){
        List<Rectangel> result = new List<Rectangel>();

        edgePathList.toFirst();
        while (edgePathList.hasAccess()){

            if(edgePathList.getContent().getR1() == r){
                result.append(edgePathList.getContent().getR2());
            }else if(edgePathList.getContent().getR2() == r){
                result.append(edgePathList.getContent().getR1());
            }
            edgePathList.next();
        }
        return result;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
        if(automatic && xhelp.hasAccess()){
            if(!currentPointer.isMoving()){
                currentPointer.settX(xhelp.getContent());
                currentPointer.settY(yhelp.getContent());
                xhelp.remove();
                yhelp.remove();
                if(rectangelList.hasAccess()){
                    rectangelList.getContent().setMarked(true);
                    rectangelList.remove();
                }
            }
        }
        if(rectangelList.hasAccess()){
            edgeList.setCurrentEdgeList(graph.getEdges(rectangelList.getContent().getVertex()));
        }
    }

}
