import java.util.Scanner;

public class MyClass
{
    static int findBeachWithLowestRating(Beach[] beaches,String location,int visitors)
    {

        int min=beaches[0].getRating();
        for(int i=0;i<4;i++)
        {
            if(beaches[i].getLocation().equals(location) && beaches[i].getAvgVisitorsPerDay()>visitors)
            {
                if(beaches[i].getRating()<min)
                {
                    min=beaches[i].getRating();
                }
            }
            else
                return 0;

        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Beach[] beaches=new Beach[4];
        Beach beache=new Beach();

        for(int i=0;i<4;i++)
        {
            int beachId=scanner.nextInt();
            beache.setBeachId(beachId);

            String beachName=scanner.next();
            beache.setBeachName(beachName);

            String location=scanner.nextLine();
            scanner.nextLine();
            beache.setLocation(location);

            String beachType=scanner.next();
            beache.setBeachType(beachType);

            int rating=scanner.nextInt();
            beache.setRating(rating);

            int avgVisitorsPerDay=scanner.nextInt();
            beache.setAvgVisitorsPerDay(avgVisitorsPerDay);

            beaches[i]=beache;

            //beaches[i]=new Beach(beachId,beachName,location,beachType,rating,avgVisitorsPerDay);
        }

        String location=scanner.nextLine();
        scanner.nextLine();
        int visitors=scanner.nextInt();
        int res=MyClass.findBeachWithLowestRating(beaches,location,visitors);
        if(res>0)
            System.out.println(res);
        else
            System.out.println("No Such Beach");
    }
}