package com.many.miniproject1.main;

import com.many.miniproject1.post.Post;
import com.many.miniproject1.resume.Resume;
import com.many.miniproject1.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainRepository {
    private final EntityManager em;

    public List<User> findAll() {
        Query query = em.createNativeQuery("select * from user_tb", User.class);

        return query.getResultList();
    }

    public List<Post> findPost(int id) {
        Query query = em.createNativeQuery("select * from post_tb where company_id=id", Post.class);

        return query.getResultList();
    }

    public List<Resume> findResume(int id) {
        Query query = em.createNativeQuery("select * from resume_tb where person_id=id", Resume.class);

        return query.getResultList();
    }

}
