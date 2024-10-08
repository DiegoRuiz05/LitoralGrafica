package mainBackEnd;

public class FazOrcamentoPapel {


private Integer tamanhoBase=0;

private String pequena;
private String media;
private String personalizacao;



public String qualTamanho(Integer a){
    a=tamanhoBase;
    if(a==1){
        pequena="Sacola Pequena";
        return pequena;
    }else if(a==2) {
        media = "Sacola Media";
        return media;
    }else {
        return "tamanho desconhecido";
    }

}

//Getters e Setters
    public Integer getTamanhoBase() {
        return tamanhoBase;
    }

    public void setTamanhoBase(Integer tamanhoBase) {
        this.tamanhoBase = tamanhoBase;
    }

    public String getPersonalizacao() {
        return personalizacao;
    }

    public void setPersonalizacao(String personalizacao) {
        this.personalizacao = personalizacao;
    }
}
