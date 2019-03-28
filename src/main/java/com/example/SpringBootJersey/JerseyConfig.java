package com.example.SpringBootJersey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author Wayne.Hu
 */
@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(UserResource.class);
    }
}
