package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList = new ArrayList<>();

    public void addFood() {
        Food f = new Food();
        Scanner sc = new Scanner(System.in);

        System.out.println("请您输入菜品名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请您输入菜品价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入菜品描述：");
        String description = sc.next();
        f.setDescription(description);

        foodList.add(f);
        System.out.println("菜品上架成功");
    }
    
    public void showFood(){
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDescription());
            System.out.println("--------------------");
        }
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("请选择功能");
            System.out.println("1.添加菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出程序");
            String choice = sc.next();
            switch (choice) {
                case "1":addFood();
                break;
                case "2":showFood();
                break;
                case "3":
                    System.out.println("下次再来哦");
                    return;
                default:
                    System.out.println("您输入的编号有误，请重新输入!");
            }
        }
    }

}
