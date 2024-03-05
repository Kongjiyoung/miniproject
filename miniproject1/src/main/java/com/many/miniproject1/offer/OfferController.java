package com.many.miniproject1.offer;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class OfferController {
    private final OfferRepository offerRepository;

    // company의 offers 관리
    @GetMapping("/company/offers")
    public String personPost() {
        return "company/offers";
    }
    // person의 offers 관리
    @GetMapping("/person/offerEmails")
    public String personPostE(HttpServletRequest request, Integer id) {
        // 출력해보기
//        List<Offer> offer =  offerRepository.findAll();
//        System.out.println(offer);

        Offer companyName = offerRepository.findCompanynameById(id);
        List<Offer> offerList = offerRepository.findAll();
        request.setAttribute("offerList", offerList);
        request.setAttribute("companyName", companyName);

        return "person/offerEmails";
    }

    //    제안 받은 이메일 디테일 머스태치가 없는 것으로 추정됨. 찾으면 알려주시고 공유해주세요. 꼭이요!!!
//    @GetMapping("/person/offer/detail/{id}")
//    public String personPostDetail(@PathVariable int id) {
//        return "company/offerEmailDetail";
//    }
    @GetMapping("/company/updateInfoForm")
    public String FINDOFFER() {
        return "company/updateInfoForm";
    }

    @GetMapping("/person/offerEmailForm/")
    public String pers() {
        return "company/offerEmailForm";
    }

    @GetMapping("/z1")
    public String z1() {
        return "company/appliedResumeDetail";
    }
    @GetMapping("/z2")
    public String z2() {
        return "company/companyInfo";
    }
    @GetMapping("/z3")
    public String z3() {
        return "company/companyResumes";
    }
    @GetMapping("/z4")
    public String z4() {
        return "company/joinForm";
    }
    @GetMapping("/z5")
    public String z5() {
        return "company/loginForm";
    }
}