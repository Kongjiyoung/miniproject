package com.many.miniproject1.offer;

import com.many.miniproject1.post.PostResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
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


    public OfferResponse.OfferBoardDTO findCompanynameById(int oid) {
        Query query = em.createNativeQuery("SELECT ot.id, ut.company_name, ot.post_id, pt.title, ot.created_at FROM offer_tb ot INNER JOIN user_tb ut ON ot.company_id = ut.id INNER JOIN post_tb pt ON ot.post_id = pt.id WHERE person_id= ?", Offer.class);
        query.setParameter(1, oid);

        Object[] row = (Object[]) query.getSingleResult();

        Integer id = (Integer) row[0];
        String companyName = (String) row[1];
        Integer postId = (Integer) row[2];
        String title = (String) row[3];
        Timestamp createdAt = (Timestamp) row[4];

        OfferResponse.OfferBoardDTO responseDTO = new OfferResponse.OfferBoardDTO();

        responseDTO.setId(id);
        responseDTO.setCompanyName(companyName);
        responseDTO.setPostId(postId);
        responseDTO.setTitle(title);
        responseDTO.setCreatedAt(createdAt);

        return responseDTO;
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
