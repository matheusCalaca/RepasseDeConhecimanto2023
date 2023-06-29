package br.com.matheuscalaca.ProjetoRepasseDeConhencimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Variaveis {

    int[] numeroMegasena = {1,2,3,4,5,6};

    @GetMapping("variavel/exibiNumerosMegaSena")
    public int[] exibiNumerosMegaSena(){
        return  numeroMegasena;
    }

    @GetMapping("variavel/exibiNumerosTerceiraPosicaoMegaSena")
    public int exibiNumerosTerceiraPosicaoMegaSena(){
        return  numeroMegasena[2];
    }


    @GetMapping("variavel/exbiPosicao3E4")
    public int[] exbiPosicao3E4(){
        int[] exbiPosicao3E4 = {numeroMegasena[2], numeroMegasena[3]};
        return  exbiPosicao3E4;
    }

    @GetMapping("variavel/somaPrimeiroEUltimoNumeroMegaSena")
    public int somaPrimeiroEUltimoNumeroMegaSena(){
        return  numeroMegasena[0] + numeroMegasena[5];
    }

}


