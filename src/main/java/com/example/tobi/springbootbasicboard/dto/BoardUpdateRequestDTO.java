package com.example.tobi.springbootbasicboard.dto;

import com.example.tobi.springbootbasicboard.model.Board;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@ToString
@Getter
@NoArgsConstructor
@Setter
@Data
public class BoardUpdateRequestDTO {
    private Long id;  // id 추가
    private String title;
    private String content;
    private MultipartFile file;
    private String userId;


}
