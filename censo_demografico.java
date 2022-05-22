import java.util.Scanner;
public class censo_demografico {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		int genero=0,idadem,idadeh,idadeo;
		double alturam,alturah,alturao;
		int qtdm=0,qtdh=0,qtdo=0;
		
		System.out.printf("Voce se identifica como (0)mulher  -  (1)homem  -  (2)outro  -  (7)sair");
		
		while(genero != 7) {
			genero = sc.nextInt();
			switch(genero)
			{
			case 0:
				System.out.println("Mulher");
				System.out.println("Digite sua idade: ");
				idadem = sc.nextInt();
				System.out.println("Digite sua altura: ");
				alturam = sc.nextDouble();
				qtdm++;
				System.out.printf("Voce se identifica como (0)mulher  -  (1)homem  -  (2)outro  -  (7)sair");
				break;
			case 1:
				System.out.println("Homem");
				System.out.println("Digite sua idade: ");
				idadeh = sc.nextInt();
				System.out.println("Digite sua altura: ");
				alturah = sc.nextDouble();
				qtdh++;
				System.out.printf("Voce se identifica como (0)mulher  -  (1)homem  -  (2)outro  -  (7)sair");
				break;
			case 2:
				System.out.println("Outro");
				System.out.println("Digite sua idade: ");
				idadeo = sc.nextInt();
				System.out.println("Digite sua altura: ");
				alturao = sc.nextDouble();
				System.out.printf("Voce se identifica como (0)mulher  -  (1)homem  -  (2)outro  -  (7)sair");
				qtdo++;
				break;
			case 7:
				System.out.println("Programa Finalizado");
				break;	
			default:
				System.out.println("Escolha invalida");
				break;
			}
		}
				
				System.out.printf("A quantidade de outros:%d",qtdo);
				
				
				
				

				
		
	}

}
