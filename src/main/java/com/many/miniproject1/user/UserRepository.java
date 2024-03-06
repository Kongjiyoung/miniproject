package com.many.miniproject1.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public List<User> findAll() {
        Query query = em.createNativeQuery("select * from user_tb", User.class);

        return query.getResultList();
    }

    public User findById(int id) {
        Query query = em.createNativeQuery("select * from user_tb where id=?", User.class);
        query.setParameter(1, id);

        try {
            User user = (User) query.getSingleResult();
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    @Transactional
    public void companySave(UserRequest.JoinDTO requestDTO) {
        Query query = em.createNativeQuery("insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at) values ('company', ?, ?, ?, ?, ?, ?, ?, '/images/company1.png', now());");
        query.setParameter(1, requestDTO.getEmail());
        query.setParameter(2, requestDTO.getPassword());
        query.setParameter(3, requestDTO.getUsername());
        query.setParameter(4, requestDTO.getTel());
        query.setParameter(5, requestDTO.getCompanyName());
        query.setParameter(6, requestDTO.getAddress());
        query.setParameter(7, requestDTO.getCompanyNum());

        query.executeUpdate();
    }

    @Transactional
    public void personSave(UserRequest.JoinDTO requestDTO) {
        Query query = em.createNativeQuery("insert into user_tb(role, birth, email, password, username, tel, address, created_at) values('person',?,?,?,?,?,?,now())");
        query.setParameter(1, requestDTO.getBirth());
        query.setParameter(2, requestDTO.getEmail());
        query.setParameter(3, requestDTO.getPassword());
        query.setParameter(4, requestDTO.getUsername());
        query.setParameter(5, requestDTO.getTel());
        query.setParameter(6, requestDTO.getAddress());
        query.executeUpdate();
    }


//    @Transactional
//    public void delete(int id) {
//        Query query = em.createNativeQuery("delete from user_tb where id = ?");
//        query.setParameter(1, id);
//
//        query.executeUpdate();
//    }

    public User findByEmailAndPassword(UserRequest.LoginDTO requestDTO) {
        Query query = em.createNativeQuery("select * from user_tb where email=? and password=?", User.class);
        query.setParameter(1, requestDTO.getEmail());
        query.setParameter(2, requestDTO.getPassword());
        try {
            User user = (User) query.getSingleResult();
            return user;
        } catch (Exception e) {
            return null;
        }
    }

//    public UserResponse.DetailDTO personFindByIdWithUser(int id) {
//        Query query = em.createNativeQuery("select * from user_tb where id = ?");
//        query.setParameter(1, id);
//
//        Object[] row = (Object[]) query.getSingleResult();
//        String role = (String) row[0];
//        String email=(String) row[1];
//        String password=(String) row[2];
//        String username=(String) row[3];
//        String tel=(String) row[4];
//        String profile=(String) row[5];
//
//        UserResponse.DetailDTO responseDTO = new UserResponse.DetailDTO();
//
//        responseDTO.setRole(role);
//        responseDTO.setEmail(email);
//        responseDTO.setPassword(password);
//        responseDTO.setUsername(username);
//        responseDTO.setTel(tel);
//        responseDTO.setProfile(profile);
//        return responseDTO;
//    }
//    public UserResponse.DetailDTO companyFindByIdWithUser(int id) {
//        Query query = em.createNativeQuery("select * from user_tb where id = ?");
//        query.setParameter(1, id);
//        Object[] row = (Object[]) query.getSingleResult();
//        String role = (String) row[0];
//        String profile=(String) row[1];
//        String companyName=(String) row[2];
//        String companyNum=(String) row[3];
//        String companyAddress=(String) row[4];
//        String username=(String) row[5];
//        String tel=(String) row[6];
//        String email=(String) row[7];
//        String password=(String) row[8];
//
//        UserResponse.DetailDTO responseDTO = new UserResponse.DetailDTO();
//
//        responseDTO.setRole(role);
//        responseDTO.setCompanyName(companyName);
//        responseDTO.setCompanyNum(companyNum);
//        responseDTO.setCompanyAddress(companyAddress);
//        responseDTO.setEmail(email);
//        responseDTO.setPassword(password);
//        responseDTO.setUsername(username);
//        responseDTO.setTel(tel);
//        responseDTO.setProfile(profile);
//        return responseDTO;
//    }

    @Transactional
    public void personUpdate(UserRequest.PersonUpdateDTO requestDTO, int id) {
        Query query = em.createNativeQuery("update user_tb set profile = ?, username=?, tel=?,address=?,birth=?, email=?, password =? where id = ?");
        query.setParameter(1, requestDTO.getProfile());
        query.setParameter(2, requestDTO.getUsername());
        query.setParameter(3, requestDTO.getTel());
        query.setParameter(4, requestDTO.getAddress());
        query.setParameter(5, requestDTO.getBirth());
        query.setParameter(6, requestDTO.getEmail());
        query.setParameter(7, requestDTO.getPassword());
        query.setParameter(8, id);

        query.executeUpdate();
    }

    @Transactional
    public void companyUpdate(UserRequest.CompanyUpdateDTO requestDTO, int id) {
        Query query = em.createNativeQuery("update user_tb set profile=?, company_name =? , company_num=?, address=?, username=?, tel=?, email=? where id = ?");
        query.setParameter(1, requestDTO.getProfile());
        query.setParameter(2, requestDTO.getCompanyName());
        query.setParameter(3, requestDTO.getCompanyNum());
        query.setParameter(4, requestDTO.getAddress());
        query.setParameter(5, requestDTO.getUsername());
        query.setParameter(6, requestDTO.getTel());
        query.setParameter(7, requestDTO.getEmail());
        query.setParameter(8, id);

        query.executeUpdate();
    }

    @Transactional
    public void passwordUpdate(UserRequest.PasswordChangeDTO requestDTO, int id) {
        Query query = em.createNativeQuery("update user_tb set password =? where id = ?");
        query.setParameter(1, requestDTO.getPassword());
        query.setParameter(2, id);
        query.executeUpdate();

    }
}