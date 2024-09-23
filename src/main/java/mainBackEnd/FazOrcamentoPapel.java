package mainBackEnd;

public class FazOrcamentoPapel {


private Integer tamanhoBase=0;

private String pequena;
private String media;



public String qualTamanho(Integer a){
    tamanhoBase=a;
    if(tamanhoBase==1){
        pequena="Sacola Pequena";
        return pequena;
    }else if(tamanhoBase==2) {
        media = "Sacola Media";
        return media;
    }else {
        return null;
    }

}

//    public Integer qualTamanho(Integer a){
//        if (a==1){
//             tamanhoSacolaJava = 10;
//            return tamanhoSacolaJava;
//        } else if (a == 2){
//            tamanhoSacolaJava = 20;
//            return tamanhoSacolaJava;
//        } else if (a == 3){
//            tamanhoSacolaJava = 30;
//            return tamanhoSacolaJava;
//        }else{
//            return 0;
//        }
//    }



    public Integer getTamanhoBase() {
        return tamanhoBase;
    }

    public void setTamanhoBase(Integer tamanhoBase) {
        this.tamanhoBase = tamanhoBase;
    }
}
