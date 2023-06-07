package co.edu.sena.proyect_novoa.model.repository;

import co.edu.sena.proyect_novoa.model.User;


import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        co.edu.sena.proyect_novoa.model.repository.Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert1 = new User();
        userInsert1.setUser_firstname("Zulma");
        userInsert1.setUser_lastname("Ballesteros");
        userInsert1.setUser_email("zulmab23@gmail.com");
        userInsert1.setUser_password("Zulma123");
        repository.saveObj(userInsert1);

        User userInsert2 = new User();
        userInsert2.setUser_firstname("Vanne");
        userInsert2.setUser_lastname("Hernandez");
        userInsert2.setUser_email("vanne@gmail.com");
        userInsert2.setUser_password("vannesa23");
        repository.saveObj(userInsert2);


        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_firstname("Felipe");
        userUpdate.setUser_lastname("Forero");
        userUpdate.setUser_email("felipeforero@gmail.com");
        userUpdate.setUser_password("forerofeli74");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

