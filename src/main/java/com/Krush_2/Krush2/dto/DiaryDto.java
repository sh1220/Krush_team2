package com.Krush_2.Krush2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DiaryDto {
    private Long subGoalId;
    private Long memberId;
    private String memo;
}