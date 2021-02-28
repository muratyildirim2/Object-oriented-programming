public class car {

    private int model;
    private int price;


    car(int model,int price)
    {
        this.model=model;
        this.price=price;
    }
     
    
    public int getModel()
    {
        return this.model;
    }
     
    
    public int getPrice()
    {
        return this.price;
    }


    public void setModel(int model)
    {
        this.model=model;
    }
    
    public void setPrice(int price)
    {
        this.price=price;
    }
}
