package com.fmp.client;

import java.util.Scanner;

import com.fmp.factory.ManPersonFactory;
import com.fmp.factory.RobotPersonFactory;
import com.fmp.factory.WomanPersonFactory;
import com.fmp.factory.nvwaFactory;
import com.fmp.product.Person;


public class client {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        nvwaFactory nvwa;
        Person person;
        while(true){
            //三个参数 W、M、R
            System.out.println("请输入要造的人类型的参数：");
            String s = scan.nextLine();
            if("W".equals(s)){
                nvwa = new WomanPersonFactory();
                person = nvwa.createPerson();
                person.makePeople();
            }
            else if("M".equals(s)){
                nvwa = new ManPersonFactory();
                person = nvwa.createPerson();
                person.makePeople();
            }
            else if("R".equals(s)){
                nvwa = new RobotPersonFactory();
                person = nvwa.createPerson();
                person.makePeople();
            }
            else{
                break;
            }
        }
    }
}
