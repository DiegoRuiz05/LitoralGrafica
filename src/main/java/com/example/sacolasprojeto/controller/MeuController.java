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

  //Orcamento




  //MEUS TESTES
  @GetMapping("/SacolasPapelOrcamento") //o link do http
  public ModelAndView sacolasPapelOrcamento() {
    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento"); //aqui mostra qual html ele vai pegar
    mv.addObject("tamanhoSacolas", new FazOrcamentoPapel());
    FazOrcamentoPapel fp = new FazOrcamentoPapel();//
    return mv;
  }

  @PostMapping("/efetuarOrcamento")
  //public String efetuarOrcamento(FazOrcamentoPapel fp) {
  public String efetuarOrcamento(@ModelAttribute("tamanhoSacolas")FazOrcamentoPapel fp, Model model) {
    String resultado = fp.qualTamanho(fp.getTamanhoBase());
    model.addAttribute("resultadoOrcamento", resultado);
    System.out.println(fp.getTamanhoBase());
    return "SacolasPapelOrcamentoFinal";
    //return "redirect:/SacolasPapelOrcamentoFinal";
  }

//  @GetMapping("/SacolasPapelOrcamentoFinal")
//  public ModelAndView orcamentoFinal() {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamentoFinal");
//    return mv;
//  }

  //tava erto
//  @GetMapping("/SacolasPapelOrcamentoFinal")
//  public ModelAndView orcamentoFinal() {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamentoFinal");
//    FazOrcamentoPapel fp = new FazOrcamentoPapel();
//    mv.addObject("tamanhoSacolas", fp.qualTamanho(getTamanhoBase()));
//    System.out.println(fp.qualTamanho(getTamanhoBase()));
//    return mv;
//  }



  //ignorar
  //
//  @PostMapping("/efetuarOrcamento")
//  public ModelAndView form(Integer tamanhoBase) {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamento");
//    FazOrcamentoPapel fp = new FazOrcamentoPapel();
//    fp.qualTamanho(tamanhoBase);
//    mv.addObject("fp", fp);
//    System.out.println(tamanhoBase);
//    System.out.println(fp.qualTamanho(tamanhoBase));
//    return "redirect:/SacolasPapelOrcamentoFinal";
//  }
//
//  @GetMapping("/SacolasPapelOrcamentoFinal")
//  public ModelAndView orcamentoFinal() {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamentoFinal");
//    mv.addObject("tamanhoSacolas", new FazOrcamentoPapel());
//    return mv;
//  }

//    @GetMapping("/SacolasPapelOrcamentoFinal")
//  public ModelAndView form(Integer tamanhoBase) {
//    ModelAndView mv = new ModelAndView("SacolasPapelOrcamentoFinal");
//    FazOrcamentoPapel fp = new FazOrcamentoPapel();
//    fp.qualTamanho(tamanhoBase);
//    mv.addObject("fp", fp);
//    System.out.println(tamanhoBase);
//    System.out.println(fp.qualTamanho(tamanhoBase));
//    return mv;
//  }



}

