class NewThread1 extends Thread{
    NewThread(){
        super("Demo thread");
    }
    public void run(){
        System.out.println("child threat "+ Thread.currentThread());
    }
}