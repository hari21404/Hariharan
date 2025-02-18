package CRUDoperations;

import java.sql.SQLException;
import java.util.Scanner;

public class Stringmenu {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        String  ch="1";
        while (!(ch.equals("Exit")))
        {
            menu();
            ch=in.nextLine();
            switch ((ch))
            {
                case "Display all":
                {
                    Jdbccontrol.selectRecords();
                    break;
                }
                case "Display id":
                {
                    System.out.println("Enter the person id");
                    int id=in.nextInt();
                    Jdbccontrol.selectRecordsWithPreparedStatement(id);
                    break;
                }
                case "Insert":
                {
                    System.out.println("Enter the new id");
                    int id=in.nextInt();
                    System.out.println("Enter the first name");
                    String firstname=in.next();
                    System.out.println("Enter the last name");
                    String lastname=in.next();
                    System.out.println("Enter the address");
                    String address=in.next();
                    System.out.println("Enter the city");
                    String city=in.next();

                    Jdbccontrol.insertRecordWithVariables(id,firstname,lastname,address,city);
                    break;
                }
                case "Delete":
                {
                    System.out.println("Enter the id");
                    int id=in.nextInt();
                    Jdbccontrol.deleteRecordWithVariables(id);
                    break;
                }
                case "update address":
                {
                    System.out.println("Enter the id");
                    int id=in.nextInt();
                    System.out.println("Enter the address");
                    String address=in.next();
                    Jdbccontrol.updateRecordWithPreparedStatement(id,address);
                    break;
                }
                case "Exit":
                {
                    System.out.println("Exit success");
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }

            }



        }
    }
    public static void menu()
    {
        System.out.println();
        System.out.println("-------Menu---------");
        System.out.println("1.Display all");
        System.out.println("2.Display id");
        System.out.println("3.Insert ");
        System.out.println("4.Delete ");
        System.out.println("5.update address ");
        System.out.println("Exit");
    }
}
