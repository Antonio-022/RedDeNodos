package Negocio;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Dibujo extends Thread{
    ListaNodo ln;
    ListaArista la;
    JPanel J;
    Graphics g;
    Graphics2D a;
    Font myFont;
    Nodo A,B,M;
    private int w=40,h=40;
    public Dibujo(JPanel j){
        this.ln = new ListaNodo();
        this.la = new ListaArista();
        this.J = j;
        this.g = J.getGraphics();
        this.myFont = new Font ("Courier New", 1, 22);
        g.setFont(myFont);
        this.a = (Graphics2D) g;
        a.setStroke(new BasicStroke(3));
        A=null;
        B=null;
        M=null;
    }
    public boolean CrearArista(int x,int y){
        A=VerifNodo(x, y);
        if(A!=null){
            AlumbrarNodo(A.getX(), A.getY());
            return true;
        }return false;
    }
    public boolean CrearArista(int costo,int x,int y){
        AlumbrarNodo(A.getX(), A.getY());
        B=VerifNodo(x, y);
        if(B!=null){
            la.InsertarArista(costo, A, B);
            A=null;
            B=null;
            return true;
        }
        return false;
    }
    
    public boolean CrearNodo(String nom,int x,int y){
            return ln.InsertarNodo(nom, x, y);
        
    }
    
    public Nodo VerifNodo(int x,int y){
        Nodo X=this.ln.getPriN();
        int xi,xf,yi,yf;
        while(X!=null){
            xi=X.getX()-w/2;
            xf=X.getX()+w/2;
            yi=X.getY()-h/2;
            yf=X.getY()+h/2;
            if(x>xi && x<xf && y>yi && y<yf){
                return X;
            }
            X=X.getSigN();
        }
        return null;
    }
    
    public void DibNodo(String nom,int x,int y){
        g.drawOval(x-w/2, y-h/2, w, h);
        g.drawString(nom, x-w/10, y+w/10);
    }
    public void DibArista(int costo,int x1,int y1,int x2,int y2){
        g.drawLine(x1, y1, x2, y2);
        g.drawString(""+costo, (x1+x2)/2, (y1+y2)/2);
        g.drawLine(x2, y2, x2-5, y2-5);
    }
    
    public void DibGrafo(){
        Limpiar();
        Nodo N=this.ln.getPriN();
        Arista A=this.la.getPriA();
        while(N!=null){
            DibNodo(N.getNom(), N.getX(), N.getY());
            N=N.getSigN();
        }
        if(this.A!=null){
            AlumbrarNodo(this.A.getX(),this.A.getY());
        }
        while(A!=null){
            DibArista(A.getCosto(), A.getO().getX(), A.getO().getY(), A.getD().getX(), A.getD().getY());
            A=A.getSigA();
        }
    }
    public String Trayectos(){
        String x="";
        Arista X=this.la.getPriA();
        while(X!=null){
            x=x+"De "+X.getO().getNom()+" a " +X.getD().getNom()+" tiene un costo de "+X.getCosto()+"\n";
            X=X.getSigA();
        }
        return x;
    }
    public String Nodos(){
        String x="";
        Nodo X=this.ln.getPriN();
        while(X!=null){
            x=x+X.getNom()+"&nbsp;&nbsp; x:"+X.getX()+" y:"+X.getY()+"<br>";
            X=X.getSigN();
        }
        return x;
    }
    public void Limpiar(){
        g.setColor(Color.white);
        g.fillRect(3, 3, J.getWidth()-6, J.getHeight()-6);
        g.setColor(Color.black);
    }
    public void Seleccionar(int x, int y){
        M=VerifNodo(x, y);
    }
    public void Deseleccionar(){
        M=null;
    }
    public void Mover(int x,int y){
        ln.ModLoc(M.getNom(), x, y);
        DibGrafo();
      
    }
    public void AlumbrarNodo(int x,int y){
        g.setColor(Color.red);
        g.drawOval(x-w/2-2, y-h/2-2, w+4, h+4);
        g.setColor(Color.black);
    }
    
}
