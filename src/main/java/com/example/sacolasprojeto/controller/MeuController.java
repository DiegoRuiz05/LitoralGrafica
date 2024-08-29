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


  @GetMapping("/bocaVazadaFoscaOrcamento")
  public ModelAndView bocaVazadaFoscaOrcamento() {
    ModelAndView mv = new ModelAndView("bocaVazadaFoscaOrcamento");
    return mv;
  }

}

