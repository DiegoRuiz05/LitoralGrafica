package com.example.sacolasprojeto.controller;

import mainBackEnd.FazOrcamentoPapel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model; //talvez deixar
import org.springframework.web.bind.annotation.RequestParam; //talvez deixar

import java.util.Arrays;
import java.util.List;

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
    ModelAndView mv = new ModelAndView("bocaVazadaFoscaOrcamento");
    return mv;
  }

  @GetMapping("/BocaVazadaBrilhoOrcamento")
    public ModelAndView bocaVazadaBrilhoOrcamento() {
      ModelAndView mv = new ModelAndView("bocaVazadaBrilhoOrcamento");
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





//  @GetMapping("/SacolasPapelOrcamento")
//  ModelAndView sacolasPapelOrcamento() {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento");
//    List<String> tamanhos = Arrays.asList("Pequena", "Média", "Grande", "Extra Grande");
//    model.addAttribute("tamanhos", tamanhos);
//    return tamanhos;
//
//  }


//  @PostMapping("/SacolasPapelOrcamento")
//  public ModelAndView sacolasPapelOrcamento(String pegarTamanhos) {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento");
//    FazOrcamentoPapel calcTamanho = new FazOrcamentoPapel();
//    calcTamanho.qualTamanho(pegarTamanhos);
//    System.out.println(pegarTamanhos);
//    System.out.println(qualTamanho());
//
//    return mv;
//  }

//  @PostMapping("/SacolasPapelOrcamento")
//  public ModelAndView form(String getTamanho){
//    ModelAndView mv = new ModelAndView("index");
//    FazOrcamentoPapel fp = new FazOrcamentoPapel();
//    fp.qualTamanho(getTamanho);
//    mv.addObject("fp", fp);
//    mv.addObject("getTamanho", fp.qualTamanho(getTamanho));
//    System.out.println(getTamanho);
//    System.out.println(fp.qualTamanho(getTamanho));
//    return mv;
//  }

  @GetMapping("/SacolasPapelOrcamento")
  public ModelAndView sacolasPapelOrcamento() {
    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento");
    mv.addObject("getTamanho", new FazOrcamentoPapel());
    return mv;
  }

  @PostMapping("/RespostaOrcamentoPapel")
    public ModelAndView form(@ModelAttribute("getTamanho") FazOrcamentoPapel calcSacola){
    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento");
    calcSacola.qualTamanho(calcSacola.getTamanhoSacola());

    mv.addObject("getTamanho",calcSacola.getTamanhoSacola());
    System.out.println("valor selecionado" +calcSacola.getTamanhoSacola());
    System.out.println("Tamanho calculado: " + calcSacola.qualTamanho(calcSacola.getTamanhoSacola()));

    return mv;
  }

}

