
package com.tw.cn.cap.gtb.todo;

import java.util.List;

public class App {

    private final com.tw.cn.cap.gtb.todo.listCommand listCommand = new listCommand();

    public static void main(String[] args) {
        new App().run().forEach( System.out::println);
    }

    public List<String> run() {
        return listCommand.run();
    }



}
