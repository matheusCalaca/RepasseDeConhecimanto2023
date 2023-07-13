package br.com.matheuscalaca.ProjetoRepasseDeConhencimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loop {


    @GetMapping("meuPrimeiroLoop")
    public void meuPrimeiroLoop(){
//        1 ate 100
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(100);

//        1 ate 100 usando for              numero = numero + 1
        for (int numero = 1; numero <= 100; numero++){
            System.out.println(numero);
        }

    }

    // array neste array agente nome de pessoas.
    // Olá, Calaça
    // Olá, Marcos
    @GetMapping("ola")
    public void ola(){
        String[] alunos = {"Calaça", "Ana", "Luis", "Marcos", "Xuxa", "João", "Juliana", "Thais", "Jose", "nino"};
//        System.out.println("Olá, "+alunos[0]);
//        System.out.println("Olá, "+alunos[1]);
//        System.out.println("Olá, "+alunos[2]);
//        System.out.println("Olá, "+alunos[3]);
        
        //neste for o limite do array são 4 elementos
        //                                posicao = posicao + 1
//        for(int posicao = 0 ; posicao <= 3; posicao++ ){
//            System.out.println("Olá, "+alunos[posicao]);
//        }

        int tamanhoDoArray = alunos.length;
//        tamanhoDoArray = 6;
        //   0         1      2         3       4       5      6
//        {"Calaça", "Ana", "Luis", "Marcos", "Xuxa", "João"}  X
        //posicao =6
        //                               alunos.length
        for(int posicao = 0 ; posicao < tamanhoDoArray; posicao++ ){
            System.out.println("Olá, "+alunos[posicao]);
        }
        //->
    }


}
