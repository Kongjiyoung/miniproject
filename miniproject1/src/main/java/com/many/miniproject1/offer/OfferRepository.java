package com.many.miniproject1.offer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OfferRepository {
    private final EntityManager em;

    public List<Offer> findAll() {
        Query query = em.createNativeQuery("SELECT * FROM offer_tb ORDER BY id ASC", Offer.class);

        return query.getResultList();
    }

    public Offer findById(int id) {
        Query query = em.createNativeQuery("SELECT * FROM offer_tb WHERE id=?", Offer.class);
        query.setParameter(1, id);

        Offer offer = (Offer) query.getSingleResult();

        return offer;
    }

//    public Offer findCompanynameById(int id) {
//        Query query = em.createNativeQuery("SELECT ut.company, post_id " +
//                "FROM offer_tb " +
//                "JOIN post_tb pt ON pt.company_id = ot.post_writer_id" +
//                        " JOIN user_tb ut ON ut.id = pt.company_id WHERE id = ?;", Offer.class);
//        query.setParameter(1, id);
//
//        Offer offer = (Offer) query.getSingleResult();
//
//        return offer;
//    }
//    public Offer List<Offer> fintAllSelect(int id) {
//        Query query = em.createNativeQuery("SELECT * FROM offer_tb WHERE id=?", Of);
//        query.setParameter(1, id);
//
//        Offer offer = (Offer) query.getSingleResult();
//
//        return offer;
//    }

    @Transactional
    public void save(OfferRequest.SaveDTO requestDTO, int id) {
        Query query = em.createNativeQuery("INSERT INTO offer_tb() VALUES ()");
        query.setParameter(1, id);

        query.executeUpdate();
    }

    @Transactional
    public void update(OfferRequest.UpdateDTO requestDTO, int id) {
        Query query = em.createNativeQuery("UPDATE offer_tb SET where id = ?");
        query.setParameter(1, id);

        query.executeUpdate();
    }

    @Transactional
    public void delete(int id) {
        Query query = em.createNativeQuery("DELETE FROM offer_tb WHERE id = ?");
        query.setParameter(1, id);

        query.executeUpdate();
    }
}
