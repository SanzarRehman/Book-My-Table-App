package model;

public class Food13_Model {
    String Food13_RestaurantName_Id,Food13_Address_Id;
    Integer Food_13_Image_Id;

    public String getFood13_RestaurantName_Id() {
        return Food13_RestaurantName_Id;
    }

    public void setFood13_RestaurantName_Id(String food13_RestaurantName_Id) {
        Food13_RestaurantName_Id = food13_RestaurantName_Id;
    }

    public String getFood13_Address_Id() {
        return Food13_Address_Id;
    }

    public void setFood13_Address_Id(String food13_Address_Id) {
        Food13_Address_Id = food13_Address_Id;
    }

    public Integer getFood_13_Image_Id() {
        return Food_13_Image_Id;
    }

    public void setFood_13_Image_Id(Integer food_13_Image_Id) {
        Food_13_Image_Id = food_13_Image_Id;
    }

    public Food13_Model(String food13_RestaurantName_Id, String food13_Address_Id, Integer food_13_Image_Id) {
        Food13_RestaurantName_Id = food13_RestaurantName_Id;
        Food13_Address_Id = food13_Address_Id;
        Food_13_Image_Id = food_13_Image_Id;
    }


}
