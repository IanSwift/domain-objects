# Domain-Object Kata

In this project you will find an Email POJO class. While useable, this object has a number of issues that keep it from being as powerful or communicative as it could be. Your goal is to refactor this object in a number of ways. As always, try and improve upon your implementations from session to session. Looking for bonus points? Test drive your refactor.

For reference: https://en.wikipedia.org/wiki/Email#Message_header

### Steps:

1. Create a public static method email which creates a general purpose email.

> An email should contain at least body or at least subject. It should have at least one To, Cc, or Bcc-Recipient. It should always use the id provided to it by the email server.

2. Create a public static method reply. 

> A reply is like a regular email, except it contains in the To-recipients the sender of the email being replied to. It should also in its inReplyTo header contain the id of the email being replied to.

3. Create a public static method reply all.

> A reply all is like a reply, except it additionally contains in it's To-recipients all of the email being replied to's To-recipients, and in it's Cc-recipients, all of the email being replied to's Cc-recipients.
 
4.  Create a public static method forward.

> A forward is like a regular email, but at the end of the body, it contains the following message:

```
--------Forwarded message--------
From: <ORIGINAL EMAIL ADDRESS>
Date: <ORIGINAL DATE TIME>
Subject: <ORIGINAL SUBJECT>
To: <COMMA SEPARATED ORIGINAL TO RECIPIENTS>
Cc: <COMMA SEPARTED ORIGINAL CC RECIPIENTS>


<ORIGINAL BODY>
```

6. Add a mandatory contentType field on all emails.

> A content type is the MIME Type of the email. By default, it is set to text/plain.

7. Add a mandatory and auto-generated list of Longs called "References" on all emails

> The references of the email is a list going back in history of all the referenced email ids.

8. Validate email addresses. Allow them to have a name associated with them as well.

> For an email to be created, the email address must have a name@domain. There is also often a name associated with the email address. When being included in headers it is formatted as "Bob User" <bobby@domain.com>


GLHF!!!
