package gameplay;
import java.util.Random;

public class pilha2 {
	int tamanhoMax = 10;
	int pilha[]=new int[tamanhoMax];
	int topo = -1;
	Random x = new Random();
	
	public pilha2(){
		
	}
	
	
	//* Auxiliaries Methods *//
	public void push() {
		if(isFull()) {
			System.out.println("Pilha est� cheia");
		} else {
			int y = (x.nextInt(99)+1);
			topo++;
			this.pilha[topo] = y;
		}
	}
	
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Lista Vazia");
	    } else {
	        if(this.topo==0){
	            try{
	                pilha[topo] = pilha[topo+1];
	                this.topo = -1;
	            }catch(ArrayIndexOutOfBoundsException o){
	                System.out.println("");
	            }
	        }else{
	        pilha[topo] = pilha[topo - 1];
	        this.topo--;}
	    }
	}
	
	public boolean isEmpty(){
		return topo==-1;
	}

	public boolean isFull() {

		return topo==tamanhoMax;
	}
	public String returnPilha() {
		return toString(this.pilha);
	}

	private String toString(int[] pilha2) {
		String x=("");
		for(int i=0;i<pilha2.length;i++) {
			x+=("["+pilha2[i]+"]");
		}
		return x;
	}
}
