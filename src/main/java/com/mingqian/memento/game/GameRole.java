package com.mingqian.memento.game;

/**
 * Created by mingqian on 2019/8/15.
 */
public class GameRole {

    /**
     * 攻击力
     */
    private int vit;

    /**
     * 防御力
     */
    private int def;

    /**
     * 创建Memento ,即根据当前的状态保存Memento
     * @return
     */
    public Memento saveMemento(){
        return new Memento(this.vit,this.def);
    }

    /**
     * 从备忘录中恢复状态
     * @param memento
     */
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    /**
     * 显示当前游戏角色的状态
     */
    public void display(){
        System.out.println("游戏角色当前的攻击力:" + this.vit + "->{}" + "防御力:" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
