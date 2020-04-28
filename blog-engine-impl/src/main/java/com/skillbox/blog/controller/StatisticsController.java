package com.skillbox.blog.controller;

import com.skillbox.blog.dto.response.ResponseStatisticsDto;
import com.skillbox.blog.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class StatisticsController {

  StatisticsService statisticsService;

  @RequestMapping("statistics/my")
  @ResponseStatus(HttpStatus.OK)
  public ResponseStatisticsDto getStatisticsForCurrentUser() {
    return statisticsService.getStatisticsForCurrentUser();
  }

  @RequestMapping("statistics/all")
  @ResponseStatus(HttpStatus.OK)
  public ResponseStatisticsDto getStatisticForAll() throws AccessDeniedException {
    return statisticsService.getStatisticForAll();
  }
}
