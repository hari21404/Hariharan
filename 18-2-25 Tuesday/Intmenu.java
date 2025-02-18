package CRUDoperations;

import Task3.Scanneruse;

import java.sql.SQLException;
import java.util.Scanner;

public class Intmenu {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        int ch=0;
        while (ch != 6)
        {
            menu();
            ch=in.nextInt();
            switch ((ch))
            {
                case 1:
                {
                    Jdbccontrol.selectRecords();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the person id");
                    int id=in.nextInt();
                    Jdbccontrol.selectRecordsWithPreparedStatement(id);
                    break;
                }
                case 3:
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
                case 4:
                {
                    System.out.println("Enter the id");
                    int id=in.nextInt();
                    Jdbccontrol.deleteRecordWithVariables(id);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the id");
                    int id=in.nextInt();
                    System.out.println("Enter the address");
                    String address=in.next();
                    Jdbccontrol.updateRecordWithPreparedStatement(id,address);
                    break;
                }
                case 6:
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
        System.out.println("1.Display all  records table ");
        System.out.println("2.Display Specific records by id");
        System.out.println("3.Insert a row");
        System.out.println("4.Delete record with id");
        System.out.println("5.update address with id");
        System.out.println("Exit");
    }
}
