package Desafios;
import java.util.Scanner;

/**
 * D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a 
 * senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os 
 * seguintes crit�rios
 * 
 * D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza 
 * se � uma senha forte. Para ajudar D�bora, <u>construa um algoritmo que informe qual 
 * � o n�mero m�nimo de caracteres que devem ser adicionados para uma string qualquer ser 
 * considerada segura</u>.
 * 
 * @author Renan Vasconcelos
 *
 */

public class Desafio2 {
	
	static boolean achouNumero = false;
	static boolean achouMaiuscula = false;
	static boolean achouMinuscula = false;
	static boolean achouSimbolo = false;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String senha = "";
		int temDigito=0;
		int temMaisculo=0;
		int temMinusculo=0;
		int temSimbolo=0;
		int temSeis=0;
		int n = 0;
		int resultado=0;
		
	  System.out.println("A SENHA PRECISA CONTER: \n"
				+ "* Possui no m�nimo 6 caracteres.\n"
				+ "* Cont�m no m�nimo 1 digito.\n"
				+ "* Cont�m no m�nimo 1 letra em min�sculo.\n"
				+ "* Cont�m no m�nimo 1 letra em mai�sculo.\n"
				+ "* Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+\n");
		
		System.out.print("Digite sua senha: ");
		senha = sc.nextLine();
		
		if(senha.length()>=6) {
			temSeis=1;
		}
		
		for(char c : senha.toCharArray()) {
			if(c >= '0' && c <= '9') {
				temDigito=1;
			}
			if(c >= 'A' && c <= 'Z') {
				temMaisculo=1;
			}
			if(c >= 'a' && c <= 'z') {
				temMinusculo=1;
			}
			if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%'
				|| c == '^' || c == '&' || c == '*' || c == '(' || c == ')'
				|| c == '-' || c == '+') {
				temSimbolo=1;
			}
		}
				
		if(temSeis == 1) {
			if(temDigito == 0) {
				n++;
			}
			if(temMaisculo == 0) {
				n++;
			}
			if(temMinusculo == 0) {
				n++;
			}
			if(temSimbolo == 0) {
				n++;
			}
			resultado = n;
		} else {
			if(temDigito == 0) {
				n++;
			}
			if(temMaisculo == 0) {
				n++;
			}
			if(temMinusculo == 0) {
				n++;
			}
			if(temSimbolo == 0) {
				n++;
			}
			if(6 - senha.length() > n) {
				n = 6 - senha.length();
			}
			resultado = n;
		}
		
		if(resultado != 0) {
			System.out.println("Faltam " + resultado + " requisitos serem atendidos!");
			senhaForte(senha);
		}
		else {
			System.out.println("A senha informada � segura!");
		}
		
		
		sc.close();

	}
	
	public static boolean senhaForte(String senha) {
			
			for (char c : senha.toCharArray()) {
		         if (c >= '0' && c <= '9') {
		             achouNumero = true;
		         } else if (c >= 'A' && c <= 'Z') {
		             achouMaiuscula = true;
		         } else if (c >= 'a' && c <= 'z') {
		             achouMinuscula = true;
		         } else if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%'
		 				|| c == '^' || c == '&' || c == '*' || c == '(' || c == ')'
						|| c == '-' || c == '+') {
		             achouSimbolo = true;
		         }
		    }
			
			if(!achouNumero) {
				System.out.println("Sua senha precisa conter um n�mero!");
			}
			if(!achouMaiuscula) {
				System.out.println("Sua senha precisa conter pelo menos uma letra Maiuscula!");
			}
			if(!achouMinuscula) {
				System.out.println("Sua senha precisa conter pelo menos uma letra Minuscula!");
			}
			if (!achouSimbolo) {
				System.out.println("Sua senha precisa conter pelo menos um caracter especial");
			}
			
			return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
	}

}
