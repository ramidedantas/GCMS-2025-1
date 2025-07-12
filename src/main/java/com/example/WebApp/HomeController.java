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

  @RequestMapping("/isabelly_branch")
  public @ResponseBody String greetingIsabellyBranch() {
    return "Hello, Isabelly Branch!";
  }

  @RequestMapping("/isabelly_fork")
  public @ResponseBody String greetingIsabellyFork() {
    return "Hello, Isabelly Fork!";
  }

  @RequestMapping("/ednaldobarbosa")
  public @ResponseBody String greetingEdnaldo() {return "Hello, Ednaldo!?!?";}
  
  
  @RequestMapping("/jorge")
  public @ResponseBody String greetingJorge() {
    return "Hello, Jorge!?!?";
  }
  
  @RequestMapping("/madan")  
  public @ResponseBody String greetingMadan() {  
  return "Hello, Mádan!";  
  }
  @RequestMapping("/madanFork")  
  public @ResponseBody String greetingMadanFork() {  
  return "Hello, Mádan Fork!";  
  }
}  
