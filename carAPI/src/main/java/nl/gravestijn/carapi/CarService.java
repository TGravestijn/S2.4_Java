package nl.gravestijn.carapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService
{
    List<CarModel> cars = new ArrayList<>(
            Arrays.asList(
                    new CarModel(0, "Mercedes-Benz", "190E"),
                    new CarModel(1, "BMW", "2002")
            )
    );

    public List<CarModel> getCars()
    {
        return cars;
    }

    public CarModel getCarByiD(int id)
    {
        for(CarModel car : cars)
        {
            if(car.getId() == id)
            {
                return car;
            }
        }
        return null;
    }

    public void addCar(CarModel car)
    {
        cars.add(car);
    }
}
