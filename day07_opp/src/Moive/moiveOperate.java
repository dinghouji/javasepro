package Moive;

public class moiveOperate {
    private moive[] moives;

    public moiveOperate(moive[] moives) {
        this.moives = moives;
    }

    public void printAllMoives(){
        System.out.println("==========电影的全部信息========");
        for (int i = 0; i < moives.length; i++) {
            moive m = moives[i];
            System.out.println("编号:" + m.getId());
            System.out.println("名称:" + m.getName());
            System.out.println("价格:" + m.getPrice());
            System.out.println("导演:" + m.getDirector());
            System.out.println("==========================");

        }
    }

    public void printSeceltId(int id){
        System.out.println("==============详细信息==========");
        for (int i = 0; i < moives.length; i++) {
            if (moives[i].getId() == id) {
                System.out.println("编号:" + moives[i].getId());
                System.out.println("名称:" + moives[i].getName());
                System.out.println("导演:" + moives[i].getDirector());
                System.out.println("价格:" + moives[i].getPrice());
                System.out.println("演员:" + moives[i].getActor());
                System.out.println("得分:" + moives[i].getScore());
                System.out.println("观看次数:" + moives[i].getInfo());
                return;
            }
        }
        System.out.println("没有你所查找的编号~~");

    }
}
