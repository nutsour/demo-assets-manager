package Testor;

import pojo.Assets;

import java.util.ArrayList;
import java.util.Scanner;

public class TestingForAssetsClass {
    public static void main(String[] args) {
        ArrayList<Assets> assetsArrayList = new ArrayList<>();
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
                    for (int i = 0;i<assetsArrayList.size();i++){
                        System.out.print(assetsArrayList.get(i).getName());
                        System.out.print(" "+assetsArrayList.get(i).getNumber());
                        System.out.print(" "+assetsArrayList.get(i).getPrice());
                        System.out.print(" "+assetsArrayList.get(i).getDate());
                        System.out.print(" "+assetsArrayList.get(i).getPerson());
                        System.out.print(" "+assetsArrayList.get(i).getAddress());
                        System.out.println();

                    }
                    //TODO 如果是同名资产，需要对其数量进行修改，其他不用变
                    break;
                case 2://添加资产
                    assetsArrayList.add(Assets.createAssets());
                    break;
                case 3://领用资产

                    break;
                default: flag = false;
            }
        }

    }
}
