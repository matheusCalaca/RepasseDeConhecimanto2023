package br.com.matheuscalaca.ProjetoRepasseDeConhencimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Moto {

    @GetMapping("/somar")
    public int somar(){
        // aclerar por 10 metros
        return 1+9;
    }
}
