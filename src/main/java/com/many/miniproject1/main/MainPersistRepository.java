package com.many.miniproject1.main;

import com.many.miniproject1.offer.Offer;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MainPersistRepository {
    private final EntityManager em;
    @Transactional
    public Offer saveOffer(Offer offer) {
        // 보드 객체 만들기
//        Offer offer = new Offer(resumeId, postId, companyId, personId);
        // PC에 Data 주소 넣기(Entity만 가능함)
        em.persist(offer);
        // 실행후 영속 객체가 됨
        return offer;
    }
}
