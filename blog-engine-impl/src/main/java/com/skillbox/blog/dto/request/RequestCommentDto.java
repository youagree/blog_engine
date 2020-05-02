package com.skillbox.blog.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Size;

@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
public class RequestCommentDto {

  @JsonProperty(value = "parent_id")
  private String parentId;

  @JsonProperty(value = "post_id")
  private int postId;

  @Size(max = 200, message = "Текст публикации слишком короткий")
  private String text;
}
