import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Create a program which will take input from users for registration and save the info to a json file. The system will require following user info:
//Full Name, email, password, address, mobile no.
public class JSON_USER_INFO {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        JSONObject jsonObject = new JSONObject();

        System.out.print("Enter Full Name: ");
        jsonObject.put("Full Name", input.nextLine());

        System.out.print("Enter Email: ");
        jsonObject.put("Email", input.nextLine());

        System.out.print("Enter Password: ");
        jsonObject.put("Password", input.nextLine());

        System.out.print("Enter Address: ");
        jsonObject.put("Address", input.nextLine());

        System.out.print("Enter Mobile No: ");
        jsonObject.put("Mobile No", input.nextLine());
        System.out.println(jsonObject);

        FileWriter file = new FileWriter("./src/main/resources/Json_User_Registration_Info.json");
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();

    }
}
