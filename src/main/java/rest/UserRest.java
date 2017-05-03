package rest;

import com.google.gson.Gson;
import domain.User;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

/**
 * Created by Eivind on 03.05.2017.
 */
public class UserRest {

    private static Gson gson = new Gson();

    public static void main(String [] args) {
        path("/api", () -> {
            get("/user", (req, res) -> getUser());
            get("/users", (req, res) -> getUsers());
//                put("/change",     EmailApi.changeEmail);
//                delete("/remove",  EmailApi.deleteEmail);
            });
//            path("/username", () -> {
//                post("/add",       UserApi.addUsername);
//                put("/change",     UserApi.changeUsername);
//                delete("/remove",  UserApi.deleteUsername);
//            });
        };


    private static String getUser() {
        User user = new User();
        user.setEmail("eivind@gmail.com");
        user.setName("eivind");
        user.setPhonenbr("94516634");

        return gson.toJson(user);
    }

    private static String getUsers() {
        User user = new User();
        user.setEmail("eivind@gmail.com");
        user.setName("eivind");
        user.setPhonenbr("94516634");

        User user2 = new User();
        user2.setEmail("garb@gmail.com");
        user2.setName("garb");
        user2.setPhonenbr("643636363");

        User user3 = new User();
        user3.setEmail("andr@gmail.com");
        user3.setName("andr");
        user3.setPhonenbr("7342353");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        return gson.toJson(users);
    }
}
