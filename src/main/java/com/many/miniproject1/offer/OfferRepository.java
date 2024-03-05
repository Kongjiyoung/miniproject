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

        try {
            Offer offer = (Offer) query.getSingleResult();
            return offer;
        }catch (Exception e){
            return null;
        }
    }

    public Offer findCompanynameById(int id) {
        Query query = em.createNativeQuery("SELECT ot.id, ut.company_name, ot.title, ot.created_at " +
                "FROM offer_tb oft INNER JOIN user_tb ut ON oft.post_writer_id = ut.id " +
                "WHERE resume_writer_id = ?;", Offer.class);
        query.setParameter(1, id);

//        Object[] row = (Object[]) query.getSingleResult();

        Offer offer = (Offer) query.getSingleResult();
//        String company_name = (String)row[0];
//        String post_id = (String)row[1];
//
//        System.out.println("company_name : " + company_name);
//        System.out.println("post_id : " + post_id);
        return offer;
    }
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
