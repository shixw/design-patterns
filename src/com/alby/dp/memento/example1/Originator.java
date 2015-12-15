package com.alby.dp.memento.example1;

/**
 * Created by xianwei on 2015/12/15.
 * 原发器对象
 */
public class Originator {
    //表示原发器状态
    private String state = "";

    //创建保存原发器对象的状态的备忘录对象
    public Memento createMemento(){
        return new MementoImpl(state);
    }

    //重新设置原发器对象的状态，让其回到备忘录对象记录的章台
    public void setMemento(Memento memento){
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }

    //真正的备忘录对象，实现备忘录接口
    //实现成私有的内部类，不允许外部访问
    private static class MementoImpl implements Memento{
        private String state = "";

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

}
