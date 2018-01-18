package org.terasology.services;

import io.dropwizard.setup.Environment;
import org.terasology.factory.MailFactory;
import org.codemonkey.simplejavamail.Mailer;

public class MailService {

    private MailFactory mailFactory;
    private Environment environment;
    public MailService(MailFactory mailFactory, Environment environment){
        this.mailFactory = mailFactory;
        this.environment = environment;
    }

    public Mailer getMailer(){
        return mailFactory.build(environment,"mail");
    }
}
