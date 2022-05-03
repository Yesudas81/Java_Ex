public class Beach
{
    private int beachId;

    private String beachName;

    private String location;

    private String beachType;

    private int rating;

    private int avgVisitorsPerDay;

    public Beach(int beachId, String beachName, String location, String beachType, int rating, int avgVisitorsPerDay)
    {
        this.beachId = beachId;
        this.beachName = beachName;
        this.location = location;
        this.beachType = beachType;
        this.rating = rating;
        this.avgVisitorsPerDay = avgVisitorsPerDay;
    }

    public int getBeachId()
    {
        return beachId;
    }

    public void setBeachId(int beachId)
    {
        this.beachId = beachId;
    }

    public String getBeachName()
    {
        return beachName;
    }

    public void setBeachName(String beachName)
    {
        this.beachName = beachName;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getBeachType()
    {
        return beachType;
    }

    public void setBeachType(String beachType)
    {
        this.beachType = beachType;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public int getAvgVisitorsPerDay()
    {
        return avgVisitorsPerDay;
    }

    public void setAvgVisitorsPerDay(int avgVisitorsPerDay)
    {
        this.avgVisitorsPerDay = avgVisitorsPerDay;
    }
}
