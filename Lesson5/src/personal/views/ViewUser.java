package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private final UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("\nВведите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        listUsers();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();
                        break;
                    case HELP:
                        help();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void help() {
        System.out.println("""
                Используемые команды:\s
                CREATE - создать запись
                READ - прочитать запись
                LIST - вывести весь список
                UPDATE - обновить запись
                DELETE - удалить запись
                EXIT - выход
                HELP - помощь
                """);
    }

    private void createUser() throws Exception {
        userController.saveUser(inputUser());
    }

    private void readUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        System.out.println(user);
    }

    private void listUsers() {
        List<User> listUsers = userController.readAllUsers();
        for (User user : listUsers) {
            System.out.println(user);
        }
    }

    private void updateUser() throws Exception {
        String readId = prompt("Введите редактируемый ID юзера: ");
        userController.updateUser(readId,inputUser());
    }

    private void deleteUser() throws Exception{
        String readId = prompt("Введите удаляемый ID юзера: ");
        userController.deleteUser(readId);
    }

    private User inputUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
