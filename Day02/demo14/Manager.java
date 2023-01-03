package Day02.demo14;

import java.util.ArrayList;

// 群主的类
public class Manager extends User {

    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看群主有多少钱
        int leftMoney = super.getMoney(); // 群主当前余额
        if (totalmoney > leftMoney){
            System.out.println("余额不足");
            return  redList; // 返回空集合
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalmoney);

        // 发红包需要重新拆分成为count份
        int avg = totalmoney / count;
        int mod = totalmoney % count; // 余数，也就是甩下的零头
        // 出不开的零头，包在最后一个红包当中
        // 把红包一个个放在集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int last = avg + mod;
        redList.add(last);

        return  redList;
    }
}
