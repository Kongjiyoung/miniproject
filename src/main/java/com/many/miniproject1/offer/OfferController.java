package com.many.miniproject1.offer;

import com.many.miniproject1.post.PostResponse;
import com.many.miniproject1.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
    private final HttpSession session;

    // company의 offers 관리
    @GetMapping("/company/offers")
    public String personPost() {
        return "company/offers";
    }

    // person의 offers 관리
    @GetMapping("/person/offerEmails/{id}")
    public String getOfferById(@PathVariable int id, HttpServletRequest request) {
        OfferResponse.OfferBoardDTO responseDTO = offerRepository.findCompanynameById(1);

//        request.setAttribute("offer", responseDTO);

        List<Offer> offerList = offerRepository.findAll();
        request.setAttribute("offerList", offerList);

        return "person/offerEmails";
    }
//    @GetMapping("/person/offerEmails/{id}")
//    public String getOfferById(@PathVariable int id, HttpServletRequest request){
//        Offer offer = offerRepository.findCompanynameById(id);
//        List<Offer> offerList = offerRepository.findAll();
//        request.setAttribute("offerList", offerList);
//        request.setAttribute("offer",offer);
//        return "person/offerEmails";
//    }

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


}