package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Graph;
import KAGO_framework.model.abitur.datenstrukturen.List;
import KAGO_framework.model.abitur.datenstrukturen.Vertex;
import my_project.model.CurrentPointer;
import my_project.model.EdgePath;
import my_project.model.Rectangel;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    List<EdgePath> edgePathList = new List<>();

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
        CurrentPointer currentPointer = new CurrentPointer(120,420);
        viewController.draw(currentPointer);

    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        fillGraph();
    }

    public void fillGraph(){
        Rectangel r1 = new Rectangel(100,400,"1");
        graph.addVertex(r1.getVertex());
        Rectangel r2 = new Rectangel(300,300,"2");
        graph.addVertex(r2.getVertex());
        Rectangel r3 = new Rectangel(300,400,"3");
        graph.addVertex(r3.getVertex());
        Rectangel r4 = new Rectangel(300,500,"4");
        graph.addVertex(r4.getVertex());
        Rectangel r5 = new Rectangel(500,250,"5");
        graph.addVertex(r5.getVertex());
        Rectangel r6 = new Rectangel(500,350,"6");
        graph.addVertex(r6.getVertex());
        Rectangel r7 = new Rectangel(500,450,"7");
        graph.addVertex(r7.getVertex());
        Rectangel r8 = new Rectangel(500,600,"8");
        graph.addVertex(r8.getVertex());
        Rectangel r9 = new Rectangel(700,250,"9");
        graph.addVertex(r9.getVertex());
        Rectangel r10 = new Rectangel(700,400,"10");
        graph.addVertex(r9.getVertex());
        Rectangel r11 = new Rectangel(700,650,"11");
        graph.addVertex(r11.getVertex());

        //Edges
        EdgePath e12 = new EdgePath(r1.getVertex(), r2.getVertex(), r1.getX()+40, r1.getY(),r2.getX(), r2.getY()+40);
        graph.addEdge(e12.getEdge());
        edgePathList.append(e12);
        EdgePath e14 = new EdgePath(r1.getVertex(), r4.getVertex(), r1.getX()+40, r1.getY()+40,r4.getX(), r4.getY());
        graph.addEdge(e14.getEdge());
        edgePathList.append(e14);
        EdgePath e25 = new EdgePath(r2.getVertex(), r5.getVertex(), r2.getX()+40, r2.getY(),r5.getX(), r5.getY());
        graph.addEdge(e25.getEdge());
        edgePathList.append(e25);
        EdgePath e35 = new EdgePath(r3.getVertex(), r5.getVertex(), r3.getX()+40, r3.getY(),r5.getX(), r5.getY()+40);
        graph.addEdge(e35.getEdge());
        edgePathList.append(e35);
        EdgePath e26 = new EdgePath(r2.getVertex(), r6.getVertex(), r2.getX()+40, r2.getY()+40,r6.getX(), r6.getY());
        graph.addEdge(e26.getEdge());
        edgePathList.append(e26);
        EdgePath e36 = new EdgePath(r3.getVertex(), r6.getVertex(), r3.getX()+40, r3.getY(),r6.getX(), r6.getY()+40);
        graph.addEdge(e36.getEdge());
        edgePathList.append(e36);
        EdgePath e37 = new EdgePath(r3.getVertex(), r7.getVertex(), r3.getX()+40, r3.getY()+40,r7.getX(), r7.getY());
        graph.addEdge(e37.getEdge());
        edgePathList.append(e37);
        EdgePath e47 = new EdgePath(r4.getVertex(), r7.getVertex(), r4.getX()+40, r4.getY(),r7.getX(), r7.getY()+40);
        graph.addEdge(e47.getEdge());
        edgePathList.append(e47);
        EdgePath e48 = new EdgePath(r4.getVertex(), r8.getVertex(), r4.getX()+40, r4.getY()+40,r8.getX(), r8.getY());
        graph.addEdge(e48.getEdge());
        edgePathList.append(e48);
        EdgePath e78 = new EdgePath(r7.getVertex(), r8.getVertex(), r7.getX()+20, r7.getY()+40,r8.getX()+20, r8.getY());
        graph.addEdge(e78.getEdge());
        edgePathList.append(e78);
        EdgePath e59 = new EdgePath(r5.getVertex(), r9.getVertex(), r5.getX()+40, r5.getY(),r9.getX(), r9.getY());
        graph.addEdge(e59.getEdge());
        edgePathList.append(e59);
        EdgePath e69 = new EdgePath(r6.getVertex(), r9.getVertex(), r6.getX()+40, r6.getY(),r9.getX(), r9.getY()+40);
        graph.addEdge(e69.getEdge());
        edgePathList.append(e69);
        EdgePath e710 = new EdgePath(r7.getVertex(), r10.getVertex(), r7.getX()+40, r7.getY(),r10.getX(), r10.getY());
        graph.addEdge(e710.getEdge());
        edgePathList.append(e710);
        EdgePath e810 = new EdgePath(r8.getVertex(), r10.getVertex(), r8.getX()+40, r8.getY(),r10.getX(), r10.getY()+40);
        graph.addEdge(e810.getEdge());
        edgePathList.append(e810);
        EdgePath e910 = new EdgePath(r9.getVertex(), r10.getVertex(), r9.getX()+20, r9.getY()+40,r10.getX()+20, r10.getY());
        graph.addEdge(e910.getEdge());
        edgePathList.append(e910);

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
        viewController.draw(e69);
        viewController.draw(e78);
        viewController.draw(e710);
        viewController.draw(e810);
        viewController.draw(e910);
    }

    public void Tiefensuche(Vertex v){
        v.setMark(true);
        List<Vertex> friends = graph.getNeighbours(v);
        friends.toFirst();
        while(friends.hasAccess()){

            friends.next();
        }
    }

    public EdgePath findEgde(Vertex v1, Vertex v2){
        edgePathList.toFirst();
        while(edgePathList.hasAccess()){
            if(edgePathList.getContent().controllEdge(v1,v2)){
                return edgePathList.getContent();
            }
            edgePathList.next();
        }
        return null;
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
