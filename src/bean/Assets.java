package bean;

public class Assets {
    private String name;
    private int number;
    private int price;
    private String date;
    private String person;
    private String address;

    public Assets(String name,int number,int price,String date,String person,String address){
        this.name = name;
        this.number = number;
        this.price = price;
        this.date = date;
        this.person = person;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", person='" + person + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public static Assets createAssets(String name,int number,int price,String date,String person,String address){//创建一个本pojo类对象，使用静态方法
        return new Assets(name,number,price,date,person,address);
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



}
