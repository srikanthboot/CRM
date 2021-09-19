package com.srikanth.model;



import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SMSServiceTwilio  {
	public static void main(String[] args) {
	
	// Find your Account Sid and Token at twilio.com/console
    final String ACCOUNT_SID = "ACfe9ed432b4c609b9e6a9a0c2b2e496e3";
    final String AUTH_TOKEN = "29c9d39b930c27dc5819f47bc34d0fba";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+918790275687"),//The phone number you are sending text to
                new com.twilio.type.PhoneNumber("+17372105652"),//The Twilio phone number
                "Teaching is The new learning")
           .create();
        
	}
        /*Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+XXXXXXXXXXX"),//The phone number you are sending text to
                new com.twilio.type.PhoneNumber("+XXXXXXXXXXX"),//The Twilio phone number
                "Teaching is The new learning")
           .create();*/

      
}	
