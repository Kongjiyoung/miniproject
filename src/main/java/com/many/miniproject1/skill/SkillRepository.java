package com.many.miniproject1.skill;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SkillRepository {
    private final EntityManager em;


    public List<Skill> findAll() {
        Query query = em.createNativeQuery("select * from skill_tb", Skill.class);

        return query.getResultList();
    }

    public Skill findById(int id) {
        Query query = em.createNativeQuery("select * from skill_tb where id=?");
        query.setParameter(1, id);

        Skill skill = (Skill) query.getSingleResult();

        return skill;
    }

    public List<String> findByResumeId(int id) {

        Query query = em.createNativeQuery("select skill from skill_tb where resume_id=?");
        query.setParameter(1, id);

        List<String> rows = query.getResultList();
        List<String> skills = new ArrayList<>();

        for (String row : rows) {
            skills.add(row);
        }

        return skills;
    }

    public List<String> findByPostId(int id) {

        Query query = em.createNativeQuery("select skill from skill_tb where post_id=?");
        query.setParameter(1, id);

        List<String> rows = query.getResultList();
        List<String> skills = new ArrayList<>();

        for (String row : rows) {
            skills.add(row);
        }

        return skills;
    }


    @Transactional
    public void saveSkillsFromPost(List<SkillRequest.SaveDTO> skillDTOs, int postId) {
        for (SkillRequest.SaveDTO requestDTO : skillDTOs) {
            Query query = em.createNativeQuery("insert into skill_tb(skill, post_id, created_at) values (?, ?, now())");
            query.setParameter(1, requestDTO.getSkill());
            query.setParameter(2, postId);

            query.executeUpdate();
        }
    }
}
