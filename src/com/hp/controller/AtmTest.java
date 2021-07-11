package com.hp.controller;

import com.hp.service.CustomerService;
import com.hp.util.TestUtil;

import java.util.Scanner;

public class AtmTest {

    private static String cardid;
    private static String cardPwd;
    private static CustomerService customerService;
    public static void main(String[] args) {
        customerService = new CustomerService();
        //测试客户类的数据
     //   CustomerData customerData = CustomerData.getInstance();
     //   List<Customer> customerList = customerData.getCustomerList();
        /*for (Customer customer : customerList) {
            System.out.println("customer = " + customer);
        }*/
        //欢迎界面
        TestUtil.welcome();

        int i = 0;
        while(i<6){//当输入超过5次就跳出循环
            //输入用户名、密码
            doWritePassword();
            //其他操作：1.校验角色  2.判断客户账号密码是否正确
            docheckpassword(cardid,cardPwd);
            i++;
         }
    }
    //校验角色和密码
    private static void docheckpassword(String cardid,String cardPwd) {
    //先校验角色，用密码长度判断
        if (cardid.length()==8){
            //校验密码是否正确
            customerService.checkPwd(cardid,cardPwd);
        }
    }

    //输入用户名密码类
    private static void doWritePassword() {
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码");
        cardPwd = scanner.nextLine();
        System.out.println("cardPwd = " + cardPwd);
    }


}
