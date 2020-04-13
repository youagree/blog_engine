package com.skillbox.blog.dto.response.temporary;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TemporaryComment {

  int commentId;
  LocalDateTime time;
  int userId;
  String name;
  String photo;
  String text;
}
