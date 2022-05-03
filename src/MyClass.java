import java.util.Scanner;

public class MyClass
{
    Scanner scanner=new Scanner(System.in);
    Beach[] beaches=new Beach[4];

    static int findBeachWithLowestRating(Beach[] beaches)
    {
        return 0;
    }

    public static void main(String[] args)
    {
        MyClass myClass=new MyClass();
        for(int i=0;i<4;i++)
        {
            int beachId=myClass.scanner.nextInt();
            String beachName=myClass.scanner.next();
            String location=myClass.scanner.next();
            String beachType=myClass.scanner.next();
            int rating=myClass.scanner.nextInt();
            int avgVisitorsPerDay=myClass.scanner.nextInt();
            myClass.beaches[i]=new Beach(beachId,beachName,location,beachType,rating,avgVisitorsPerDay);
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(myClass.beaches[i].getRating());
        }
    }
}