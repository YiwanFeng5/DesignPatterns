package cn.fywspring.builderparttern;

/**
 * 步骤六
 * 创建一个MealBuilder类，实际的builder类负责创建Meal对象
 * @author Yiwan Feng
 * @date 2017/12/11 16:10
 */
public class MealBuilder {

    public Meal prepareVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal () {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
