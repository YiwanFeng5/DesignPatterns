### 抽象工厂模式（Abstract Factory Pattern）

`这是围绕一个超级工厂创建其他工厂。
该工厂又称为其他工厂的工厂。
这种类型的设计模式属于创建型模式，它提供了一种创建对象的最近方式。`

## 介绍

**意图：** 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类

**主要解决：** 主要解决接口选择的问题

**如何使用：** 系统中产品有多于一个的产品族，而系统只消费其中某一族产品
 
**如何解决：** 在一个产品族里面定义多个产品

**关键代码：** 在一个工厂里聚合多个同类产品

**应用实例：** 
工作了，为了参加一些聚会，肯定有两套或者多套衣服吧，比如说有商务装（成套，一系列具体产品），时尚装（成套，一系列具体产品），甚至对于一个家庭来说，可能有上午男装、商务女装、时尚男装和时尚女装，这些也都是成套的，即一系列具体产品。
假设一种情况（现实中是不存在的，要不然没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），每次拿这种成套的衣服时自然也是要从这个衣柜中取出了。
用面向对象的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。

**优点：** 当一个产品族中的多个对象被设计成一起工作时，他能保证客户端始终只使用同一个产品族中的对象

**缺点：** 产品族扩展非常困难，要增加一个系列的莫伊产品，既要在抽象的Creator里添加代码，又要在具体的里面添加代码

**使用场景：**
1. QQ换皮肤，一整套一起换
2. 生成不同操作系统的程序

**注意事项：** 产品族难扩展，产品等级易扩展

## 实现

创建Shape和Color接口以及实现这些接口的实体类。

下一步是创建抽象工厂类AbstractFactory。

接着定义工厂类ShapeFactory和ColorFactory，这两个工厂类都是扩展了AbstractFactory。

然后创建一个工厂创造器/生成器FactoryProducer.

AbstractFactoryPatternDemo，测试使用FactoryProducer获取AbstractFactory对象。他将向AbstractFactory传递形状信息Shape（CIRCLE/RECTANGLE/SQUARE），以便获取它所需对象的类型。同时他还向AbstractFactory传递颜色信息Color(RED/GREEN/BLUE)，以便获取它所需对象的类型

    `AbstractFactoryPatternDemo(+main(): void)
    < --uses--
    FactoryProducer(+getFactory():AbstractFactory)
    < --uses--
    AbstractFactory(+getShape(): Shape, +getColor(): Color)
    < --extends--
    ShapeFactory(+getShape(): Shape)
        --creates-- >
        Shape(interface,+draw(): void)
        < --implements
        Circle,Rectangle,Square
    ,
    ColorFactory(+getColor(): Color)
        --creates-- >
        Color(interface,+fill(): void)
        < --implements
        Red,Green,Blue`

**步骤1：** 为形状创建一个接口Shape.java

**步骤2：** 创建实现接口Shape的各个实体类Rectangle.java, Circle.java, Square.java

**步骤3：** 为颜色创建一个接口 Color.java

**步骤4：** 创建实现接口Color的各个实体类Red.java, Green.java, Blue.java

**步骤5：** 为Color和Shape对象创建抽象来获取工厂AbstractFactory.java

**步骤6：** 创建扩展了AbstractFactory的工厂类，基于给定的信息生成实体类的对象ShapeFactory.java和ColorFactory

**步骤7：** 创建一个工厂创造器生成器类，通过传递形状或颜色信息来获取工厂

**步骤8：** 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。AbstractFactoryPatternDemo.java

**步骤9：** 验证结果

Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
Inside Red::fill() method.
Inside Green::fill() method.
Inside Blue::fill() method.
