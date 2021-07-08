package gameplay;
import java.util.Scanner;

public class execute {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 10;
		pilha1 um = new pilha1();
		for(int i=0;i<=max;i++) {
			um.push();
			i++;
		}
		pilha2 dois = new pilha2();
		pilha3 tres = new pilha3();
		System.out.println("Pilha 1:"+um.returnPilha());
		System.out.println("Pilha 2:"+dois.returnPilha());
		System.out.println("Pilha 3:"+tres.returnPilha());
		
		while(true) {
			System.out.println("0-sair do jogo");
			System.out.println("1-movimentar.");
			int x = input.nextInt();
			if(x==0) {
				break;
			}
			else {
				System.out.println("Qual pilha vai sofrer a movimentação? ");
				int y = input.nextInt();
				if(y==1) {
					System.out.println("Digite 1 para push ou 2 para pop: ");
					int o = input.nextInt();
					if(o==1) {
						um.push();
						System.out.println("Pilha 1:"+um.returnPilha());
						System.out.println("Pilha 2:"+dois.returnPilha());
						System.out.println("Pilha 3:"+tres.returnPilha());
					} else if(o==2) {
						um.pop();
						System.out.println("Pilha 1:"+um.returnPilha());
						System.out.println("Pilha 2:"+dois.returnPilha());
						System.out.println("Pilha 3:"+tres.returnPilha());
					} else {System.out.println("opção invalida");}
					
				}else if(y==2) {
					System.out.println("Digite 1 para push ou 2 para pop: ");
					int o = input.nextInt();
					if(o==1) {
						dois.push();
						System.out.println("Pilha 1:"+um.returnPilha());
						System.out.println("Pilha 2:"+dois.returnPilha());
						System.out.println("Pilha 3:"+tres.returnPilha());
					} else if(o==2) {
						dois.pop();
						System.out.println("Pilha 1:"+um.returnPilha());
						System.out.println("Pilha 2:"+dois.returnPilha());
						System.out.println("Pilha 3:"+tres.returnPilha());
					} else {System.out.println("opção invalida");}
				}else if(y==3) {
					System.out.println("Digite 1 para push ou 2 para pop: ");
					int o = input.nextInt();
					if(o==1) {
						tres.push();
						System.out.println("Pilha 1:"+um.returnPilha());
						System.out.println("Pilha 2:"+dois.returnPilha());
						System.out.println("Pilha 3:"+tres.returnPilha());
					} else if(o==2) {
						tres.pop();
						System.out.println("Pilha 1:"+um.returnPilha());
						System.out.println("Pilha 2:"+dois.returnPilha());
						System.out.println("Pilha 3:"+tres.returnPilha());
					} else {System.out.println("opção invalida");}
				}
		}
		}	
	}
}
