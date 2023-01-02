package com.project.alphaomega.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Slf4j
@ToString
@Table(indexes = {
        @Index(columnList = "title" ),
        @Index(columnList = "title" ),
        @Index(columnList = "title" ),
        @Index(columnList = "title" ),


})

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String title;
    @Setter
    private String hashtag;
    @Setter
    private String content;


    @CreatedDate
    private LocalDateTime createAt;
    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @LastModifiedBy
    private String modifiedBy;


}
