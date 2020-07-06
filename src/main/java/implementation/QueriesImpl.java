package implementation;

import entities.Person;
import interfaces.SqlQueries;

public class QueriesImpl implements SqlQueries {
    @Override
    public String selectAll() {
        return "SELECT * FROM new_table";
    }

    @Override
    public String selectCondition(int id) {
        return "SELECT * FROM new_table WHERE id = id";
    }

    @Override
    public String insert(Person person) {
        return "INSERT INTO new_table (name, age) VALUES (person.getName(), person.getAge())";
    }

    @Override
    public String update(Person person, int id) {
        return "UPDATE new_table SET name = person.setName('ANNY'), age = person.setAge(23) WHERE `id` = id";
    }

    @Override
    public String delete(int id) {
        return "DELETE FROM new_table WHERE `id` = id";
    }
}
