package com.example.WebApp;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class HomeController { 
 
  @RequestMapping("/") 
  public @ResponseBody String greeting() { 
    return "Hello, World!!!"; 
  } 
  
  @RequestMapping("/ramide")
  public @ResponseBody String greetingRamide() { 
    return "Hello, Ramide!"; 
  }

  @RequestMapping("/intellij")
  public @ResponseBody String greetingIntellij() {
    return "Hello, Intellij!";
  }

  @RequestMapping("/eclipse") 
  public @ResponseBody String greetingEclipse() { 
    return "Hello, Eclipse!"; 
  }

  @RequestMapping("/main")
  public @ResponseBody String greetingMain() {
    return "Hello, Main!";
  }

  @RequestMapping("/hotfix")
  public @ResponseBody String greetingHotfix() {
    return "Hello, Hotfix!";
  }

  @RequestMapping("/ramide_branch")
  public @ResponseBody String greetingRamideBranch() {
    return "Hello, Branch!";
  }

  @RequestMapping("/isabellybernardes")
  public @ResponseBody String greetingIsabelly() {
    return "Hello, Isabelly!?!?";
  }

  @RequestMapping("/ednaldobarbosa")
  public @ResponseBody String greetingEdnaldo() {return "Hello, Ednaldo!?!?";}

}  
