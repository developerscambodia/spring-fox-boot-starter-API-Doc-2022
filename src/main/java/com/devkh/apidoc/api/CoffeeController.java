package com.devkh.apidoc.api;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devkh.apidoc.model.Coffee;

@RestController
@RequestMapping("api/v1/coffees")
public class CoffeeController {
    
    @GetMapping
    public ResponseEntity<Map<String, Object>> findAllCoffees() {

        // create response
        Map<String, Object> rest = new HashMap<>();

        List<Coffee> coffees = new ArrayList<>();

        coffees.add(new Coffee(1, "LATTE", "Ice Latte", "M", BigDecimal.valueOf(2.5)));
        coffees.add(new Coffee(2, "CAPUCHI", "Ice Capuchino", "M", BigDecimal.valueOf(2.5)));
        coffees.add(new Coffee(3, "MOCHA", "Ice Mocha", "M", BigDecimal.valueOf(3)));
        coffees.add(new Coffee(4, "HLATTE", "Hot Latte", "M", BigDecimal.valueOf(2)));
        coffees.add(new Coffee(5, "HCAPUCHI", "Hot Capuchino", "M", BigDecimal.valueOf(2)));

        // set rest values
        rest.put("code", HttpStatus.OK.value());
        rest.put("data", coffees);
        rest.put("message", "Coffees have been found successfully!");
        rest.put("timestamp", new Timestamp(System.currentTimeMillis()));

        return ResponseEntity.ok(rest);

    }

}
