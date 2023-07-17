package client;

import db.DB;
/*
 * 启动类
 */
public class ShoppingClient {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        new DB();
        Menu.menu().showLoginMenu();
    }
}
