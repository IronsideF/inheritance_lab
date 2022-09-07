package staff;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee {

    protected String name;
    protected String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void raiseSalary(double increase){
            this.salary += increase < 0 ? 0 : increase;
    }
    public double payBonus(){
        return this.salary/100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null) {
            Pattern namePattern = Pattern.compile("^[A-Z][a-zA-Z]\\w+");
            Matcher nameMatcher = namePattern.matcher(name);
            this.name = nameMatcher.matches() ? name : this.name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

}
