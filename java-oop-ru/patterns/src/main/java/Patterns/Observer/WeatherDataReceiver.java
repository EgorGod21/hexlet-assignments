package Patterns.Observer;

public class WeatherDataReceiver implements Observer<WeatherData> {
    private WeatherData weatherData;

    @Override
    public void update(WeatherData model) {
        this.weatherData = model;
        System.out.println(
                "Weather data has been updated: " + weatherData);
    }
}
