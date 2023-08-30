public class Operators
{
     public static void main(String[] args) {
        
        int a = 10; //operador de atribuição
        int b = 5; 
        
        b += a; // aditivo
        b -= a; // subtrativo
        b *= a; // multiplicativo
        b /= a; // divisivo 
        b %= a; // modular (resto da divisão)

        int soma = 10 + 5; //infix
        int subtracao = 10 -5; 
        int multiplicacao = 10 * 5; 
        int divisao = 10 / 5; 
        int modulo = 10 % 5;

        //   a++;  postfix, ter atenção à procedência 
        //   ++a;  prefix = 11 
     
        // == igual igual/comparação
        // != diferente
        // < menor
	// > maior
	// <= menor igual
	// >= maior igual
		
		System.out.println(a++ == 11);
		System.out.println("--------------------");
		
      	/*  AND
      		 *  V and F => F
      		 *  V and V => V
      		 *  F and V =>  F
      		 *  F and F =>  F
      
      	 *  OR
      
      		 *  V or F => V
      		 *  V or V => V
      		 *  F or V => V
      		 *  F or F => F
      
      	*  XOR
      
      		 *  V xor F => V
      		 *  V xor V => F
      		 *  F xor V => V
      		 *  F xor F => F
      
      	 *  NEGAÇÃO LÓGICA

      		 *  !V => F
      		 *  !F => V
      		 *  
      		     */
      		
      	boolean v = true;
      	boolean f = false;
      		
      	// and && ou &  // && se a primeira for false, nem testa a segunda, o & testa todas as confições
      	// or ||
      	// xor !=
      	// ! nega um valor

	// TERNÁRIO
	int nota =7;
	System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");  //o if-else em uma linha, primeiro valor se vdd, segundo valor se falso
 
	}

}
