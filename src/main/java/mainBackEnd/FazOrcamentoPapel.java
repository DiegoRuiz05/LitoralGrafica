package mainBackEnd;

import java.text.DecimalFormat;

public class FazOrcamentoPapel {

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

private float respFloat=0;
private String respString="";

private float respFloat500;
private String respString500="";

private float porcentagemAcrescida;


//16X26 =1
//18X22 =2
//20X22 =3
//20X25X9 =4
//23X34X12 =5
//20X33X11,5 =6
//27X20X9 =7
//28X40 =8
//35X42X11 =9
//47X29,5X14 =10

public String qualTamanho(float a, String persona, String plast, String ilhos, String cordos) {
    a = tamanhoBase;

    if(a==0){
        //precoTamanhoBase = 770;
        precoTamanhoBase = 790;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        //respFloat -=100;
        respString = String.valueOf(respFloat);
        return respString;



    }  else if(a==1 || a==0.5){
        //precoTamanhoBase = 770;
        precoTamanhoBase = 890;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        respString = String.valueOf(respFloat);
        return respString;

    } else if (a==2) {
        //precoTamanhoBase = 770;
        //precoTamanhoBase = 890;
        precoTamanhoBase = 1010;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        //respFloat += 120;
        respString = String.valueOf(respFloat);
        return respString;

    } else if (a==3) {
       // precoTamanhoBase = 770;
       // precoTamanhoBase = 890;
        precoTamanhoBase = 1040;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        //respFloat += 150;
        respString = String.valueOf(respFloat);
        return respString;
    } else if (a==4) {
        //precoTamanhoBase = 770;
        //precoTamanhoBase = 890;
        precoTamanhoBase = 1070;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        //respFloat += 180;
        respString = String.valueOf(respFloat);
        return respString;

    } else if(a==5 || a==6) {
        //precoTamanhoBase = 1150;
        precoTamanhoBase = 1270;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        respString = String.valueOf(respFloat);
        return respString;

    } else if (a==7) {
        //precoTamanhoBase = 1150;
        //precoTamanhoBase = 1270;
        precoTamanhoBase = 1170;

        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        //respFloat -= 100;
        respString = String.valueOf(respFloat);
        return respString;

    } else if (a==8) {
        //precoTamanhoBase = 1650;
        precoTamanhoBase = 1780;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        respString = String.valueOf(respFloat);

        return respString;
    } else if (a==9 || a==10) {
        //precoTamanhoBase = 1815;
        precoTamanhoBase = 1945;
        calculaCor(a);
        calculaIlhos(a);
        calculaPlastificacao(a);
        calculaCordao(a);

        respFloat = valorDeVenda(precoTamanhoBase, precoPersonalizacao) + precoPlastificacao + precoIlhos + precoCordoes;
        respString = String.valueOf(respFloat);

        return respString;
    } else {
        return "";
    }
}

public float calculaCor(float a) {
    if(a==0|| a==0.5 || a==1 || a==2 || a==3 || a==4) {
        if (getPersonalizacao().equals("basica")) {
            return precoPersonalizacao=235;
        } else if (getPersonalizacao().equals("pantone")) {
            return precoPersonalizacao = 425;
        } else if (getPersonalizacao().equals("colorida")) {
            return precoPersonalizacao = 805;
        }

    } else if (a==5 || a==6 || a==7) {
        if (getPersonalizacao().equals("basica")) {
        return precoPersonalizacao = 235;
    } else if (getPersonalizacao().equals("pantone")) {
            return precoPersonalizacao = 425;
        } else if (getPersonalizacao().equals("colorida")) {
            return precoPersonalizacao = 570;
        }

    } else if (a==8 || a==9 || a==10) {
        if (getPersonalizacao().equals("basica")) {
            return precoPersonalizacao = 300;
        } else if (getPersonalizacao().equals("pantone")) {
            return precoPersonalizacao = 455;
        } else if (getPersonalizacao().equals("colorida")) {
            return precoPersonalizacao = 655;
        }

    }

    return 0;
}

public float calculaPlastificacao(float a){
    if (a==0|| a==0.5 ||a==1 || a==2 || a==3 || a == 4) {
        if (getPlastificacao().equals("nao")) {
            return precoPlastificacao = 0;
        } else if (getPlastificacao().equals("sim")) {
            return precoPlastificacao = 170;
        }
    } else if (a==5 || a==6 || a==7) {
        if (getPlastificacao().equals("nao")) {
            return precoPlastificacao = 0;
        } else if (getPlastificacao().equals("sim")) {
            return precoPlastificacao = 340;
        }
    } else if (a==8 || a==9 || a==10) {
        if (getPlastificacao().equals("nao")) {
            return precoPlastificacao = 0;
        } else if (getPlastificacao().equals("sim")) {
            return precoPlastificacao = 550;
        }
    }
    return 0;
}

