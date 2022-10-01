import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    @DisplayName("Проверка метода определения геолокации по ip-адресу")
    void byIpTest() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("172.27.105.11");
        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);
        Assertions.assertEquals(expected.getCity(), actual.getCity());
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
    }
}
