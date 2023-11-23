package pojo;

import java.util.Scanner;

public class Assets {
    private String name;
    private Integer number;
    private Integer price;
    private String date;
    private String person;
    private String address;

    public Assets(String name,Integer number,Integer price,String date,String person,String address){
        this.name = name;
        this.number = number;
        this.price = price;
        this.date = date;
        this.person = person;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Assets(){

    }

   public static Assets createAssets(){
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       String numberString = scanner.nextLine();
       int number = Integer.parseInt(numberString);
       String priceString = scanner.nextLine();
       int price = Integer.parseInt(priceString);
       String date = scanner.nextLine();
       String person =  scanner.nextLine();
       String address = scanner.nextLine();

       Assets assets = new Assets(name, number, price, date, person, address);
       return assets;

   }

}
