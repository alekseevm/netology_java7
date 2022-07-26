import org.junit.jupiter.api.Test;
import ru.netology.sqr.SqrService;
import org.junit.jupiter.api.Assertions;

public class SqrServiceTest {
    @Test
    public void shouldCalcExact() {
        SqrService service = new SqrService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcNotExact() {
        SqrService service = new SqrService();

        int expected = 5;
        int actual = service.calcSqr(100, 200);

        Assertions.assertEquals(expected, actual);
    }
}
