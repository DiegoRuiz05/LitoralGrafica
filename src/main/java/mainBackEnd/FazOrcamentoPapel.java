package mainBackEnd;

public class FazOrcamentoPapel {



private String pequena;
private String media;

private float tamanhoBase=0;
private float precoTamanhoBase=0;

private String personalizacao;
private float precoPersonalizacao=0;

private String plastificacao;
private float precoPlastificacao=0;

private String ilhos;
private float precoIlhos;

private String cordoes;
private float precoCordoes;





public String qualTamanho(float a, String persona, String plast, String ilhos, String cordos) {
    a = tamanhoBase;

    //plast = plastificacao;
    float respFloat=0;
    String respString="";

    if(a==1){
        calculaCor(persona);
        calculaIlhos();
        calculaPlastificacao();
        calculaCordao();
        precoTamanhoBase = 770;
        pequena="Sacola Pequena";
        respFloat = precoTamanhoBase + precoPersonalizacao + precoPlastificacao + precoIlhos+precoCordoes;
        respString = String.valueOf(respFloat);
        return respString;

    }else if(a==2) {

        media = "Sacola Media";
        return media;

    }else {
        return media;
    }
}

public float calculaCor(String persona) {
    if (persona.equals("basica")) {
        return precoPersonalizacao = 235;
    } else if (persona.equals("pantone")) {
       return precoPersonalizacao = 425;
    } else if (persona.equals("colorida")) {
        return precoPersonalizacao = 570;
    }
    return 0;
}

public float calculaPlastificacao(){
    if(getPlastificacao().equals("nao")){
        return precoPlastificacao = 0;
    }else if(getPlastificacao().equals("sim")){
        return precoPlastificacao = 170;
    }
        return 0;
}

    public float calculaIlhos( ){
    if (getIlhos().equals("nao")){
        return precoIlhos = 0;
    } else if (getIlhos().equals("sim")) {
        return precoIlhos = 150;
    }
    return 0;
    }

    public float calculaCordao(){
    if(getCordoes().equals("basico")){
        return precoCordoes = 120;
    } else if (getCordoes().equals("gorgurao")) {
        return precoCordoes=300;
    }
    return 0;
    }



//Getters e Setters
    public float getTamanhoBase() {
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

    public float getPrecoPersonalizacao() {
        return precoPersonalizacao;
    }

    public void setPrecoPersonalizacao(float precoPersonalizacao) {
        this.precoPersonalizacao = precoPersonalizacao;
    }

    public float getPrecoPlastificacao() {
        return precoPlastificacao;
    }

    public void setPrecoPlastificacao(float precoPlastificacao) {
        this.precoPlastificacao = precoPlastificacao;
    }

    public float getPrecoIlhos() {
        return precoIlhos;
    }

    public void setPrecoIlhos(float precoIlhos) {
        this.precoIlhos = precoIlhos;
    }

    public float getPrecoCordoes() {
        return precoCordoes;
    }

    public void setPrecoCordoes(float precoCordoes) {
        this.precoCordoes = precoCordoes;
    }

    public float getPrecoTamanhoBase() {
        return precoTamanhoBase;
    }

    public void setPrecoTamanhoBase(float precoTamanhoBase) {
        this.precoTamanhoBase = precoTamanhoBase;
    }

    public void setTamanhoBase(float tamanhoBase) {
        this.tamanhoBase = tamanhoBase;
    }
}
