# Domain-Object Kata

In this project you will find an Email POJO class. While useable, this object has a number of issues that keep it from being as powerful or communicative as it could be. Your goal is to refactor this object in a number of ways. There will be more domain object katas to come, so that you can switch between them in your practice, allowing you to forget the exact details of how you implemented it, before you try again. As always, try and improve upon your implementations from session to session. Looking for bonus points? Test drive your refactor.

Don't look ahead, do the steps in order.

For reference: https://en.wikipedia.org/wiki/Email#Message_header

### Steps:

1. Create a constructor for an email to be sent. Autogenerate the sender, date, and id. Assume these emails are being generated for a user with an email address of "mykata@domain.com"
2. Create a constructor for a reply. As an extra parameter, include an email created from the first constructor with no bcc. Autogenerate the inReplyTo, to, and previously mentioned fields.
3. Create a constructor for a reply all. Again, include an original email as an extra parameter. Enhance the to with the original emailer, the recipients, and the cc with the cc recipients.
4. Create a constfor for a forward. We will use google's strategy here. Include the original email as a paremeter. Autogenerate as if it were an original email. Concatenate to the end of the body the following.
```
--------Forwarded message--------
From: <ORIGINAL EMAIL ADDRESS>
Date: <ORIGINAL DATE TIME>
Subject: <ORIGINAL SUBJECT>
To: <COMMA SEPARATED ORIGINAL TO RECIPIENTS>
Cc: <COMMA SEPARTED ORIGINAL CC RECIPIENTS>


<ORIGINAL BODY>
```
5. Remove all setters.
6. Add a mandatory contentType field on all emails. If there is not one given, make it "text/plain"
7. Add a mandatory and auto-generated list of Longs called "References" on all emails. This should be the history of emails in the thread.
8. Validate email addresses. Allow them to have a name associated with them as well.
9. Require at least a body or at least a subject. Also require a recipient on all emails.
10. Bonus: Remove auto-generated ids from your constructors. Create a send() method that assigns an id and prints a formatted headers, and body.


GLHF!!!
