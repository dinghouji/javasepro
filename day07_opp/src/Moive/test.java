package Moive;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        moive[] moives = new moive[4];
        moive m1 = new moive(1, "水门桥" ,38.9 ,9.8 ,"张艺谋" ,"吴京" ,13);
        moive m2 = new moive(2, "出拳吧" ,40.4 ,7 ,"某某" ,"外国人 " ,22);
        moive m3 = new moive(3, "盗梦空间" ,53.4 ,9.9 ,"诺兰" ,"小李子" ,29);
        moive m4 = new moive(4, "信条" ,33.5 ,9.8 ,"诺兰" ,"小李子" ,33);
        moives[0] = m1;
        moives[1] = m2;
        moives[2] = m3;
        moives[3] = m4;

        Scanner sc = new Scanner(System.in);
        moiveOperate operate = new moiveOperate(moives);

        while (true) {
            System.out.println("===========请输入以下操作进行选择电影=========");
            System.out.println("输入1查看所有电影：");
            System.out.println("输入2查询电影详情：");

            int m = sc.nextInt();
            switch (m){
                case 1:
                    operate.printAllMoives();
                    break;
                case 2:
                    System.out.println("请输入你要查看电影详情的编号：");
                    operate.printSeceltId(sc.nextInt());
                    break;
            }
        }
    }
}
