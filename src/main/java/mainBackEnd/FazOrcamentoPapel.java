package mainBackEnd;

public class FazOrcamentoPapel {

private Integer tamanhoSacola;

//private Integer pequena;
//private Integer media;
//private Integer grande;




    public Integer qualTamanho(Integer a){
        if (a==1){
             tamanhoSacola = 10;
            return tamanhoSacola;
        } else if (a == 2){
            tamanhoSacola = 20;
            return tamanhoSacola;
        } else if (a == 3){
            tamanhoSacola = 30;
            return tamanhoSacola;
        }else{
            return 0;
        }
    }


    public Integer getTamanhoSacola() {
        return tamanhoSacola;
    }

    public void setTamanhoSacola(Integer tamanhoSacola) {
        this.tamanhoSacola = tamanhoSacola;
    }
}
