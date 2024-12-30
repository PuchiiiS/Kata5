package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.model.User;

public class Main {
    public static void main(String[] args) {
        UserLoader loader = new UserLoader(
                new RandomUserReader(),
                new RandomUserDeserializer(),
                new RandomUserAdapter()
        );
        
        for(int i = 0; i < 5;i++){
            User user = loader.get();
            System.out.println("Name: " + user.name());
            System.out.println("Gender: " + user.gender());
            System.out.println("Email: " + user.email());
            System.out.println("Phone: " + user.phone());
            System.out.println("Location: " + user.location());
            System.out.println();
        }
    }
}
