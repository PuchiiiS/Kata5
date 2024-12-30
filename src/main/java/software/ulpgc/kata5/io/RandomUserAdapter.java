package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.model.User;
import software.ulpgc.kata5.io.pojos.RandomUserGetResponse;

public class RandomUserAdapter implements UserAdapter{
    @Override
    public User adapt(Object object){
        return adapt(((RandomUserGetResponse) object).results().get(0));
    }

    private User adapt(RandomUserGetResponse.User user) {
        return new User(
                userNameOf(user),
                user.gender(),
                user.email(),
                user.phone(),
                user.location().city() + ", " + user.location().country()
        );
    }

    private String userNameOf(RandomUserGetResponse.User user) {
        return user.name().title() + " " + user.name().first() + " " + user.name().last();
    }

}
