package com.projeto.semear.controller;

import com.projeto.semear.config.property.SemearApiProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/tokens")
public class TokenController {

    @Autowired
    private SemearApiProperty semearApiProperty;

    // classe responsavel por tirar o cookie da requisiçao
    //utilizado para fazer logout
    @DeleteMapping("/revoke")
    public void revoke(HttpServletRequest req, HttpServletResponse resp) {
        Cookie cookie = new Cookie("refreshToken", null);
        cookie.setHttpOnly(true);
        cookie.setSecure(semearApiProperty.getSeguranca().isEnableHttps()); // TODO: Em producao sera true
        cookie.setPath(req.getContextPath() + "/oauth/token" );
        cookie.setMaxAge(0);

        resp.addCookie(cookie);
        resp.setStatus(HttpStatus.NO_CONTENT.value());
    }

}
