package ram.ramires.listcar;

public class Entity {
    private String brand;
    private String image;
    private String model;
    private String descrition;
    private String classification;
    private String price;
    public Entity(String name, String image, String model, String descrition, String classification, String price ){
        this.brand=name;
        this.image=image;
        this.model=model;
        this.descrition=descrition;
        this.classification=classification;
        this.price=price;
    }

    public void setName(String name){
        this.brand=name;
    }
    public String getName(){
        return brand;
    }
    public void setImage(String image){
        this.image=image;
    }
    public String getImage(){
        return image;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setDescrition(String descrition){
        this.descrition=descrition;
    }
    public String getDescrition(){
        return descrition;
    }
    public void setClassification(String classification){
        this.classification=classification;
    }
    public String getClassification(){
        return classification;
    }
    public void setPrice(String price){
        this.price=price;
    }
    public String getPrice(){
        return price;
    }
}
enum Brand {
    FERRARI,FORD,LAMBORGHINI,DODGE,PORSCHE
}
enum Class{
    SPORTCAR, MUSLECAR, RETRO, MUSCLE_RETRO
}