    public float calculaIlhos(float a){
    if (a==0 || a==0.5 || a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 || a==8 || a==9 || a==10) {
        if (getIlhos().equals("nao")) {
            return precoIlhos = 0;
        } else if (getIlhos().equals("sim")) {
            return precoIlhos = 150;
        }
    }
        return 0;
    }

    public float calculaCordao(float a){
    if (a==0 || a==0.5 || a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7) {
        if (getCordoes().equals("basico")) {
            return precoCordoes = 0;
        } else if (getCordoes().equals("gorgurao")) {
            return precoCordoes = 420;
        }
    } else if (a==8 || a==9 || a==10) {
        if (getCordoes().equals("basico")) {
            return precoCordoes = 0;
        } else if (getCordoes().equals("gorgurao")) {
            return precoCordoes = 430;
        }
    }
        return 0;
    }

    public String calculaUnitario(){
    DecimalFormat df = new DecimalFormat("0.00");
        float respFloatUni=0;
        String respStringUni="";
        respFloatUni = respFloat/1000;
        respStringUni = df.format(respFloatUni);
        return respStringUni; //perguntar se quer que arredonde
    }


    //Calcula 500 unidades(valor total e valor unitário)
    public String calculaPreco500(float a){
    calculaUnitario();

    if (a==0 || a==0.5 || a==1 || a==2 || a==3 || a==4) {
        respFloat += 400;
        respFloat500 = respFloat;
        respFloat500 = respFloat500/2;
        respString500 = String.valueOf(respFloat500);

        return respString500;

    } else if (a==5 || a==6 || a==7) {
        respFloat += 500;
        respFloat500 = respFloat;
        respFloat500 = respFloat500/2;
        respString500 = String.valueOf(respFloat500);
        return respString500;
    } else if (a==8) {
        respFloat += 600;
        respFloat500 = respFloat;
        respFloat500 = respFloat500/2;
        respString500 = String.valueOf(respFloat500);
        return respString500;
    } else if (a==9 || a==10) {
        respFloat += 700;
        respFloat500 = respFloat;
        respFloat500 = respFloat500/2;
        respString500 = String.valueOf(respFloat500);
        return respString500;
    }
 return "";
    }

    public String calculaUnitarioPreco500(float a){
        DecimalFormat df = new DecimalFormat("0.00");
        float respFloat500Uni = respFloat500/500;
        //String respString500Uni= String.valueOf(respFloat500Uni);
        String respString500Uni = df.format(respFloat500Uni);
        return respString500Uni;
    }


    public float valorDeVenda(float valorBase, float valorCor){
        float somaItensBasicos=0;
        verificaQualImpressao(tamanhoBase);
        //System.out.println("valor porcentagem "+verificaQualImpressao(tamanhoBase));
        somaItensBasicos = valorBase+valorCor;
        //System.out.println("valor que sofrerá o aumento "+somaItensBasicos);
        float valorComLucroResp = (somaItensBasicos*porcentagemAcrescida)/100;
       // System.out.println("valor com aumento "+valorComLucroResp);
        return valorComLucroResp;
    }

    public float verificaQualImpressao(float a) {
        if(a==0|| a==0.5 || a==1 || a==2 || a==3 || a==4) {
            if (getPersonalizacao().equals("basica")) {
                return porcentagemAcrescida=180;
            } else if (getPersonalizacao().equals("pantone")) {
                return porcentagemAcrescida=175;
            } else if (getPersonalizacao().equals("colorida")) {
                return porcentagemAcrescida=170;
            }

        } else if (a==5 || a==6 || a==7) {
            if (getPersonalizacao().equals("basica")) {
                return porcentagemAcrescida = 175;
            } else if (getPersonalizacao().equals("pantone")) {
                return porcentagemAcrescida = 172;
            } else if (getPersonalizacao().equals("colorida")) {
                return porcentagemAcrescida = 165;
            }

        } else if (a==8 || a==9 || a==10) {
            if (getPersonalizacao().equals("basica")) {
                return porcentagemAcrescida = 170;
            } else if (getPersonalizacao().equals("pantone")) {
                return porcentagemAcrescida = 168;
            } else if (getPersonalizacao().equals("colorida")) {
                return porcentagemAcrescida = 165;
            }

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
