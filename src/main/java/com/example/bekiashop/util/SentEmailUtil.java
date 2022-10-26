package com.example.bekiashop.util;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
@RequiredArgsConstructor
public class SentEmailUtil {

    private final JavaMailSender mJavaMailSender;

    public void senPasswordNew(String email, String code) throws MessagingException {
        MimeMessage message = mJavaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
        message.setContent("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <div style=\"margin: auto; width: 50%; border: solid;\">\n" +
                "        <div style=\"text-align: center; border-bottom: solid; background-color: beige;\">\n" +
                "            <i style=\"font-size: 40px; font-weight: bold;\">KIA</i><i\n" +
                "                style=\"font-size: 40px; font-weight: bold; color: black \">Shop</i>\n" +
                "               <p style=\"font-size: 25px; font-weight: bold; color: red \">Võ phục cao cấp hàng đầu Việt Nam</p>\n" +
                "        </div>\n" +
                "        <div style=\"text-align: left; margin-left: 10%;\">\n" +
                "            <p style=\"font-size: 20px; line-height: 140%;\">Chào bạn</p>\n" +
                "            <p style=\"font-size: 20px; line-height: 140%;\">Đây là mật khẩu mới của bạn:\n" +
                                code +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "\n" +
                "</html>", "text/html; charset=UTF-8");
        helper.setTo(email);
        helper.setSubject("From KIAShop");
        this.mJavaMailSender.send(message);
    }
}