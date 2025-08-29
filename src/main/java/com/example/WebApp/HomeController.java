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

  @RequestMapping("/jose")
  public @ResponseBody String greetingJose() {
    return "Hello, José!";
  }
  @RequestMapping("/jose_ruan")
  public @ResponseBody String greetingJoseRuanBranch() {
    return "Hello, José!";
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

  @RequestMapping("/jorge_branch")
  public @ResponseBody String greetingJorgeBranch() {
    return "Hello, Jorge_Branch!";
  }

  @RequestMapping("/jorge_fork")
  public @ResponseBody String greetingJorgeFork() {
    return "Hello, Jorge Fork!";
  }

  @RequestMapping("/madan")  
  public @ResponseBody String greetingMadan() {  
  return "Hello, Mádan!";  
  }


  @RequestMapping("/thamires")
  public @ResponseBody String greetingThamires() {
    return "Hello, Thamires!";
  }
  
  @RequestMapping("/thayna")
  public @ResponseBody String greetingThayna() {
    return "Hello, Thayna BRANCH NOVA!";
  }

  @RequestMapping("/helena")
  public @ResponseBody String greetingHelena() {
    return "Hello, Maria Helena!";
  }

  @RequestMapping("/helena_branch")
  public @ResponseBody String greetinghelenaBranch() {return "Hello, Helena Branch!"; }

  @RequestMapping("/helena_fork")
  public @ResponseBody String greetingHelenaFork() {
    return "Hello, Helena Fork!";
  }
  
  @RequestMapping("/thayna_fork")
  public @ResponseBody String greetingThaynaFork() {
    return "Hello, endpoint novo pra fork!";
  }

  @RequestMapping("/bruno-souza")
  public @ResponseBody String greetingBrunoSouza() {
    return "Hello, Bruno Souza!?!?";
  }


   @RequestMapping("/Emilly")
   public @ResponseBody String greetingEmilly() {
   return "Hello, Emilly!?!?";
   }

   @RequestMapping("/David")
   public @ResponseBody String greetingDavid() {
   return "Hello, David!?!?";
   }

   @RequestMapping("/AnaLeticia")
   public @ResponseBody String greetingAnaLeticia() {
   return "Hello, Ana Leticia!?!?";
   }

   @RequestMapping("/ana_leticia_branch")
  public @ResponseBody String greetingAnaLeticiaBranch() {
    return "Hello, Ana Leticia Branch!";
  }

   @RequestMapping("/David-Esdras")
   public @ResponseBody String greetingDavidBranch() {
   return "Hello, David Esdras!?!?";
   }

   @RequestMapping("/Tassio")
   public @ResponseBody String greetingTassio() {
    return "Hello, Tassio!?!?";
  }

   @RequestMapping("/tassio_branch")
  public @ResponseBody String greetingTassioBranch() {
    return "Hello, Tassio Branch!";
  }

  @RequestMapping("/tassio_fork")
  public @ResponseBody String greetingTassioFork() {
    return "Hello, Tassio Fork!!";
  }
  
  @RequestMapping("/bruno-souza-fork")
  public @ResponseBody String greetingBrunoSouzaFork() {
    return "Hello, Bruno Souza (fork)!";
  }

  @RequestMapping("/Anderson")
  public @ResponseBody String greetingAnderson() {
    return "Hello, Anderson!?!?";
  }

  @RequestMapping("/anderson_branch")
  public @ResponseBody String greetingAndersonBranch() {
    return "Hello, Anderson Branch!";
  }
  @RequestMapping("/clara")  
  public @ResponseBody String greetingClara() {  
  return "Hello, Clara!?!?";  
  }
  @RequestMapping("/clara_")  
  public @ResponseBody String greetingClaraBranch() {  
  return "Hello, Clara Branch!?!?";  
  }

  @RequestMapping("/ednaldo_branch")
  public @ResponseBody String greetingEdnaldoBranch() {
    return "Hello, Ednaldo Branch!";
  }
}