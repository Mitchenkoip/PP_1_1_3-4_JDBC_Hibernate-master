package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Igor","Mitchenko", (byte) 27);
        System.out.println("User с именем - Igor добавлен в базу данных");

        userService.saveUser("Liza", "Skokova", (byte) 24);
        System.out.println("User с именем - Liza добавлен в базу данных");

        userService.saveUser("Alisa", "Mitchenko", (byte) 1);
        System.out.println("User с именем - Alisa добавлен в базу данных");

        userService.saveUser("Pavel", "Shdan", (byte) 50);
        System.out.println("User с именем - Pavel добавлен в базу данных");

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
