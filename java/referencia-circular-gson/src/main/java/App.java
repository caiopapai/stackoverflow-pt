import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setB(b);
        b.setA(a);

        Gson gson = new Gson();
        String x = gson.toJson(a);
    }


}
