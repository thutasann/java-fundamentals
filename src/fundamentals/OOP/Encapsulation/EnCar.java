package fundamentals.OOP.Encapsulation;

public class EnCar {
    private String make;
    private String model;
    private int year;

    EnCar(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    EnCar(EnCar x){
        this.copy(x);
    }

    public String getMake(){
        return make;
    }

    public  String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(EnCar x){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

}
