/*Desafio
Faça um Programa que pergunte em que turno você estuda. 
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", 
conforme o caso.
*/

import java.util.Scanner;

public class qualSeuTurno {

	public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

		        char turno = leitor.next().toUpperCase().charAt(0);

		//TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:      
		        if (turno == 'M') {
			        	System.out.println("Bom Dia!");
			        } else if (turno == 'V') {
			        	System.out.println("Boa Tarde!");
			        } else if (turno == 'N') {
			        	System.out.println("Boa Noite!");
			        } else {
			        	System.out.println("Valor Inválido");
			        }

		    }

	}

