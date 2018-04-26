package cn.fywspring.filterparttern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-25 12:42
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> femalePersons = new ArrayList<>();
        for (Person person:
             persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
