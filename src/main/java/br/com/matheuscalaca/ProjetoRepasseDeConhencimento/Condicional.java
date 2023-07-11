package br.com.matheuscalaca.ProjetoRepasseDeConhencimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Condicional {

    @GetMapping("podeDirigir/{idade}/{carteira}")
    public String verificaSetemMaisDe18AnosEpodeDirigir(@PathVariable("idade") int idade, @PathVariable("carteira") boolean temCarteira) {

        String fraseDeRetorno = "";

//        if(idade >= 18 ){
//
//            if(temCarteira == true) {
//                fraseDeRetorno = "Pode Dirigir";
//            }else {
//                fraseDeRetorno= "NÃO Pode Dirigir";
//            }
//
//        }else{
//            fraseDeRetorno = "NÃO Pode Dirigir";
//        }


        if (idade >= 18 && temCarteira == true) {
            fraseDeRetorno = "Pode Dirigir";

        } else {
            fraseDeRetorno = "NÃO Pode Dirigir";
        }
        return fraseDeRetorno;//<-

    }

    @GetMapping("aluno/{nota}")
    public String verificaStatusAluno(@PathVariable("nota") int nota){
        String status = "";

//        > 70 -> aprovado
//         > 50 E < 70 -> Recuperação
//         >20 E < 50 -> Depedencia
//         < 20 -> reprovado
        if(nota >= 70){
            status = "aprovado";
        }else if(nota >= 50 && nota < 70){
            status = "Recuperação";
        }else if(nota >= 20 && nota < 50){
            status = "Depedencia";
        } else if(nota < 20){
            status = "reprovado";
        }

        return status;
    }


}
