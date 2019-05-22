package demo.flightsearch.demo.DAO;

import com.fasterxml.jackson.core.JsonParser;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightDAO {

    private List<Object> flightList;

    public FlightDAO() {
        BasicJsonParser jp = new BasicJsonParser();
        this.flightList = jp.parseList("flight-sample.json");
    }

    public String getFlightById(Long id) {

        for (Object obj : flightList) {
            if (obj.id == id) {
                return obj.toString();
            }
        }
        return null;
    }

}
