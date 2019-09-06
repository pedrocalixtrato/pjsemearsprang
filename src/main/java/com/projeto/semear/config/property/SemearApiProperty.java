package com.projeto.semear.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "semear")
public class SemearApiProperty {

    private String originPermitida = "http://192.99.228.142:4200";

    private final Seguranca seguranca = new Seguranca();

    public static class Seguranca{

        private boolean enableHttps;

        public boolean isEnableHttps() {
            return enableHttps;
        }

        public void setEnableHttps(boolean enableHttps) {
            this.enableHttps = enableHttps;
        }
    }

    public Seguranca getSeguranca() {
        return seguranca;
    }

    public String getOriginPermitida() {
        return originPermitida;
    }

    public void setOriginPermitida(String originPermitida) {
        this.originPermitida = originPermitida;
    }
}
