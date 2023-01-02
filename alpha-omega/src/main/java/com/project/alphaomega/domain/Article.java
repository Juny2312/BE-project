package com.project.alphaomega.domain;

import lombok.EqualsAndHashCode;
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
import java.util.Objects;
import java.util.regex.Pattern;

@Getter
@Slf4j
@ToString
@EqualsAndHashCode
@Table(indexes = {
        @Index(columnList = "title" ),
        @Index(columnList = "hashtag" ),
        @Index(columnList = "createAt" ),
        @Index(columnList = "createBy" ),


})

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter @Column(nullable = false)
    private String title;
    @Setter
    private String hashtag;
    @Setter @Column(nullable = false, length = 10000)
    private String content;


    @CreatedDate @Column(nullable = false)
    private LocalDateTime createAt;
    @CreatedBy @Column(nullable = false, length = 100)
    private String createdBy;

    @LastModifiedDate @Column(nullable = false, length = 100)
    private LocalDateTime modifiedAt;

    @LastModifiedBy @Column(nullable = false, length = 100)
    private String modifiedBy;


    protected Article(){} // Basic Constructor

    private Article(String title, String hashtag, String content) {
        this.title = title;
        this.hashtag = hashtag;
        this.content = content;
    }

    public static Article of(String title, String hashtag, String content){
        return new Article(title,content,hashtag);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false; // Pattern Variable (Matching)
        return id != null && id.equals(article.id); // Checking the
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
