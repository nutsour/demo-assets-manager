package Testor;

import Manager.AssetsManager;
import bean.Assets;

import java.util.Scanner;


public class TestorForAssets {
    public static void main(String[] args) {
        AssetsManager assetsManager = new AssetsManager();

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1.查看资产");
            System.out.println("2.添加资产");
            System.out.println("3.领用资产");
            System.out.println("4.退出系统");
            System.out.println("请输入你的选择");
            //统一使用 nextLine()，规避 nextInt() 读入后会产生换行符的问题
            String select = scanner.nextLine();
            //将读入的 select 类型强转为 int 型，便于使用 switch case
            int selected = Integer.parseInt(select);

            switch (selected){
                case 1://查看所有资产
                    assetsManager.queryAllAssets();
                    break;
                //TODO 如果是同名资产，需要对其数量进行修改，其他不用变
                case 2://添加资产
                    System.out.println("name");
                    String name = scanner.nextLine();
                    System.out.println("number");
                    String numberString = scanner.nextLine();
                    int number = Integer.parseInt(numberString);
                    System.out.println("price");
                    String priceString = scanner.nextLine();
                    int price = Integer.parseInt(priceString);
                    System.out.println("date");
                    String date = scanner.nextLine();
                    System.out.println("person");
                    String person = scanner.nextLine();
                    System.out.println("address");
                    String address = scanner.nextLine();
                    Assets assets = Assets.createAssets(name, number, price, date, person, address);
                    assetsManager.addAssets(assets);
                    break;
                case 3://领用资产
                   //调用removeAssets方法，从 assetsArrayList 中删除对应的下标
                   assetsManager.queryAllAssets();
                    System.out.println("input index that you want to take");
                    String indexOfAssetsString =  scanner.nextLine();
                    int indexOfAssets = Integer.parseInt(indexOfAssetsString);
                    System.out.println("input the takeNumber that you want to take");
                    String takeNumberString =  scanner.nextLine();
                    int takeNumber = Integer.parseInt(takeNumberString);
                    if (assetsManager.removeAssets(indexOfAssets,takeNumber)){
                        System.out.println("领用成功");
                    }else
                        System.out.println("领用失败");
                    break;
                default: flag = false;
            }
        }

    }
}
