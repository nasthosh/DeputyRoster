import java.util.*;

public class RosterList {
    private ArrayList<Roster> rosterData;
    public RosterList()
    {
        rosterData = new ArrayList<Roster>();
    }
    public void addRoster()
    {
        Roster rosterFirstEntry = new Roster(1,1,1,1508450400, 1508479200);
        Roster rosterSecondEntry = new Roster(1,1,1,1602070599, 1602072563);
        Roster rosterThirdEntry = new Roster(1,1,1,1508480400, 1508490200);
        Roster rosterFourthEntry = new Roster(1,1,1,1601460400, 1601461200);
        rosterData.add(rosterFirstEntry);
        rosterData.add(rosterSecondEntry);
        rosterData.add(rosterThirdEntry);
        rosterData.add(rosterFourthEntry);
        for(Roster items : rosterData)
            System.out.println("Items before : " + items.toString());

        Collections.sort(rosterData, new TimeSort()); // Sort based on timestamp for the particular employee in descending order
        int newStartTime = 1602076145;
        int newIdEmp = 1;
        int newEndTime = 1602076162;
        if(newEndTime > newStartTime)
            if(newIdEmp == rosterData.get(0).getId())
                if(newStartTime > rosterData.get(0).getEndTime()){
                    Roster newRosterEntry = new Roster(1,newIdEmp,1,newStartTime, newEndTime);
                    rosterData.add(newRosterEntry); // Validations passed and added to the list
                }
                else
                    System.out.println("New Start time is lesser than the old end time, so it will overlap");
            else
                System.out.println("Employee ID is different");
        else
            System.out.println("End time is lesser than start time");
    }

}
