import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> assets = new ArrayList<>();

        assets.add("电脑 1台 5999元 2023.11.22 Tom office");
        assets.add("办公桌 1台 1999元 2023.11.22 Tom office");
        assets.add("路由器 1台 399元 2023.11.22 Tom office");

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
                    for (int i = 0;i<assets.size();i++){
                        System.out.println(assets.get(i));
                    }
                    //TODO 如果是同名资产，需要对其数量进行修改，其他不用变
                    break;
                case 2://添加资产
                    String item = scanner.nextLine();
                    assets.add(item);
                    break;
                case 3://领用资产
                    //先利用删除方法，实现一个领用后从仓库中删除的效果
                    for (int i = 0;i<assets.size();i++){
                        System.out.println(assets.get(i));
                    }
                    System.out.println("输入你要领用的资产编号，下标从0开始");
                    String s= scanner.nextLine();
                    int i = Integer.parseInt(s);
                    if (i<assets.size()){
                        assets.remove(i);
                    }
                    System.out.println("领用成功");
                    break;
                default: flag = false;
            }
        }

    }
}
