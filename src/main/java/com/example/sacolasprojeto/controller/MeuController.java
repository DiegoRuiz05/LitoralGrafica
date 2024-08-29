package com.example.sacolasprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model; //talvez deixar
import org.springframework.web.bind.annotation.RequestParam; //talvez deixar

@Controller
public class MeuController {
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

}

