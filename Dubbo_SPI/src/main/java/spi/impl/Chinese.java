package spi.impl;


import spi.Person;

/**
 * Created by myijoes on 2019/8/2.
 *
 * @author wanqiao
 */
public class Chinese implements Person {
    @Override
    public void whoareyou() {
        System.out.println("i am chinese");
    }
}
