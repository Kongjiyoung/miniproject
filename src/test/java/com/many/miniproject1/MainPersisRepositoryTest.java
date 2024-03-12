package com.many.miniproject1;

import com.many.miniproject1.main.MainPersistRepository;
import com.many.miniproject1.offer.Offer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(MainPersistRepository.class)
@DataJpaTest
public class MainPersisRepositoryTest {
    @Autowired
    private MainPersistRepository mainPersistRepository;

    @Test
    public void save_offer_test(){
        //given
        Offer offer = new Offer(1, 1,14,1);
        //when
        mainPersistRepository.saveOffer(offer);
        //then
        System.out.println("offer = " + offer);
    }
}
