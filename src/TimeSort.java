import java.util.Comparator;

public class TimeSort implements Comparator<Roster> {
    @Override
    public int compare(Roster o1, Roster o2) {
        return String.valueOf(o2.getEndTime()).compareTo(String.valueOf(o1.getEndTime()));
    }
}
