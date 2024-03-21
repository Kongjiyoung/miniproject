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

    @Test
    public void companyUpdate_test(){
        // given
        int id =14;
        String profileFilename = "12121212";
        String companyName = "네이버";
        String address = "부산 우리집";
        String password = "123123";
        String username = "인사담당자";
        String tel = "01012345678";

        // when
        User user = userRepository.companyUpdate(id, profileFilename, companyName, address, password, username, tel);

        // then
        Assertions.assertThat(userRepository.findById(id).getCompanyName()).isEqualTo("sk");
    }
}
