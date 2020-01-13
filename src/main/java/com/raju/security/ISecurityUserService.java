/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.security;

/**
 *
 * @author User
 */
public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);
}
