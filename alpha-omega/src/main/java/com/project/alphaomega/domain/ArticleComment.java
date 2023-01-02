package com.project.alphaomega.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    //Article : ArticleComment = 1 : N
    private Long id;
    private String title;
    private Article article; // N



    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;



}
