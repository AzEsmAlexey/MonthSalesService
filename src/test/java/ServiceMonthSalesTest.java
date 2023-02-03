import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MonthSales.services.ServiceMonthSales;

public class ServiceMonthSalesTest {

    @Test
    public void shouldGetSalesAmount () {
        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAverageAmount () {
        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.getAverageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxMonth () {
        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getMaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinMonth () {
        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getMinMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinSales () {
        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxSales () {
        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
