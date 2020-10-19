package sistemarodoviario.objetos;


public class Onibus {
    
    private String Onibusrotas;
    private Onibus onibus[] = new Onibus[2000];
    
    /*Construtor*/ 
    
    public Onibus(String Onibusrotas){
        this.Onibusrotas = Onibusrotas;
        
    }   

  

    public Onibus[] getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus[] onibus) {
        this.onibus = onibus;
    }

    public String getOnibusrotas() {
        return Onibusrotas;
    }

    public void setOnibusrotas(String Onibusrotas) {
        this.Onibusrotas = Onibusrotas;
    }

    @Override
    public String toString() {
        return "Onibus{" + "Onibusrotas=" + Onibusrotas + ", onibus=" + onibus + '}';
    }
    
    
}
    

