import ru.netology.sqr.SqrService;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();
        System.out.println("кол-во квадртатов:" +service.calcSqr(200, 300));
    }
}