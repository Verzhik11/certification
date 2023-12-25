package service;

import com.gridnine.testing.Flight;

import java.time.LocalDate;
import java.util.List;

/**
 * Класс для комбинирования правил с одним примером
 */

public class FilterByRules {
    private final FilterFlights filterFlights;

    public FilterByRules(FilterFlights filterFlights) {
        this.filterFlights = filterFlights;
    }

    /**
     * Метод комбинирует правила и выводит список перелетов без пересадок на определенную дату
     * @return
     */
    public List<Flight> todayNoTransit() {
        List<Flight> noTransitFlights = filterFlights.kindOfFlight(0);
        return new FilterFlights(noTransitFlights).thisDay(LocalDate.now());
    }

}

