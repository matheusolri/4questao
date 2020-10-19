
package sistemarodoviario.objetos;

public class OnibusDuplo{
     
      private String Onibusrotas2;
    private OnibusDuplo onibusduplo[] = new OnibusDuplo[2000];
      public OnibusDuplo(String Onibusrotas2){
        this.Onibusrotas2 = Onibusrotas2;
        
    }   

    public OnibusDuplo[] getOnibusduplo() {
        return onibusduplo;
    }

    public void setOnibusduplo(OnibusDuplo[] onibusduplo) {
        this.onibusduplo = onibusduplo;
    }

   
      

    public String getOnibusrotas2() {
        return Onibusrotas2;
    }

    public void setOnibusrotas2(String Onibusrotas2) {
        this.Onibusrotas2 = Onibusrotas2;
    }

    
     
}

