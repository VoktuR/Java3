import database.DBService;
import entity.User;
import logs.Logger;
import server.ChatServer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;

public class ServerApp {


    public static void main(String[] args) {
       // Connection connection = null;
       // DBService dbService = new DBService();



        new ChatServer();

    }

     /* start data for db
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("n1", "n1@mail.com", "1"));
        users.add(new User("n2", "n2@mail.com", "2"));
        users.add(new User("n3", "n3@mail.com", "3"));
        dbService.initializeDataBase(users);
         */

 //       new Logger().writeToFile("aye");
   //     new Logger().readFromFile();
}
