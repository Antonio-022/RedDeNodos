package Negocio;
public class ListaNodo {
    private Nodo PriN;
    public ListaNodo(){
        this.PriN=null;
    }
    public Nodo getPriN() {
        return PriN;
    }
    public void setPriN(Nodo PriN) {
        this.PriN = PriN;
    }
    public boolean Vacia(){
        return this.PriN==null;
    }
    public boolean InsertarNodo(String nom,int x,int y){
        Nodo N=new Nodo(nom, x, y);
        if(Vacia()){
            this.PriN=N;
        }else{
            if(Nodo(nom)!=null){
                return false;
            }
            Nodo X=this.PriN;
            while(X.getSigN()!=null){
                X=X.getSigN();
            }
            X.setSigN(N);
        }
        return true;
    }
    public Nodo Nodo(String nom){
        if(!Vacia()){
            Nodo X = this.PriN;
            while(X!=null){
                if(X.getNom()==nom){
                    return X;
                }
                X=X.getSigN();
            }
        }
        return null;
    }
    public void ModLoc(String nom, int x, int y){
        if(!Vacia()){
            Nodo X=this.PriN;
            while(X!=null && X.getNom()!=nom){
                X=X.getSigN();
            }
            if(X!=null && X.getNom()==nom){
                X.setX(x);
                X.setY(y);
            }
        }
    }
    public int Tam(){
        int t=0;
        if(!Vacia()){
            Nodo X=this.PriN;
            do{
                t++;
                X=X.getSigN();
            }while(X!=null);
        }
        return t;
    }
}
