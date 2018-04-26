package cn.fywspring.filterparttern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-25 12:46
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> singlePersons = new ArrayList<>();
        for (Person person:
             persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
