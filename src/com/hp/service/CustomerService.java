package com.hp.service;

import com.hp.bean.Customer;
import com.hp.bean.CustomerData;
import com.hp.util.TestUtil;

import java.util.List;
import java.util.Scanner;

//此类完成客户的所有业务（增删改查）
public class CustomerService {

    private List<Customer> customerList;
    private Customer currentcustomer;
    public void checkPwd(String cardid, String cardPwd){
        CustomerData customerData = CustomerData.getInstance();
        customerList = customerData.getCustomerList();
        //用拿到的账户名和密码跟集合中的作比较
        System.out.println("cardid = " + cardid);
        System.out.println("cardPwd = " + cardPwd);
        for (Customer customer : customerList) {
            if(customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){
                currentcustomer = customer;
                //账户密码正确
                System.out.println("欢迎"+customer.getCname()+"顾客登陆！请注意安全");
                TestUtil.oneLeveOption();
                Scanner scanner = new Scanner(System.in);
                //选择输入
                String option = scanner.nextLine();
                oneOption(option);//用户功能选择的封装
            }
        }
    }
//取款类
    private void towOption() {
        Scanner scanner = new Scanner(System.in);
        String quMoney = scanner.nextLine();
        switch(quMoney){
            case "1":
            double a=100;
                System.out.println("请及时拿走现金100元");
                if(a<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-a)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "2":
                double b=200;
                System.out.println("请及时拿走现金200元");
                if(b<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-b)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "3":
                double c=300;
                System.out.println("请及时拿走现金300元");
                if(c<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-c)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "4":
                double d=500;
                System.out.println("请及时拿走现金500元");
                if(d<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-d)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "5":
                double e=800;
                System.out.println("请及时拿走现金800元");
                if(e<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-e)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "6":
                double f=1000;
                System.out.println("请及时拿走现金1000元");
                if(f<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-f)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
                case "7":
                double g=2000;
                System.out.println("请及时拿走现金2000元");
                if(g<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-g)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
                case "8":
                    System.out.println("其他");
                    Scanner qita = new Scanner(System.in);
                    double v = qita.nextDouble();
                    if(v<currentcustomer.getMoney()){
                    System.out.println("****************");
                    System.out.println("您的余额为"+(currentcustomer.getMoney()-v)+"元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
                    default:
                        System.out.println("请输入正确的序号");
                        break;
        }
    }

    //用户功能选择的封装
    private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");
                selectMoney();
                goOneHome();
                break;
            case "2":
                System.out.println("取款");
                TestUtil.towLeveOption();//取款页面
                towOption();//取款方法
                goOneHome();
                break;
            case "3":
                System.out.println("转账");
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                cunMoney();
                goOneHome();
                break;
            case "5":
                System.out.println("退出");
                break;
            default:
                System.out.println("您输入的功能有误");
                break;
        }
    }

    //余额查询
    private void selectMoney() {
        double money = currentcustomer.getMoney();
        System.out.println("你的余额是 " + money);

    }
    //存款
    private void cunMoney() {
        System.out.println("请输入存款金额");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        System.out.println("存款成功！余额为"+(currentcustomer.getMoney()+money));
    }

    //选择功能之后返回输入功能
    private void goOneHome() {
        TestUtil.oneLeveOption();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option= " + option);
        oneOption(option);
    }
}
