package sistemarodoviario.funcionalidades;

import sistemarodoviario.objetos.Assento;


public class FuncionalidadesAssento {
    
    private final Assento[] onibus;
    private int cont;

    public FuncionalidadesAssento() {
        
        this.cont = 0;
        this.onibus = new Assento[30];      
    }

    /*Método para criar novo Assento.*/
    
    public void adicionarAssento(Assento a) {
        if (onibus.length == cont) {
            System.out.println("Porem o Onibus está lotado!");
        } else {
            this.onibus[cont] = a;
            cont++;
            System.out.println("e sua reserva foi feita com sucesso");
        }
    }
    
    /*Método para Exibir os Assentos*/
    
    public void exibir() {
        int i;
        for (i = 0; i < this.cont; i++) {
            System.out.println(this.onibus + " ");
        }
    }
    
    
}
