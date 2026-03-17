package firstjavapackage.runner;

import firstjavapackage.WeatherAdvisor;

public class WeatherAdvisorRunner {

    public static void main(String[] args) {

        WeatherAdvisor advisor = new WeatherAdvisor();
        System.out.println(advisor.provideWeatherAdvisory(-5));
        System.out.println(advisor.provideWeatherAdvisory(5));
        System.out.println(advisor.provideWeatherAdvisory(15));
        System.out.println(advisor.provideWeatherAdvisory(25));
        System.out.println(advisor.provideWeatherAdvisory(0));
    }
}
