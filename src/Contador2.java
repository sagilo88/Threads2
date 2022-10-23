import java.util.concurrent.atomic.AtomicInteger;

public  class Contador2 {
    public AtomicInteger getCont() {
        return cont;
    }

    public void setCont(AtomicInteger cont) {
        this.cont = cont;
    }

    private AtomicInteger cont= new AtomicInteger();

    }
    class Principal {
        public static void main(String[] args) {

            Contador2 O = new Contador2();

            int id=1;
            CustomThread2 t1=new CustomThread2(id, O);
            t1.start();
            CustomThread2 t2=new CustomThread2(id+1,O);
            t2.start();
            CustomThread2 t3=new CustomThread2(id+2,O);
            t3.start();
            CustomThread2 t4=new CustomThread2(id+3,O);
            t4.start();
        }
    }
