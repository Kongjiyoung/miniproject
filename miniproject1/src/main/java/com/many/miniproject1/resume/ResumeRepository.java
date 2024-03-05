package com.many.miniproject1.resume;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ResumeRepository {
    private final EntityManager em;

    public List<Resume> findAll() {
        Query query = em.createNativeQuery("select * from resume_tb", Resume.class);

        return query.getResultList();
    }

    public ResumeResponse.DetailDTO findById(int id) {
        Query query = em.createNativeQuery("select * from resume_tb where id=?", Resume.class);
        query.setParameter(1, id);

        Resume resume = (Resume) query.getSingleResult();

        List<String> skill = new ArrayList<>();
        ResumeResponse.DetailDTO responseDTO = new ResumeResponse.DetailDTO(resume,skill);

        return responseDTO;
    }

    @Transactional
    public void save(ResumeRequest.SaveDTO requestDTO, int id) {
        Query query = em.createNativeQuery("insert into resume_tb(id, person_id, title, profile, username, birth, tel, address, email, portfolio, introduce, career, simpleIntroduce, skill) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now())");
        query.setParameter(1, id);
        query.setParameter(2, requestDTO.getPersonId());
        query.setParameter(3, requestDTO.getTitle());
        query.setParameter(4, requestDTO.getProfile());
        query.setParameter(5, requestDTO.getUsername());
        query.setParameter(6, requestDTO.getBirth());
        query.setParameter(7, requestDTO.getTel());
        query.setParameter(8, requestDTO.getAddress());
        query.setParameter(9, requestDTO.getEmail());
        query.setParameter(10, requestDTO.getPortfolio());
        query.setParameter(11, requestDTO.getIntroduce());
        query.setParameter(12, requestDTO.getCareer());
        query.setParameter(13, requestDTO.getSimpleIntroduce());
        query.setParameter(14, requestDTO.getSkill());

        query.executeUpdate();
    }

    @Transactional
    public void update(ResumeRequest.UpdateDTO requestDTO, int id) {
        Query query = em.createNativeQuery("update resume_tb set where id = ?");
        query.setParameter(1, id);

        query.executeUpdate();
    }

    @Transactional
    public void delete(int id) {
        Query query = em.createNativeQuery("delete from resume_tb where id = ?");
        query.setParameter(1, id);

        query.executeUpdate();
    }
}