
package sistemarodoviario.funcionalidades;
import sistemarodoviario.objetos.AssentoOD;

class FuncionalidadesAssentoOD {
    
   private final AssentoOD[]onibusdobro;
   
   private int cont;
   
     public FuncionalidadesAssentoOD() {
        
        this.cont = 0;
        this.onibusdobro = new AssentoOD[60];      
    }
         public void adicionarAssento(AssentoOD a) {
        if (onibusdobro.length == cont) {
            System.out.println("Porem o Onibus está lotado!");
        } else {
            this.onibusdobro[cont] = a;
            cont++;
            System.out.println("e sua reserva foi feita com sucesso");
        }
    }
}
