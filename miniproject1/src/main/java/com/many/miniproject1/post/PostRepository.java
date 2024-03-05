package com.many.miniproject1.post;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {
    private final EntityManager em;

    public List<Post> findAll() {
        Query query = em.createNativeQuery("select * from post_tb order by id desc", Post.class);
        return query.getResultList();
    }

    public PostResponse.DetailDTO findById(int p_id) {
        Query query = em.createNativeQuery("select p.id, p.title, p.career, p.pay, p.work_condition, p.work_start_time, p.work_end_time, p.deadline, task, p.profile, p.working_area from post_tb p inner join user_tb u on p.company_id = u.id where p.id=?; ");
        query.setParameter(1, p_id);

        Object[] row = (Object[]) query.getSingleResult();

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

        //객체를 생성하여서 DetailDTO로 옮겨담는 작업
        PostResponse.DetailDTO responseDTO = new PostResponse.DetailDTO();
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

        return responseDTO;
    }

    @Transactional
    public void save(PostRequest.SaveDTO requestDTO,  int companyId) {
        Query query = em.createNativeQuery("insert into post_tb(title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at) values(?,?,?,?,?,?,?,?,?,?,now())");
        query.setParameter(1, requestDTO.getTitle());
        query.setParameter(2, requestDTO.getCareer());
        query.setParameter(3, requestDTO.getPay());
        query.setParameter(4, requestDTO.getWorkCondition());
        query.setParameter(5, requestDTO.getWorkStartTime());
        query.setParameter(6, requestDTO.getWorkEndTime());
        query.setParameter(7, requestDTO.getDeadline());
        query.setParameter(8, requestDTO.getTask());
        query.setParameter(9, requestDTO.getProfile());
        query.setParameter(10, requestDTO.getWorkingArea());

        query.executeUpdate();
    }

    @Transactional
    public void update(int id, PostRequest.UpdateDTO requestDTO) {
        Query query = em.createNativeQuery("update post_tb set title=?, career=?,pay=?, work_condition=?, work_start_time=?,work_end_time=?, deadline=?, task=?, profile=?, working_area=? where id = ?");
        query.setParameter(1, requestDTO.getTitle());
        query.setParameter(2, requestDTO.getCareer());
        query.setParameter(3, requestDTO.getPay());
        query.setParameter(4, requestDTO.getWorkCondition());
        query.setParameter(5, requestDTO.getWorkStartTime());
        query.setParameter(6, requestDTO.getWorkEndTime());
        query.setParameter(7, requestDTO.getDeadline());
        query.setParameter(8, requestDTO.getTask());
        query.setParameter(9, requestDTO.getProfile());
        query.setParameter(10, requestDTO.getWorkingArea());
        query.setParameter(11, id);

        query.executeUpdate();
    }

    @Transactional
    public void delete(int id) {
        Query query = em.createNativeQuery("delete from post_tb where id = ?");
        query.setParameter(1, id);

        query.executeUpdate();
    }
}