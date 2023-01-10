package com.example.demo.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//spring 에게 해당 class 가 controller 의 역할을 한다고 명기하기 위해 사용하는 Annotation
public class MyController {
	//요청들어온 url의 요청과 annotation value 값이 일피하면 해당 클래스나 메소드가 실행된다.
    // 클래스안의 메서드와 클래스에 적용 가능하며
    //Class단위에 사용하면 하위 메서드에 모두 적용가능
    //메소드 적용되면 해당 메서드에 지정한 방식으로 URL을 처리
	@RequestMapping("/")
//  @RequestMapping(value="")
    /*@RequestMapping
    - 요청 URL을 어떤 메서드가 처리할지 mapping해주는 애노테이션이다.
    컨트롤러나 컨트롤러의 메서드에 적용한다.
    @RequestMapping("/list"), @RequestMapping("/home, /about");
    @RequestMapping("/admin", method=RequestMethod.GET)*/
	public @ResponseBody String root() throws Exception{
		  /*@ResponseBody
         * 메서드에서 리턴되는 값이 view로 출력되지 않고 HTTP Response Body에 직접 쓰여지게 된다.
         * return 시에 Json,xml과 같은 데이터를 return 한다.
        - view가 아닌 JSON 형식의 값을 응답할 때 사용하는 애노테이션으로 문자열을 리턴하면 그 값을 http response header가 아닌 response body에 들어간다.
        만약 객체를 return하는 경우 JACKSON 라이브러리에 의해 문자열로 변환되어 전송된다.
        context에 설정된 resolver를 무시한다고 보면된다. (viewResolver)*/
		return "JSP inGradle";
	}
	@RequestMapping("/test1/")//localhost:8081/test1
	public String test1() {
		return "test1";//실제 호출될 /WEB-INF/views/test1.jsp
	}
	@RequestMapping("/test2/")//localhost:8081/test2
	public String test2() {
		return "test2";//실제 호출될 /WEB-INF/views/test2.jsp
	}
}
