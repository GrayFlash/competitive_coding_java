class Singleton {
    private static Singleton single_instance;
    public int num;

    // private constructor
    private Singleton() {
        num= 5;
    }

    //static method to create instance of singleton class
    public static Singleton getInstance() {
        if(single_instance == null ){
            single_instance = new Singleton();
        }
        return single_instance;
    }

}

class Main {
    public static void main(String args[] ){
        Singleton singleA = Singleton.getInstance();
        Singleton singleB = Singleton.getInstance();
        System.out.println(singleA.num);
        System.out.println(singleB.num);
        singleB.num = 10;
        System.out.println(singleA.num);
        System.out.println(singleB.num);
    }
}