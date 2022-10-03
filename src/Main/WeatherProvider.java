package Main;


import db.DatabaseRepository;
import enums.Periods;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherProvider {

    void getWeather(Periods periods, DatabaseRepository dbRepo) throws IOException, SQLException;

    void getWeatherIn5Days(DatabaseRepository dbRepo) throws IOException, SQLException;
}