package Negocio;
public class ListaArista {
    private Arista PriA;
    public ListaArista(){
        this.PriA=null;
    }
    public Arista getPriA() {
        return PriA;
    }
    public void setPriA(Arista PriA) {
        this.PriA = PriA;
    }
    public boolean Vacia(){
        return this.PriA==null;
    }
    public void InsertarArista(int costo,Nodo o,Nodo d){
        Arista N=new Arista(costo, o, d);
        if(Vacia()){
            this.PriA=N;
        }else{
            Arista X=this.PriA;
            while(X.getSigA()!=null){
                X=X.getSigA();
            }
            X.setSigA(N);
        }
    }
    public Arista Arista(Nodo o, Nodo d){
        if(!Vacia()){
            Arista X=this.PriA;
            while(X!=null){
                if(X.getO()==o && X.getD()==d){
                    return X;
                }
                X=X.getSigA();
            }
        }
        return null;
    }
    public int Tam(){
        int t=0;
        if(!Vacia()){
            Arista X=this.PriA;
            do{
                t++;
                X=X.getSigA();
            }while(X!=null);
        }
        return t;
    }
}