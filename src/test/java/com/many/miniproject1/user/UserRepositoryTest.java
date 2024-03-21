package com.many.miniproject1.user;

import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(UserRepository.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private EntityManager em;

    @Test
    public void personFindByEmail_test(){
        // given
        String email = "captain_kong@nate.com";
        String password = "1234";

        // when
        User user = userRepository.personFindByEmailAndPassword(email, password);

        System.out.println("personFindByEmail_test: "+user);
        // then
        Assertions.assertThat(user.getEmail()).isEqualTo("captain_kong@nate.com");
    }
}
