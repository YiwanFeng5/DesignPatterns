package cn.fywspring.filterparttern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-25 11:59
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> malePersons = new ArrayList<Person>();
        for (Person person:
             persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
