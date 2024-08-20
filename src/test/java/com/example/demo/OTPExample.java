package com.example.demo;

// https://mvnrepository.com/artifact/com.warrenstrange/googleauth/1.4.0
import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

public class OTPExample {

    public static void main(String[] args) {
        // Initialize Google Authenticator with default configuration
        GoogleAuthenticator gAuth = new GoogleAuthenticator();

        // Generate a key (this should be done only once for a user)
        //GoogleAuthenticatorKey key = gAuth.createCredentials();
        //String secret = key.getKey();
        //System.out.println("Secret: " + secret);

        // Generate a TOTP code
        String secret = "ovvtk2tioe2uw2lh";
        int code = gAuth.getTotpPassword(secret);
        System.out.println("Generated OTP: " + code);
        
        // Validate the OTP
        boolean isCodeValid = gAuth.authorize(secret, code);
        System.out.println("Is the code valid? " + isCodeValid);
    }
}
