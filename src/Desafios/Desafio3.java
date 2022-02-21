package Desafios;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas 
 * para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares 
 * de substrings que são anagramas.
 * 
 * @author Renan Vasconcelos
 * 
 */


public class Desafio3 {
	public static void main(String[] args) {		
		
		
		String palavra;
		
		Scanner scan = new Scanner(System.in);
						
		System.out.println("Digite a palavra: ");
        palavra = scan.nextLine();
		
        anagrama(palavra);
        scan.close();
	}
	
	 static void anagrama(String palavra){
	        
	        HashMap<String, Integer> mapa = new HashMap<>();
	        
	        for(int i  = 0; i <= palavra.length(); i++){
	            for( int j = i; j < palavra.length(); j++ ){
	                
	                char[] caracter = palavra.substring(i, j+1).toCharArray();
	                Arrays.sort(caracter);
	                String subCaract = new String(caracter);
	                
	                if(mapa.containsKey(subCaract)){
	                    mapa.put(subCaract, mapa.get(subCaract) + 1);
	                }                    
	                else{
	                    mapa.put(subCaract,1);
	                }                    
	            }
	        }
	        
	        int qtdPares = 0;
	        
	        for(String cont: mapa.keySet()) {
	            
	            int n = mapa.get(cont);
	            qtdPares += (n*(n-1))/2;
	        }
	        System.out.print("Quantidade de pares que são anagramas é de " + qtdPares);
	        
	}
}
