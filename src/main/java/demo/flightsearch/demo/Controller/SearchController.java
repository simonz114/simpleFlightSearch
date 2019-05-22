package demo.flightsearch.demo.Controller;

import demo.flightsearch.demo.Service.FlightNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    FlightNumberService fns;

    @GetMapping("/flight_number/{id}")
    public ResponseEntity getFlightNumberController(@PathVariable("id") Long id) {
        String result = fns.getFlight(id);
        return new ResponseEntity(result, HttpStatus.OK);
    }

}
