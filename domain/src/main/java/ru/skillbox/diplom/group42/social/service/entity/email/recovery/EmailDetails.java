package ru.skillbox.diplom.group42.social.service.entity.email.recovery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;

    public EmailDetails(String recipient, String msgBody, String subject){
        this.recipient = recipient;
        this.msgBody = msgBody;
        this.subject = subject;
    }
}