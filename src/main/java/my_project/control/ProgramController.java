package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Graph;
import my_project.model.Rectangel;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

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
        Rectangel r1 = new Rectangel(100,500,"1");
        graph.addVertex(r1.getVertex());
        Rectangel r2 = new Rectangel(300,400,"2");
        graph.addVertex(r2.getVertex());
        Rectangel r3 = new Rectangel(300,500,"3");
        graph.addVertex(r3.getVertex());
        Rectangel r4 = new Rectangel(300,600,"4");
        graph.addVertex(r4.getVertex());
        Rectangel r5 = new Rectangel(500,350,"5");
        graph.addVertex(r5.getVertex());
        Rectangel r6 = new Rectangel(500,450,"6");
        graph.addVertex(r6.getVertex());
        Rectangel r7 = new Rectangel(500,550,"7");
        graph.addVertex(r7.getVertex());
        Rectangel r8 = new Rectangel(500,700,"8");
        graph.addVertex(r8.getVertex());
        Rectangel r9 = new Rectangel(700,350,"9");
        graph.addVertex(r9.getVertex());
        Rectangel r10 = new Rectangel(700,500,"10");
        graph.addVertex(r9.getVertex());
        Rectangel r11 = new Rectangel(700,650,"11");
        graph.addVertex(r11.getVertex());

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
    }



    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
