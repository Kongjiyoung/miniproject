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
    public void findById_test(){
        // given
        int id=14;

        // when
        User user = userRepository.findById(id);

        // then
        Assertions.assertThat(user.getCompanyName()).isEqualTo("예이");
    }
}
