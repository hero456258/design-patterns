package com.mingqian.proxy.staticproxy;

/**
 * Created by mingqian on 2019/8/6.
 * 代理对象，静态代理
 */
public class TeacherDaoProxy implements ITeacherDao{

    /**目标对象，通过接口方式聚合进来*/
    private ITeacherDao iteacherDao;

    public TeacherDaoProxy(ITeacherDao iteacherDao) {
        this.iteacherDao = iteacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始静态代理......");
        iteacherDao.teach();
        System.out.println("代理完毕..........");
    }
}
