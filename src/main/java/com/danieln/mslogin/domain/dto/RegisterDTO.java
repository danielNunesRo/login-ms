package com.danieln.mslogin.domain.dto;

import com.danieln.mslogin.domain.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role, String email, String cpf, String cep) {

}
