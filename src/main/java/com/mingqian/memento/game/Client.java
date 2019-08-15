package com.mingqian.memento.game;

/**
 * Created by mingqian on 2019/8/15.
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("和boss大战当前状态:->{}");
        gameRole.display();

        //创建守护者对象
        Caretaker caretaker = new Caretaker();
        //保存游戏角色当前的状态
        caretaker.add(gameRole.saveMemento());

        System.out.println("开始和boss大战");
        gameRole.setVit(80);
        gameRole.setDef(50);
        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到站前");
        gameRole.recoverGameRoleFromMemento(caretaker.get(0));
        System.out.println("恢复后的状态");
        gameRole.display();

        /**
         * 运行结果:
         *      和boss大战当前状态:->{}
         *      游戏角色当前的攻击力:100->{}防御力:100
         *      开始和boss大战
         *      游戏角色当前的攻击力:80->{}防御力:50
         *      大战后，使用备忘录对象恢复到站前
         *      恢复后的状态
         *      游戏角色当前的攻击力:100->{}防御力:100
         */
    }
}
