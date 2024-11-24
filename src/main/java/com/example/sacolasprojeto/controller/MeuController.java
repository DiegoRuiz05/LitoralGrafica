package com.example.sacolasprojeto.controller;

import mainBackEnd.FazOrcamentoPapel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model; //talvez deixar


@Controller
public class MeuController extends FazOrcamentoPapel {

  @GetMapping("/")
  public String home() {
    return "SacolasPlasticas";
  }

  @GetMapping("/SacolasPlasticas")
  public ModelAndView sacolasPlasticas() {
    ModelAndView mv = new ModelAndView("SacolasPlasticas");
    return mv;
  }

  @GetMapping("/bocaVazadaFoscaOrcamento")
  public ModelAndView bocaVazadaFoscaOrcamento() {
    ModelAndView mv = new ModelAndView("BocaVazadaFoscaOrcamento");
    return mv;
  }

  @GetMapping("/BocaVazadaBrilhoOrcamento")
  public ModelAndView bocaVazadaBrilhoOrcamento() {
    ModelAndView mv = new ModelAndView("BocaVazadaBrilhoOrcamento");
    return mv;
  }

  @GetMapping("/AlcaCamisetaOrcamento")
  public ModelAndView alcaCamisetaOrcamento() {
    ModelAndView mv = new ModelAndView("AlcaCamisetaOrcamento");
    return mv;
  }

  @GetMapping("/AlcaFitaOrcamento")
  public ModelAndView alcaFitaOrcamento() {
    ModelAndView mv = new ModelAndView("AlcaFitaOrcamento");
    return mv;
  }




  //Orcamento

  //MEUS TESTES
  @GetMapping("/SacolasPapelOrcamento") //o link do http
  public ModelAndView sacolasPapelOrcamento() {
    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento"); //aqui mostra qual html ele vai pegar
    FazOrcamentoPapel fp = new FazOrcamentoPapel();//
    fp.setPersonalizacao("basica");
    fp.setPlastificacao("nao");
    fp.setIlhos("nao");
    fp.setCordoes("basico");
    mv.addObject("tamanhoSacolas", fp);
    return mv;
  }

  @PostMapping("/resultadoOrcamento")
  public String resultadoOrcamento(@ModelAttribute("tamanhoSacolas")FazOrcamentoPapel fp, Model model) {
    String resultado = "R$"+fp.qualTamanho(fp.getTamanhoBase(),fp.getPersonalizacao(), getPlastificacao(), getIlhos(), getCordoes());
    String resultadoUni = "R$"+fp.calculaUnitario();

    String resultado500 = "R$"+fp.calculaPreco500(fp.getTamanhoBase());
    String resultado500uni = "R$"+fp.calculaUnitarioPreco500(fp.getTamanhoBase());


    model.addAttribute("resultadoOrcamento", resultado);
    model.addAttribute("resultadoUni", resultadoUni);
    model.addAttribute("resultado500", resultado500);
    model.addAttribute("resultado500uni", resultado500uni);


    System.out.println("Tamanho "+fp.getTamanhoBase()+"\n Impresao "+fp.getPersonalizacao()+"\n Plastificação "+fp.getPlastificacao()+"\n ilhos "+fp.getIlhos()+"\n cordoes "+fp.getCordoes()+ "\n valor unitario: R$"+fp.calculaUnitario());

    return "SacolasPapelOrcamentoFinal";

  }

  @GetMapping("/SacolasPapelOrcamentoFinal")
  public ModelAndView orcamentoFinal() {
    return new ModelAndView("SacolasPapelOrcamentoFinal");
  }
}

