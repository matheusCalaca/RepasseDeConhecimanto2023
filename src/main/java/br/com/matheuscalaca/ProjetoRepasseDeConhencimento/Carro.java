package br.com.matheuscalaca.ProjetoRepasseDeConhencimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Carro {
    @GetMapping("/acelerar")
    public void acelerar(){
        // aclerar por 10 metros
        System.out.println("o carro esta andando");
    }

    @GetMapping("/freiar")
    public String frear(){
        return "o seu carro esta freiando";
    }
}
