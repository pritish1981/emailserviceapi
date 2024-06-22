package com.scaler.emailserviceapi.emailserviceapi.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SendEmailEventDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
