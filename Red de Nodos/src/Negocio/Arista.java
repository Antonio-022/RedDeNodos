package Negocio;
public class Arista {
    private int costo;
    private Nodo o, d;
    private Arista sigA;
    public Arista(){
        this.costo = 0;
        this.o = null;
        this.d = null;
        this.sigA = null;
    }
    public Arista(int costo,Nodo o, Nodo d){
        this.costo = costo;
        this.o = o;
        this.d = d;
    }
    public Arista getSigA() {
        return sigA;
    }
    public void setSigA(Arista sigA) {
        this.sigA = sigA;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public Nodo getO() {
        return o;
    }
    public void setO(Nodo o) {
        this.o = o;
    }
    public Nodo getD() {
        return d;
    }
    public void setD(Nodo d) {
        this.d = d;
    }    
}
