package gameplay;
import java.util.Random;

public class pilha1 {
	int tamanhoMax = 10;
	int[] pilha = new int[tamanhoMax];
	int topo = -1;
	Random x = new Random();
	
	public pilha1(){
		this.topo = 0;
	}
	

	//* Auxiliaries Methods *//
    public boolean push() {
    	int n = x.nextInt(99)+1;
        if (isFull()) {
            System.out.println("\nNao pode incluir. A pilha esta' cheia.");
            return false;
        } else {
            topo++;
            this.pilha[topo]=n;
            return true;
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
