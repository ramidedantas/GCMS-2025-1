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
  public void shouldReturnJose() throws Exception {
    this.mockMvc.perform(get("/jose"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, José!")));
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
    this.mockMvc.perform(get("/ednaldobarbosa"))
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
                    .string(containsString("Hello, Thamires!")));
  }
  
  @Test 
  public void shouldReturnThayna() throws Exception { 
    this.mockMvc.perform(get("/thayna")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Thayna BRANCH NOVA!"))); 
  }

  @Test
  public void shouldReturnHelena() throws Exception {
    this.mockMvc.perform(get("/helena"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Maria Helena!")));
  }

  @Test
  public void shouldReturnBruno() throws Exception {
    this.mockMvc.perform(get("/bruno-souza"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Bruno Souza!?!?")));
  }
  @Test
  public void shouldReturnEmilly() throws Exception {
    this.mockMvc.perform(get("/Emilly"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Emilly!?!?")));
  }

  @Test
  public void shouldReturnDavid() throws Exception {
    this.mockMvc.perform(get("/David"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, David!?!?")));
  }

  @Test
  public void shouldReturnDavidBranch() throws Exception {
    this.mockMvc.perform(get("/David-Esdras"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, David Esdras!?!?")));
  }

  @Test
  public void shouldReturnAnaLeticia() throws Exception {
    this.mockMvc.perform(get("/AnaLeticia"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Ana Leticia!?!?")));
  }

  @Test
  public void shouldReturnAnderson() throws Exception {
    this.mockMvc.perform(get("/Anderson"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Anderson!?!?")));
  }

}
