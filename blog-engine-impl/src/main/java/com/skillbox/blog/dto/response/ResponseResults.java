package com.skillbox.blog.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ResponseResults {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer id;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private boolean result;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Map<String, String> errors;

}
