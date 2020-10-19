package sistemarodoviario.funcionalidades;
import sistemarodoviario.objetos.AssentoOD;

import sistemarodoviario.objetos.OnibusDuplo;

public class FuncionalidadesOD {

    private int cont;
    private boolean flag;
    private OnibusDuplo[] onibusdobro;
    
    
     public FuncionalidadesOD(AssentoOD[] assentood) {

        this.cont = 0;

    }
     public FuncionalidadesOD() {

        this.cont = 0;
        this.onibusdobro = new OnibusDuplo[60];
    }

    public void adicionarOnibus(OnibusDuplo od) {
        if (od == null || onibusdobro.length == cont || procurarOnibus(od.getOnibusrotas2()) != -1) {
            System.out.println("Não foi possível adicionar o onibus pois ja existe em nosso sistema!");
        } else {
            this.onibusdobro[cont] = od;
            cont++;
            System.out.println("seu onibus foi adicionado com sucesso a sua empresa");
        }
        flag = false;
    }

    private int procurarOnibus(String Onibusrotas2) {
        if (flag == true) {
            for (int i = 0; i < cont; i++) {
                if (this.onibusdobro[i].getOnibusrotas2().equals(Onibusrotas2)) {
                    return i;
                }
            }
            return -1;
        } else {

            int inicio = 0, fim = this.cont - 1, meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (this.onibusdobro[meio].getOnibusrotas2().compareToIgnoreCase(Onibusrotas2) == 0) {
                    return meio;
                } else if (Onibusrotas2.compareToIgnoreCase(this.onibusdobro[meio].getOnibusrotas2()) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }

    public boolean resevarAssento(OnibusDuplo od) {

        if (od == null || onibusdobro.length == cont || procurarOnibus(od.getOnibusrotas2()) != -1) {
            System.out.println(" Seu onibus Existe");
            return true;
        } else {
            this.onibusdobro[cont] = od;

            return false;
        }

    }

}
