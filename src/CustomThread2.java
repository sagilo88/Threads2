import java.util.concurrent.atomic.AtomicInteger;

public class CustomThread2 extends Thread{
    int id;
    Contador2 conta = new Contador2();
    AtomicInteger at;
    CustomThread2 (int id,Contador2 c){
        this.id=id;
        this.conta=c;


    }
    public void run() {
        for(int i=0;i<500;i++){
           this.conta.getCont().getAndIncrement();
        }
        at = new AtomicInteger(this.conta.getCont().intValue());
        this.conta.setCont(at);
       System.out.printf("Hola, soy "+ this.id + " y mi contador es: " + this.conta.getCont()+"\n");
    }

}
