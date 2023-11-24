package Manager;

import bean.Assets;

import java.util.ArrayList;

public class AssetsManager {
    private ArrayList<Assets>  assetsArrayList = new ArrayList<>();

    public AssetsManager(){

    }

    public AssetsManager(ArrayList<Assets> assetsList) {
        assetsArrayList = assetsList;
    }

    public ArrayList<Assets> getAssetsList() {
        return assetsArrayList;
    }

    public void setAssetsList(ArrayList<Assets> assetsList) {
        assetsArrayList = assetsList;
    }

    public void queryAllAssets(){
        for (int i = 0;i < assetsArrayList.size();i++){
            System.out.println(assetsArrayList.get(i).toString());
        }
    }

    public void addAssets(Assets assets){
        assetsArrayList.add(assets);
    }

    public boolean removeAssets(int indexOfAssets,int takeNumber){//待领用的资产名称以及领用数量

        //通过传入的 index，获取对应的 Assets 对象，获取其中各项成员的值
        for (int i =  0;i <assetsArrayList.size();i++){
           Assets assetsTemp =  assetsArrayList.get(indexOfAssets);//将获取到的待删除对象封装成 assetsTemp
           if (assetsTemp.getNumber()>=takeNumber){
               assetsArrayList.remove(assetsTemp);// 从 assetsArrayList 中使用 remove 方法删除这个对象
               return true;
           }
        }
        return false;
    }
}
