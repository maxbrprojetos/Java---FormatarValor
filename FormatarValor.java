package Varios;

public class FormatarValor {
    public int valorEntrada;
    
    

    String formatar(){
       
        int contador = 0;
       
        String valor;

        String valorFormatado = "";
       
       

        valor = Integer.toString(valorEntrada);


        for(int posicao = valor.length()-1; posicao > -1 ; posicao--){

               char variavel;

               variavel = valor.charAt(posicao);

               contador = contador + 1;


                   if ((contador % 3 == 0)&&(posicao > 0)){

                   valorFormatado =  "." + variavel + valorFormatado;

               }else{

                   valorFormatado =  variavel + valorFormatado;

               }

             }

            valorFormatado = "R$"+ valorFormatado + ",00";

        return valorFormatado;

    }

} 

}
