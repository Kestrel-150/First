public class Tank {
    int a;
    int b;

    public void goForward(int i) {
        a += 10;
    }
    public void goForwardn(int i) {
        a = a + 50;

    }
    public void goBackward(int i){
        b = a - 100;

    }

    public void printPosition() {
        if (a == 10)
            System.out.println("The Tank is at 10 now.");
        if (a == 60)
            System.out.println("The Tank is at 60 now.");
        if (a < 0)
            System.out.println("The Tank is at -40 now.");
        Cat barsik = new Cat();
        

    }
}
