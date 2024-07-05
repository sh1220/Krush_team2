package com.Krush_2.Krush2.response;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum ExceptionResponseStatus implements BaseSatus {

  // global
  INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버에 문제가 발생했습니다."),
  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),

  // member
  DUPLICATION_LOGIN_ID(HttpStatus.BAD_REQUEST, "이미 존재하는 아이디 입니다.");

  private final HttpStatus status;
  private final String message;

  public HttpStatus getStatus() {
    return status;
  }
  public String getMessage() {
    return message;
  }
}