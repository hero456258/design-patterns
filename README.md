# design-patterns
java设计模式：
    七大原则：
        (1) 单一职责原则
                基本介绍：
                      对类来说的，即一个类应该只负责一项职责。 如类A负责两个不同职责：职责1，职责2。 当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2.
        (2) 接口隔离原则
                基本介绍：
                      客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
        (3) 依赖倒转(倒置)原则
                基本介绍：
                      1）高层模块不应该依赖底层模块，二者都应该依赖其抽象
                      2）抽象不应该依赖细节，细节应该依赖抽象
                      3）依赖倒转(倒置)的中心思想是面向接口编程
                      4）依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类
                      5）使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成
        
        (4) 里氏替换原则
                基本介绍：
                     1) 里式替换原则(Liskov Substitution Principle) 在1988年，由麻省理工学院的一位姓里氏的女士提出的。
                     2) 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成 o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。
                        换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
                     3) 在使用继承时，遵循里式替换原则，在子类中尽量不要重新父类的方法
                     4) 里式替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖 来解决问题。
       
        (5) 开闭原则
               基本介绍：
                      1) 开闭原则(Open Closed Principle) 是编程中最基础、最重要 的设计原则
         
                      2) 一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用方)。用抽象构建框架，用实现扩展细节。
         
                      3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
         
                      4) 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则  。
        
        (6) 迪米特法则
                基本介绍：
                     1) 一个对象应该对其他对象保持最少的了解
                     2) 类与类关系越密切，耦合度越大
                     3) 迪米特法则(Demeter Principle) 又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。
                         对外除了提供public方法，不对外泄露任何信息
                     4) 迪米特法则还有个更简单的定义：只与直接的朋友通信
                     5) 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多：依赖，关联，组合，聚合等。
                         其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生类最好不要以局部变量的形式出现
                         在类的内部。

        
        (7) 合成复用原则

    UML类图：
                    基本介绍：
                        1) UML——Unified modeling language UML (统一建模语言)，是一种用于软件系统分析和设计的语言工具，它用于帮助软件开发人员进行思考和记录思路的结果
                        2) UML 本身是一套符号的规定，就像数学符号和化学符号一样，这些符号用于描述软件模型中的各个元素和他们之间的关系，比如类、接口、实现、泛化、依赖、组合、聚合等，如下图:
                
                    UML类图:
                         1) 用于描述系统中的类(对象)本身的组成和类(对象)之间的各种静态关系。
                         2) 类之间的关系：依赖、泛化(继承)、实现、关联、聚合与组合。
                         
    设计模式概述：
        4.1 掌握设计模式的层次

             1) 第一层：刚开始学编程不久，听说过什么是设计模式
             2) 第二层：有很长时间的编程经验，自己写了很多代码，其中用到了设计模式，但是自己不知道
             3) 第三层：学习过了设计模式，发现自己已经在使用了，并且发现了一些新的模式挺好用的
             4) 第四层：阅读了很多别人写的源码和框架，在其中看到别人设计模式，并且能够领会设计模式的精妙和带来的好处
             5) 第五层：代码写着写着，自己都没有意识到使用了设计模式，并且熟练的写了出来
             
        4.2 设计模式介绍
             1) 设计模式是程序员在面对同类软件工程设计问题所总结出来的有用的经验，模式不是代码，而是某类问题的通用解决方案，设计模式(Design Pattern)代表了最佳的实践。
                这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。
             2) 设计模式的本质提高 软件的维护性，通用性和扩展性，并降低软件的复杂度。
             3) 《设计模式》是经典的书，作者是 Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides Design (俗称"GOF四人组")
             4) 设计模式并不局限于某种语言，Java，php，C++ 都有设计模式
             
        4.3 设计模式类型
                设计模式分为三种类型，共23种
                  1) 创建型模式：单例模式、抽象工厂模式、原型模式、建造者模式、工厂模式。
                  2) 结构型模式：适配器模式，桥接模式、装饰模式、组合模式、享元模式、代理模式。
                  3) 行为型模式：模板方法模式、命令模式、访问者模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式(Interpreter模式)、状态模式、
                      策略模式、职责链模式(责任链模式)。
             注意：不同的书籍上对分类和名称略有差别
             
     单例设计模式：
                单例模式有八种方式：
                             1) 饿汉式(静态常量)
                             2) 饿汉式(静态代码块)
                             3) 懒汉式(线程不安全)
                             4) 懒汉式(线程安全，同步方法)
                             5) 懒汉式(线程安全，同步代码块)
                             6) 双重检查
                             7) 静态内部类
                             8) 枚举
                单例模式注意事项和细节说明
                             1) 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统的性能
                             2) 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方式，而不是使用new
                             3) 单例模式使用的场景：需要频繁的进行创建和销毁对象、创建对象时耗时过多或耗费资源过多(即：重量级对象) ，但又经常用到的对象、
                                工具类对象、频繁访问数据库或文件的对象(比如数据源、session工厂等)

     简单工厂模式：
             基本介绍：
                1) 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
                   简单工厂模式是工厂模式家族中最简单实用的模式。
                2) 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为(代码)  
                3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂设计模式。
                
                
     工厂方法模式：
             基本介绍：
                1) 工厂方法模式设计方案：将披萨项目的实例化功能抽象成抽象方法，在不同的口味点餐子类中具体实现。
                2) 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。