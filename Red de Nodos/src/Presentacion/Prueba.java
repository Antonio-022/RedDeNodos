package Presentacion;

import Negocio.ListaArista;
import Negocio.ListaNodo;

public class Prueba {
    public static void main(String[] args) {
        ListaNodo objL = new ListaNodo();
        ListaArista objA = new ListaArista();
        objL.InsertarNodo("A", 100, 100);
        objL.InsertarNodo("B", 200, 16);
        objL.InsertarNodo("C", 120, 40);
        objL.InsertarNodo("C", 120, 40);
        objL.InsertarNodo("D", 102, 19);
        objL.ModLoc("E", 10000, 10000);
        /*if(objL.Nodo("c")!=null){
            System.out.println(objL.Nodo("c").getX());
        }else System.out.println("No");*/
        objA.InsertarArista(10, objL.Nodo("A"), objL.Nodo("C"));
        objA.InsertarArista(100, objL.Nodo("A"), objL.Nodo("D"));
        objA.InsertarArista(1000, objL.Nodo("B"), objL.Nodo("A"));
        objA.Arista(objL.Nodo("A"), objL.Nodo("D"));
        /*if(objA.Arista(objL.Nodo("A"), objL.Nodo("D"))!=null){
            System.out.println(objA.Arista(objL.Nodo("A"), objL.Nodo("D")).getCosto());
        }else System.out.println("No Arista");*/
        System.out.println("Nodos: "+objL.Tam());
        System.out.println("Aristas: "+objA.Tam());
        objL.InsertarNodo("A", 100, 100);
    }
}
