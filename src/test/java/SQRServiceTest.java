import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;
public class SQRServiceTest {
    @Test
    public void shouldCount200to300() {
        SQRService service = new SQRService();
        int count = service.countSqr(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, count);
    }
    @Test
    public void shouldCount300to200() {
        SQRService service = new SQRService();
        int count = service.countSqr(300, 200);
        int expected = 0;
        Assertions.assertEquals(expected, count);
    }
    @Test
    public void shouldCount200to200() {
        SQRService service = new SQRService();
        int count = service.countSqr(200, 200);
        int expected = 0;
        Assertions.assertEquals(expected, count);
    }
}

