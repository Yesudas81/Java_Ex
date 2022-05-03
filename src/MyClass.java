import java.util.Scanner;

public class MyClass
{
    static int findBeachWithLowestRating(Beach[] beaches)
    {
        int min=beaches[0].getRating();
        for(int i=1;i<4;i++)
        {
            if(beaches[i].getRating()<min)
            {
                min=beaches[i].getRating();
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        int beachId=0;
        String beachName=null;
        String location=null;
        String beachType=null;
        int rating=0;
        int avgVisitorsPerDay=0;

        Beach beache=new Beach(beachId,beachName,location,beachType,rating,avgVisitorsPerDay);

        Scanner scanner=new Scanner(System.in);
        Beach[] beaches=new Beach[4];

        for(int i=0;i<4;i++)
        {
            beachId=scanner.nextInt();
            beaches[i]=beache;
            beache.setBeachId(beachId);

            beachName=scanner.next();
            beaches[i]=beache;
            beache.setBeachName(beachName);

            location=scanner.next();
            beaches[i]=beache;
            beache.setLocation(location);

            beachType=scanner.next();
            beaches[i]=beache;
            beache.setBeachType(beachType);

            rating=scanner.nextInt();
            beaches[i]=beache;
            beache.setRating(rating);

            avgVisitorsPerDay=scanner.nextInt();
            beaches[i]=beache;
            beache.setAvgVisitorsPerDay(avgVisitorsPerDay);

            beaches[i]=new Beach(beachId,beachName,location,beachType,rating,avgVisitorsPerDay);
        }
        int res=MyClass.findBeachWithLowestRating(beaches);
        System.out.println(res);
    }
}