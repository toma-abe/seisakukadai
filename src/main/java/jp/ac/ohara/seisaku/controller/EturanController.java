package jp.ac.ohara.seisaku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EturanController {
  @GetMapping("/view")
  public String index(Model model) {
    model.addAttribute("message", "うんち");
    return "eturan";
  }
}