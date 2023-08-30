public class Main
{
     public static void main(String[] args) {
        int[] notas = new int[10]; //new instância com tamanho fixo ou podendo ser vaizo {1, 2, 3, ...}
		
		notas[0] = 1;
		notas[2] = 5; //index 2 colocando o número 5
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		
		System.out.println(notas[0]);
		System.out.println(notas[2]);
		System.out.println(notas[6]);
		System.out.println(notas[4]);
		System.out.println(notas[1]);
		System.out.println(notas[9]);
		System.out.println(notas[7]);
		System.out.println("--------------------");

        String[] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"}; //new instância adicionando itens

        System.out.println(carros.length); //legth sempre se refere à quantidade de itens, ou seja, no exemplo acima é 5. 
	    System.out.println("--------------------");
	    
	       for (String carro : carros) {  //pra cada item de carros é atribuido à variável carro -- foreach
	        System.out.println(carros);
	        
	    }
	    
	    for (int i = 0; i < notas.length; i++) {
	        System.out.println(notas[i]);
	        // valores vazios na matriz  recebe 0, default 
	    }
	}

}
