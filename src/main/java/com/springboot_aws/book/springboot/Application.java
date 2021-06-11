package com.springboot_aws.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정됩니다.
// @SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에
// 이 클래스는 항상 프로젝트 최상단에 위치해야 한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run 으로 인해 내장 WAS 를 실행합니다.
        // 내장 WAS 란 별도로 외부에 WAS 를 두지 않고 애플리케이션을 실행할 때 내부에서
        // WAS 를 실행하는 것을 이야기 합니다.
        // 서버에 톰캣을 설치할 필요가 없게 되고, 스프링 부트로 만들어진 Jar 파일로 실행하면 됩니다.
        SpringApplication.run(Application.class, args);
    }
}
