import java.util.*;
import java.lang.*;

public class Roster {
    private int id;
    private int employee;
    private int department;
    private int startTime;
    private int endTime;


    public Roster(int newId, int newEmployee, int newDepartment, int newStart, int newEnd){
        this.id = newId;
        this.employee = newEmployee;
        this.department = newDepartment;
        this.startTime = newStart;
        this.endTime = newEnd;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getDepartment() {
        return department;
    }

    public int getEmployee() {
        return employee;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Roster{" +
                "id=" + id +
                ", employee=" + employee +
                ", department=" + department +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
