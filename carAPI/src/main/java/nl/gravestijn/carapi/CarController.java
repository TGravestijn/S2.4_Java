package nl.gravestijn.carapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController
{
    @Autowired
    private CarService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CarModel> getCars()
    {
        return service.getCars();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CarModel getCarById(@PathVariable int id)
    {
        return service.getCarByiD(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCar(@RequestBody CarModel car)
    {
        service.addCar(car);
    }

}
