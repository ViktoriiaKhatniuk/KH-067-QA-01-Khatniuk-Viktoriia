package Specialists;

public abstract class Specialist {
    private String name;
    private int age;
    private String itDepartment;
    private String scopeOfWork;
    private int salary;
    public Specialist(String name, int age, String itDepartment, String scopeOfWork, int salary) {
        this.name = name;
        this.age = age;
        this.itDepartment = itDepartment;
        this.scopeOfWork = scopeOfWork;
        this.salary = salary;
    }
    public void specialistInfo() {
        System.out.println(getName() + " works in " + getItDepartment() + " and " + "gets paid " + getSalary() +
                " dollars per month. " + getName() + " is");
        this.responsibility();
    }

    public abstract void responsibility();


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getItDepartment() {
        return itDepartment;
    }

    public String getScopeOfWork() {
        return scopeOfWork;
    }

    public int getSalary() {
        return salary;
    }
}