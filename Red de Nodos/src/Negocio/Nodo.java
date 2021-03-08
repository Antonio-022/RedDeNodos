package Negocio;
public class Nodo {
    private String nom;
    private int x, y;
    private Nodo sigN;
    public Nodo(){
        this.nom = "";
        this.x = 0;
        this.y = 0;
        this.sigN = null;
    }
    public Nodo(String nom,int x, int y){
        this.nom = nom;
        this.x = x;
        this.y = y;
    }
    public Nodo getSigN() {
        return sigN;
    }
    public void setSigN(Nodo sig) {
        this.sigN = sig;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }    
}
