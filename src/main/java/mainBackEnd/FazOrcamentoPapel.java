package mainBackEnd;

public class FazOrcamentoPapel {


private Integer tamanhoBase=0;

private String pequena;
private String media;
private String personalizacao;
private String plastificacao;
private String ilhos;
private String cordoes;



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

    public String getPlastificacao() {
        return plastificacao;
    }

    public void setPlastificacao(String plastificacao) {
        this.plastificacao = plastificacao;
    }

    public String getIlhos() {
        return ilhos;
    }

    public void setIlhos(String ilhos) {
        this.ilhos = ilhos;
    }

    public String getCordoes() {
        return cordoes;
    }

    public void setCordoes(String cordoes) {
        this.cordoes = cordoes;
    }
}
