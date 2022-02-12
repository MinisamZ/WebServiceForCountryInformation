package kz.iitu;


import kz.iitu.soap.ws.client.generated.Calculator;
import kz.iitu.soap.ws.client.generated.CalculatorSoap;
import kz.iitu.soap.ws1.client.generated.GeoIPService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.err.println("hello");
        Calculator calculator = new Calculator();
        CalculatorSoap calculatorSoap = calculator.getCalculatorSoap();
        int sum = calculatorSoap.add(12371, 13121);
        System.out.println("sum = " + sum);

        GeoIPService geoIPService = new GeoIPService();
        String ipLocation = geoIPService.getGeoIPServiceSoap().getIpLocation("91.215.139.235");
        System.out.println("ipLocation = " + ipLocation);
        

    }
}
