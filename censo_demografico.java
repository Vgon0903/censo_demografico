import java.util.Scanner;
public class censo_demografico {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);

		// criacao das variaveis
		float altura, miH = 0, maM = 0, miG = 0, contMiH = 0, contMaM = 0, contMiG = 0, contOutros = 0, contIdade = 0;
		double ip=0, porcentagem;
		float outros = 0;
		int genero, idade = 0, i, hm = 0;

		// criado para repetir 1000 vezes
		for (i = 0; i < 1000; i++)
{
			
			// Pedido para informar genero a partir das opcoes apresentadas
			System.out.println("Digite seu genero: (0) Mulher , (1) Homem , (2)Outro: ");
			// informacao armazenada na variavel inte
			genero = ler.nextInt();
			
			//if = "se sim" e else = "se nao" se refere a estrutura de decisao criada para cada escolha feita
			if (genero > 2 || genero < 0) {
				// condicao para apresentar a mensagem 
				System.out.print("Comando inexistente! Reinicie o codigo!");
				// Para laco de repeticao
				break;
				
			
			} 
			else //se nao for a condicao de cima ira ira ser esse
			{
				// apresenta pergunta
				System.out.println("Qual sua idade?");
				// armazena informacao digitada na variavel "idade
				idade = ler.nextInt();
				// soma de idade
				hm = hm + idade;
				// Contador
				contIdade++;
				//recebe dados 
				System.out.println("Digite sua altura?");
				// armazena dado recebido na variavel altura
				altura = ler.nextFloat();
				
				// condicao criada junto ao contador para saber quantas pessoas tem idade entre 18 e 35 anos
				if (idade > 18 && idade < 35) {
					ip++;
				}
				
				//caso esoclha 1 seja feito 
				if (genero == 1) {
					// Soma 
					miH = miH + idade;
					// Contagem
					contMiH++;
					
					// caso escolha 0 seja feito
				} else if (genero == 0) {
					// Soma
					maM = maM + altura;
					// Contador
					contMaM++;
					
					// caso escolha 2 seja feito
				} else if (genero == 2) {
					// Soma
					outros = outros + 0;
					// Contador
					contOutros++;
				}
			}
		}
			
		// calculo das medias 
		ip = ip; 
		//variavel criada para saber a porcentagem de pessoas com idade entre 18 e 35 anos, utilizando contador criado
		porcentagem = (ip * 0.1);
		//calculo media da idade do grupo
		miG = hm / contIdade;
		//caculo para media da idade dos homens
		miH = miH / contMiH;
		//calculo para media da altura das mulheres
		maM = maM / contMaM;
		//Contador de outros
		outros = contOutros + 0;
		
		// Exibir media da idade do grupo 
		System.out.printf("A media da idade do grupo e: %f\n", +miG);
		// Exibir media da altura das mulheres
		System.out.printf("A media altura das mulheres e: %f\n", +maM);
		// Exibir media da idade dos homens 
		System.out.printf("A media da idade dos homens e: %f\n", +miH);
		// Exibir quantidade de pessoas que se identificam como outros
		System.out.printf("Quantidade de pessoas que se identificam como outros: %f\n", + outros);
		// Exibir porcentagem de pessoas com idade entre 18 e 35 anos
		System.out.printf("Porcentagem de pessoas com idade entre 18 e 35 anos: %f\n", + porcentagem);

	}

}
