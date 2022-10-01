import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import static ru.netology.geo.GeoServiceImpl.MOSCOW_IP;

public class GeoServiceImplTest {
    @Test
    void byIpTest() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp(MOSCOW_IP);
        Location expected = new Location(null, null, null, 0);
        Assertions.assertEquals(expected, actual);
    }
}
