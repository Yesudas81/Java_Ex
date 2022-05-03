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
        Scanner scanner=new Scanner(System.in);
        Beach[] beaches=new Beach[4];

        for(int i=0;i<4;i++)
        {
            beaches[i]=new Beach(scanner.nextInt(),scanner.next(),scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextInt());
        }

        int res=MyClass.findBeachWithLowestRating(beaches);
        System.out.println(res);
    }
}