package br.com.matheuscalaca.ProjetoRepasseDeConhencimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCondicional {

    // Exemplo de estrutura de controle "if"
    @GetMapping("/if/{idade}")
    public String estruturaIf(@PathVariable("idade") int idade) {
//        int idade = 17;

        if (idade >= 18) {
            return "Você pode dirigir";
        }

        return "Você NÃO pode dirigir";
    }


    // Exemplo de estrutura de controle "if-else"
    @GetMapping("/ifElse")
    public String estruturaIfElse() {
        boolean temCarteira = true;

        if (temCarteira) {
            return "Você pode dirigir";
        } else {
            return "Você Não pode dirigir";
        }
    }

    // Exemplo de estrutura de controle "if-else if-else"
    @GetMapping("/ifElseIf")
    public String estruturaIfElseIf() {
        int nota = 55;

        if (nota >= 70) {
            return "Voce foi Aprovado";
        } else if (nota >= 50) {
            return "Voce esta de recuperação";
        } else {
            return "Voce esta de REPROVADO";
        }
    }


}
