# upgrade-interview-challenge
This framework has tests for two flows namely:
a.) NonDMFunnel flow, ie where user is shopping for a loan and enters criteria and registers on the site. 
b.) Login flow, where user logs into the application and lands on the Offer-page.

In the time I have had I have automated tests for only chrome browser.

Users.java file gives the enum Users object which is used to log into the application.

To validate on the offers page, I used selenium webdriver's TakeScreenShot feature, we compare the screen shot of the offer page at the time of registration(NonDMFunnel flow) and after login (Login flow) 
