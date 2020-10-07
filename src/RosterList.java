import java.util.*;

public class RosterList {
    private ArrayList<Roster> rosterData;
    public RosterList()
    {
        rosterData = new ArrayList<Roster>();
    }
    public void addRoster()
    {
        Roster roster = new Roster(1,1,1,1508450400, 1508479200);
        Roster newRoster = new Roster(1,1,1,1602070599, 1602072563);
        Roster newRoster1 = new Roster(1,1,1,1508480400, 1508490200);
        Roster newRoster2 = new Roster(1,1,1,1601460400, 1601461200);
        rosterData.add(roster);
        rosterData.add(newRoster);
        rosterData.add(newRoster1);
        rosterData.add(newRoster2);
        for(Roster items : rosterData)
            System.out.println("Items before : " + items.toString());

        Collections.sort(rosterData, new TimeSort());
        int newStartTime = 1602076145;
        int newIdEmp = 1;
        int newEndTime = 1602076162;
        if(newEndTime > newStartTime)
            if(newIdEmp == rosterData.get(0).getId())
                if(newStartTime > rosterData.get(0).getEndTime()){
                    Roster newRoster3 = new Roster(1,newIdEmp,1,newStartTime, newEndTime);
                    rosterData.add(newRoster3);
                }
                else
                    System.out.println("New Start time is lesser than the old end time, so it will overlap");
            else
                System.out.println("Employee ID is different");
        else
            System.out.println("End time is lesser than start time");
    }

}
