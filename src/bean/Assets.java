package bean;

public class Assets {
    private String assetsName;
    private int assetsNumber;
    private int assetsPrice;
    private String assetsDate;
    private String assetsPerson;
    private String assetsAddress;



    public Assets(){

    }
    public Assets(String assetsName, int assetsNumber, int assetsPrice, String assetsDate, String assetsPerson, String assetsAddress) {
        this.assetsName = assetsName;
        this.assetsNumber = assetsNumber;
        this.assetsPrice = assetsPrice;
        this.assetsDate = assetsDate;
        this.assetsPerson = assetsPerson;
        this.assetsAddress = assetsAddress;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "assetsName='" + assetsName + '\'' +
                ", assetsNumber=" + assetsNumber +
                ", assetsPrice=" + assetsPrice +
                ", assetsDate='" + assetsDate + '\'' +
                ", assetsPerson='" + assetsPerson + '\'' +
                ", assetsAddress='" + assetsAddress + '\'' +
                '}';
    }


    public static Assets createAssets(String assetsName, int assetsNumber, int assetsPrice, String assetsDate, String assetsPerson, String assetsAddress){//创建一个本pojo类对象，使用静态方法
        return new Assets(assetsName,assetsNumber,assetsPrice,assetsDate,assetsPerson,assetsAddress);
    }


    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public int getAssetsNumber() {
        return assetsNumber;
    }

    public void setAssetsNumber(int assetsNumber) {
        this.assetsNumber = assetsNumber;
    }

    public int getAssetsPrice() {
        return assetsPrice;
    }

    public void setAssetsPrice(int assetsPrice) {
        this.assetsPrice = assetsPrice;
    }

    public String getAssetsDate() {
        return assetsDate;
    }

    public void setAssetsDate(String assetsDate) {
        this.assetsDate = assetsDate;
    }

    public String getAssetsPerson() {
        return assetsPerson;
    }

    public void setAssetsPerson(String assetsPerson) {
        this.assetsPerson = assetsPerson;
    }

    public String getAssetsAddress() {
        return assetsAddress;
    }

    public void setAssetsAddress(String assetsAddress) {
        this.assetsAddress = assetsAddress;
    }
}
