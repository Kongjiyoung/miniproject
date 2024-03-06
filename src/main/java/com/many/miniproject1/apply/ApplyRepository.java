package com.many.miniproject1.apply;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ApplyRepository {
    private final EntityManager em;

    public List<Apply> findAll() {
        Query query = em.createNativeQuery("select * from apply_tb() order by id desc", Apply.class);

        return query.getResultList();
    }

    public List<ApplyResponse.ApplyPostDTO> findPostPass(int idx) {
        String q = """
                SELECT pt.id, pt.title, pt.career, pt.pay, pt.work_condition, pt.work_start_time, pt.work_end_time, pt.deadline, pt.task, pt.profile, pt.working_area, at.is_pass
                FROM post_tb pt
                INNER JOIN apply_tb at ON pt.id = at.post_id
                WHERE at.person_id = ?;
                """;

        Query query = em.createNativeQuery(q);
        query.setParameter(1, idx);
        List<Object[]> resultList = query.getResultList();

        List<ApplyResponse.ApplyPostDTO> responseList = new ArrayList<>();
        for (Object[] row : resultList) {
            Integer id = (Integer) row[0];
            String title = (String) row[1];
            String career = (String) row[2];
            String pay = (String) row[3];
            String workCondition = (String) row[4];
            String workStartTime = (String) row[5];
            String workEndTime = (String) row[6];
            String deadline = (String) row[7];
            String task = (String) row[8];
            String profile = (String) row[9];
            String workingArea = (String) row[10];
            String isPass = (String) row[11];

            ApplyResponse.ApplyPostDTO responseDTO = new ApplyResponse.ApplyPostDTO();
            responseDTO.setId(id);
            responseDTO.setTitle(title);
            responseDTO.setCareer(career);
            responseDTO.setPay(pay);
            responseDTO.setWorkCondition(workCondition);
            responseDTO.setWorkStartTime(workStartTime);
            responseDTO.setWorkEndTime(workEndTime);
            responseDTO.setDeadline(deadline);
            responseDTO.setTask(task);
            responseDTO.setProfile(profile);
            responseDTO.setWorkingArea(workingArea);
            responseDTO.setIsPass(isPass);

            responseList.add(responseDTO);
        }
        return responseList;
    }

    public List<ApplyResponse.ApplyResumeDTO> findResumePassList(int idx) {
        String q = """
                SELECT u.email, u.username, u.tel, u.address, u.birth, r.id, r.person_id, r.title, r.profile, r.portfolio, r.introduce, r.career, r.simple_introduce, r.created_at, a.is_Pass
                FROM user_tb u
                INNER JOIN resume_tb r ON u.id = r.person_id
                INNER JOIN apply_tb a ON r.id = a.resume_id
                WHERE a.company_id = ?;
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, idx);

        List<Object[]> rows = query.getResultList();
        List<ApplyResponse.ApplyResumeDTO> result = new ArrayList<>();

        for (Object[] row : rows) {
            String username = (String) row[0];
            String birth = (String) row[1];
            String tel = (String) row[2];
            String address = (String) row[3];
            String email = (String) row[4];
            Integer id = (Integer) row[5];
            Integer personId = (Integer) row[6];
            String title = (String) row[7];
            String profile = (String) row[8];
            String portfolio = (String) row[9];
            String introduce = (String) row[10];
            String career = (String) row[11];
            String simpleIntroduce = (String) row[12];
            Timestamp createdAt = (Timestamp) row[13];
            String isPass = (String) row[14];

            ApplyResponse.ApplyResumeDTO responseDTO = new ApplyResponse.ApplyResumeDTO();
            responseDTO.setUsername(username);
            responseDTO.setBirth(birth);
            responseDTO.setTel(tel);
            responseDTO.setAddress(address);
            responseDTO.setEmail(email);
            responseDTO.setId(id);
            responseDTO.setPersonId(personId);
            responseDTO.setTitle(title);
            responseDTO.setProfile(profile);
            responseDTO.setPortfolio(portfolio);
            responseDTO.setIntroduce(introduce);
            responseDTO.setCareer(career);
            responseDTO.setSimpleIntroduce(simpleIntroduce);
            responseDTO.setCreatedAt(createdAt);
            responseDTO.setIsPass(isPass);

            result.add(responseDTO);
        }
        return result;
    }

    public ApplyResponse.ApplyResumeDTO findResumePass(int companyId, int resumeId) {
        String q = """
                SELECT u.email, u.username, u.tel, u.address, u.birth, r.id, r.person_id, r.title, r.profile, r.portfolio, r.introduce, r.career, r.simple_introduce, r.created_at, a.is_Pass
                FROM user_tb u
                INNER JOIN resume_tb r ON u.id = r.person_id
                INNER JOIN apply_tb a ON r.id = a.resume_id
                WHERE a.company_id = ? AND r.id=?;
                """;
        Query query = em.createNativeQuery(q);
        query.setParameter(1, companyId);
        query.setParameter(2, resumeId);

        Object[] row = (Object[]) query.getSingleResult();

        String username = (String) row[0];
        String birth = (String) row[1];
        String tel = (String) row[2];
        String address = (String) row[3];
        String email = (String) row[4];
        Integer id = (Integer) row[5];
        Integer personId = (Integer) row[6];
        String title = (String) row[7];
        String profile = (String) row[8];
        String portfolio = (String) row[9];
        String introduce = (String) row[10];
        String career = (String) row[11];
        String simpleIntroduce = (String) row[12];
        Timestamp createdAt = (Timestamp) row[13];
        String isPass = (String) row[14];

        ApplyResponse.ApplyResumeDTO responseDTO = new ApplyResponse.ApplyResumeDTO();
        responseDTO.setUsername(username);
        responseDTO.setBirth(birth);
        responseDTO.setTel(tel);
        responseDTO.setAddress(address);
        responseDTO.setEmail(email);
        responseDTO.setId(id);
        responseDTO.setPersonId(personId);
        responseDTO.setTitle(title);
        responseDTO.setProfile(profile);
        responseDTO.setPortfolio(portfolio);
        responseDTO.setIntroduce(introduce);
        responseDTO.setCareer(career);
        responseDTO.setSimpleIntroduce(simpleIntroduce);
        responseDTO.setCreatedAt(createdAt);
        responseDTO.setIsPass(isPass);

        return responseDTO;
    }

    @Transactional
    public void save(ApplyRequest.SaveDTO requestDTO) {
        Query query = em.createNativeQuery("INSERT INTO Apply_tb(resume_id, post_id, company_id, person_id, is_pass, created_at) VALUES (?,?,?,?,?,now())");
        query.setParameter(1, requestDTO.getResumeId());
        query.setParameter(2, requestDTO.getPostId());
        query.setParameter(3, requestDTO.getCompanyId());
        query.setParameter(4, requestDTO.getPersonId());
        query.setParameter(5, requestDTO.getIsPass());


        query.executeUpdate();
    }

    @Transactional
    public void update(ApplyRequest.UpdateDTO requestDTO, int id) {
        Query query = em.createNativeQuery("update apply_tb set is_pass=? where resume_id = ?");
        query.setParameter(1, requestDTO.getIsPass());
        query.setParameter(2, id);

        query.executeUpdate();
    }

    @Transactional
    public void delete(int id) {
        Query query = em.createNativeQuery("delete from apply_tb where id = ?");
        query.setParameter(1, id);

        query.executeUpdate();
    }
}