import ru.netology.MonthSales.services.ServiceMonthSales;

public class Main {
    public static void main(String[] args) {

        ServiceMonthSales service = new ServiceMonthSales();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int max = service.getMaxSales(sales);
        System.out.println(max);



    }
}