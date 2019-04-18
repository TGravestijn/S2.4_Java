package nl.gravestijn.carapi;

public class CarModel
{
    private int id;
    private String brand;
    private String model;

    public CarModel(int id, String brand, String model)
    {
        this.id = id;
        this.brand= brand;
        this.model=  model;
    }

    public CarModel()
    {

    }

    public int getId()
    {
        return id;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}
