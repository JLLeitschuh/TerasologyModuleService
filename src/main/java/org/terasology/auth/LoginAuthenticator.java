package org.terasology.auth;

import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;
import org.terasology.db.User;

import java.util.Optional;

public class LoginAuthenticator implements Authenticator<BasicCredentials,User> {
    @Override
    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException {

        return Optional.empty();
    }
}
