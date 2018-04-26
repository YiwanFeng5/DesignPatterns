package cn.fywspring.filterparttern;

import java.util.List;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-24 17:48
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
