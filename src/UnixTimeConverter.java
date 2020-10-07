import java.util.Date;

public class UnixTimeConverter {
    public Date convertUnixTime(int unixTimeStamp){
        java.util.Date convertedTime=new java.util.Date((long)unixTimeStamp*1000);
        return convertedTime;
    }
}
