package com.alby.dp.command.example6;


/**
 * Created by xianwei on 2015/12/6.
 * 热菜师傅
 */
public class HotCook implements CookApi,Runnable {
    private String name;

    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void cook(int tableName,String name) {

        int cookTime = (int) (20 * Math.random());
        System.out.println(this.name+"热菜师傅正在做："+tableName+" 号桌的："+name);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"热菜师傅做好了："+tableName+" 号桌的："+name+",共计消耗："+cookTime);
    }

    public void run(){
        while (true){
            Command cmd = CommandQueue.getOneCommand();
            if (cmd!=null){
                cmd.setCookApi(this);
                cmd.execute();
            }

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
