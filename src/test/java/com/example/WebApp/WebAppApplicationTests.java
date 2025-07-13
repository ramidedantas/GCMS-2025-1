package com.example.WebApp;

import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest; 
 
import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; 
import org.springframework.test.web.servlet.MockMvc; 
 
@SpringBootTest 
@AutoConfigureMockMvc 
class WebAppApplicationTests { 
 
  @Autowired 
  private MockMvc mockMvc; 
 
  @Test 
  public void shouldReturnDefaultMessage() throws Exception { 
    this.mockMvc.perform(get("/")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, World!"))); 
  }
  
  @Test 
  public void shouldReturnRamide() throws Exception { 
    this.mockMvc.perform(get("/ramide")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Ramide!"))); 
  }  

  @Test
  public void shouldReturnIsabelly() throws Exception {
    this.mockMvc.perform(get("/isabellybernardes"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Isabelly!?!?")));
  }

  @Test
  public void shouldReturnEdnaldo() throws Exception {
    this.mockMvc.perform(get("/Ednaldo"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Ednaldo!?!?")));
  }

  @Test 
  public void shouldReturnJorge() throws Exception { 
    this.mockMvc.perform(get("/jorge")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Jorge!?!?"))); 
  } 
  @Test 
  public void shouldReturnMadan() throws Exception { 
    this.mockMvc.perform(get("/madan")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Mádan!"))); 
  }
  @Test
  public void shouldReturnThamires() throws Exception {
    this.mockMvc.perform(get("/thamires"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, thamires!")));
  }