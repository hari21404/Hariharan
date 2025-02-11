package Task4;


import java.io.IOException;
import java.util.Scanner;

public class Filehandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        try
        {
            System.out.println("Set file path");
            String path = in.nextLine() + '/';
            while (ch != 7)
            {
                System.out.println("----------------------");
                System.out.println("Current path:" + path);
                System.out.println("----------------------");
                dispmenu();
                ch = in.nextInt();
                in.nextLine();
                switch (ch)
                {
                    case 1:
                    {

                        String path1 =FileCreate.createfolder(path);
                        for(int i=0;i<3;i++)
                        {
                            FileCreate.createfile(path1);

                        }
                        break;
                    }
                    case 2:
                    {
                        String path1 =FileCreate.createfolder(path);
                        for(int i=0;i<4;i++)
                        {
                            FileCreate.createfile(path1);

                        }
                        break;

                    }
                    case 3:
                    {
                        for(int i=0;i<3;i++)
                        {
                            FileCreate.createfile(path);

                        }
                        break;

                    }
                    case 4:
                    {
                        System.out.println("Set file path");
                        path=in.nextLine();
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid choice");
                    }

                }
            }
        }
        catch(IOException e){
                e.printStackTrace();
            }
        finally{
                in.close();
            }
        }

    public static void dispmenu() {
        System.out.println("-------------------");
        System.out.println("       Menu        ");
        System.out.println();
        System.out.println("1. Create folder with three file");
        System.out.println("2. Create folder with four file");
        System.out.println("3. Create three files");
        System.out.println("4. Read file");
    }
}
