package entities;

public class impo {

    public String name;
    public double salary;
    public double impost;

    public double netSalary() {
        return salary - impost;
    }

    public void increaseSalary(double percertage) {
        salary += salary * percertage / 100.0;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f%", netSalary());
    }

}
