package demo.flightsearch.demo.Service;

import demo.flightsearch.demo.DAO.FlightDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightNumberService {

    @Autowired
    FlightDAO fDAO;

    public String getFlight(Long id) {
        return fDAO.getFlightById(id);
    }

}
