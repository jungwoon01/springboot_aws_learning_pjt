package com.springboot_aws.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 테이블과 링크될 클래스임을 나타냄
public class Posts {
    @Id // 해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성 규칙을 나타냄
    private Long id;

    // 테이블의 칼럼을 나타냄. 굳이 선언하지 않더라도 해당 클래스이 필드는 모두 칼럼이 됨.
    // 굳이 사용하는 이유는, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용함.
    @Column(length = 500, nullable = false) // VARCHAR(255)가 기본인데 500으로 늘림
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) // 타입을 TEXT 로 변경
    private String content;

    private String author;

    @Builder // 해달 클래스의 빌더 패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
