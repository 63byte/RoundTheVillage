package com.kh.RoundTheVillage.member.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.RoundTheVillage.member.model.service.MemberService;
import com.kh.RoundTheVillage.member.model.vo.Member;

import javafx.scene.control.Alert;


@Controller
@RequestMapping("/member/*")
@SessionAttributes({"loginMember"})

public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@Autowired  
	private JavaMailSender mailSender;   //메일
	
	//회원가입 연결
	@RequestMapping("signUp")
	public String signUp() {
		return "member/signUp";
	}
	
	//아이디 중복 체크 Controller (AJAX)
	@RequestMapping("idDupCheck")
	@ResponseBody
	public int idDupCheck( @RequestParam("memberId") String memberId) { 
		
		// 아이디 중복 검사 서비스 호출
		int result = service.idDupCheck(memberId);
		
		return result;
	}
	
	//이메일 중복 체크 Controller (AJAX)
	@RequestMapping("emailDupCheck")
	@ResponseBody
	public int emailDupCheck( @RequestParam("memberEmail") String memberEmail) { 
		
		// 아이디 중복 검사 서비스 호출
		
		int result = service.emailDupCheck(memberEmail);
		
		//System.out.println(result);
		
		return result;
	}
	
	//닉네임 중복 체크  Controller
	@RequestMapping("nickNameDupCheck")
	@ResponseBody
	public int nickNameDupCheck( @RequestParam("memberNickname") String memberNickname) {
		int result = service.nickNameDupCheck(memberNickname);
		
		//System.out.println(result);
		return result;
	}
	
	
	// ---------------------------------------------------
   // 회원가입 이메일 발송 Controller (AJAX)
   // ---------------------------------------------------
   @RequestMapping("normalSignUpMail")
   @ResponseBody
   public String normalSignUpMail(HttpServletRequest request) {
      
      String setfrom = "wldnsro1128@gmail.com";
      String tomail = request.getParameter("mail"); // 받는 사람 이메일
      String title = "[동네한바퀴 회원가입] 회원 가입에 필요한 이메일 인증 번호"; // 제목
      String content = "해당 인증번호를 인증번호 확인영역에 입력해주세요."; // 내용
      String key = "";

      try {
         Random random = new Random();
           
           for (int i = 0; i < 3; i++) {
               int index = random.nextInt(25) + 65; // A~Z까지 랜덤 알파벳 생성
               key += (char) index;
            }
            int numIndex = random.nextInt(8999) + 1000; // 4자리 정수를 생성
            key += numIndex;
            
            
         MimeMessage message = mailSender.createMimeMessage();
         MimeMessageHelper messageHelper = new MimeMessageHelper(message,true, "UTF-8");

         messageHelper.setFrom(setfrom); // 보내는사람 생략하면 정상작동을 안함
         messageHelper.setTo(tomail); // 받는사람 이메일
         messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
         messageHelper.setText(content + key); // 메일 내용

         mailSender.send(message);
      } catch (Exception e) {
         System.out.println(e);
      }

      return key;
   }
	
	
	
	
	
	// 회원가입 동작
	@RequestMapping("signUpAction")
	public String signUpAction(@ModelAttribute Member signUpMember ,
								RedirectAttributes ra) {
		
		String returnUrl = null;
		//System.out.println(signUpMember);
		
		int result = service.signUp(signUpMember);
		
		if(result > 0) {        //추후 얼러트 창으로 바꿀 예정
			returnUrl = "/";
		}else {
			returnUrl = "member/signUp";
		}
		
		return "redirect:" + returnUrl ;
	}
	
	
	
	
	
	
	
	
	// 로그인화면 연결
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	
	// 로그인 동작
	@RequestMapping("loginAction")
	public String loginAction(Member inputMember,
							@RequestParam(value="saveId", required = false) String saveId,
							HttpServletResponse response,
							Model model) {
		Member loginMember = service.loginAction(inputMember);
		
		String url = null;
		
		if(loginMember != null) {
			model.addAttribute("loginMember", loginMember);
			
			Cookie cookie = new Cookie("saveId", loginMember.getMemberId());
			
			if(saveId != null) {
				cookie.setMaxAge(60 * 60  * 24);
			}else {
				cookie.setMaxAge(0);
			}
			
			response.addCookie(cookie);
			url = "/";
			
		}else {
			url = "login";
		}
		return "redirect:" + url;
	}
	
	// 로그아웃
	@RequestMapping("logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		
		return "redirect:/"; //메인화면 재요청
	}
	
	
	
	
	
	
	
	
	
	
	// 아이디/비밀번호 찾기 연결
	@RequestMapping("idFind")
	public String idFind() {
		return "member/idFind";
	}
	// 아이디/비밀번호 찾기 연결
	@RequestMapping("pwdFind")
	public String pwdFind() {
		return "member/pwdFind";
	}
	
	// 아이지 찾기 성공 페이지
	@RequestMapping("idFindComplete")
	public String idFindComplete() {
		return "member/idFindComplete";
	}
	
	
	// 아이지 찾기 성공 페이지
	@RequestMapping("pwdFindComplete")
	public String pwdFindComplete() {
		return "member/pwdFindComplete";
	}
	
	
	
	
	
}
