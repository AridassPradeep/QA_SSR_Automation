Feature: Registration page feature

  Background: User opens website
    Given user is on home page
    When user clicks on register button

  Scenario Outline: Validate Registration
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    And click on next button
    And click on new password  "<password>"
    And click on confirm password "<password>"
    And click on create account
    Then Thankyou page is displayed

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password  |
      | ramya    | 9038775234 | 18DNSPK1904H1ZR | ramya9347@gmail.com | Ramya@678 |

  Scenario Outline: Validate  user is able to enter the user details and can proceed to password creation page
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    And click on next button
    Then Guest User Navigates to Password creation page

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password  |
      | ramya    | 8038065401 | 18ALNPL3824H1ZV | rbmya1301@gmail.com | Ramya@678 |

  Scenario Outline: verify the error message is displaying if user enters Registered GSTIN Number
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters already registered gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    Then invalid GST no message is displayed

      Examples: 
      | username | mobileno   | GSTIN           | companyemail       | 
      | ramya    | 8238775234 | 33AAIAS3118C1ZY | ramya1347@gmail.com |

  Scenario Outline: Validate the error message is displaying if we enters more than 30 characters for full name
    When user enters username "<username>" with 31 characters
    And user enters mobile with "<mobileno>"

    Examples: 
      | username                        | mobileno   |
      | ramyaramyaramyasramyaramyaramyaq | 8006510206 |

  Scenario Outline: Validate the proceed button is disabled if the user name is blank
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    Then next button is disabled

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password  |
      |          | 8006510107 | 33AVBPV0934G1ZQ | ramya207@gmail.com | Ramya@678 |

  Scenario Outline: verify ther user enters existing email-id then error message will be displayed
    When user enters username with "<username>"
    And user enters existing  companymailid with "<companyemail>"
    And user enters mobile with "<mobileno>"
    Then email validation error to be displayed

    Examples: 
      | username | mobileno   | companyemail       | password  |
      | ramya    | 8006510108 | ramya201@gmail.com | Ramya@678 |

  Scenario Outline: Verify the user enters more than 80 characters for email then proper error message will be displayed
    When user enters username with "<username>"
    And user enters companymailid with more than 80 characters with "<companyemail>"
    And user enters mobile with "<mobileno>"
    Then email validation error to be displayed

    Examples: 
      | username | mobileno   | companyemail                                                                                                 | password  |
      | ramya    | 8006510108 | ramya12345678901123456789012345676787653ewsqazxerfdehyurhfhfhfhfhyr65hkgi89ihjgyut6789hgbmnbjhj201@gmail.com | Ramya@678 |

  Scenario Outline: Validate the error message is displaying if user enters email id without @
    When user enters username with "<username>"
    And user enters companymailid  without @ "<companyemail>"
    And user enters mobile with "<mobileno>"
    Then email validation error to be displayed

    Examples: 
      | username | mobileno   | companyemail |
      | ramya    | 8728765410  | abcgmail.com |

  Scenario: Validate user navigates to login page if user clicks on login link
    When user click on login hyper link
    Then login screen is displayed

  Scenario Outline: Validate Success message up on successful registration
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    And click on next button
    And click on new password  "<password>"
    And click on confirm password "<password>"
    And click on create account
    Then Thankyou page is displayed

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password  |
      | ramya    | 8200519502 | 07AAIAS3118C1ZT | ramya8521@gmail.com | Ramya@678 |

  Scenario Outline: Validate ‘Proceed to Home’ button is activated after successful Registration.
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    And click on next button
    And click on new password  "<password>"
    And click on confirm password "<password>"
    And click on create account
    Then proceed to home is displayed

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password  |
      | ramya    | 9346212602 | 33AAIAS3118C1ZY | sfgya02602@gmail.com | Ramya@678 |

  Scenario Outline: Validate error message for incorrect password
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    And click on next button
    And click on new password  "<password>"
    And click on create account
    Then password error messaage to be displayed

    Examples: 
      | username | mobileno   | GSTIN           | companyemail        | password |
      | ramya    | 8890349912 | 33AAIAS3118C1ZY | ramya3913@gmail.com | as       |


  Scenario Outline: Validate error message for unmatched password
    Given user is on home page
    When user clicks on register button
    And user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    And click on termsandcondition
    And click on next button
    And click on new password  "<password1>"
    And click on confirm password "<password2>"
    And click on create account
    Then password error messaage to be displayed

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password1 | password1 |
      | ramya    | 8086511002 | 33ALMPA3620R1Z0 | ramya452@gmail.com | asWDNDG@1 | asWE@dff  |


  
  Scenario Outline: Validate  User will see error screen message GSTIN is read by ecomm platform
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"

    Examples: 
      | username | mobileno   | GSTIN           | companyemail       | password  |
      | ramya    | 8016513443 | 27AATPG7756Q1ZK | shamya200@gmail.com | Ramya@678 |


  Scenario Outline: Validate GSTIN owner name along with bill to address and bill to pin code should be displayed on the screen below the 'Enter GSTIN' field as per the wireframe.
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    And user enters companymailid with "<companyemail>"
    Then validate gstdetails

    Examples: 
      | username | mobileno   | GSTIN           | companyemail      | password  |
      | ramya    | 8996900002 | 21AAHCK4824E1ZX | rabya5352@gmail.com | Ramya@678 |


  Scenario Outline: Validate verify ther user enters existing phone number then error message will be displayed
    When user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters gstno with "<GSTIN>"
    Then login screen is displayed

    Examples: 
      | username | mobileno   | GSTIN           | companyemail      | password  |
      | ramya    | 8006510100 | 33AHOPD1014A1ZB | ramya52@gmail.com | Ramya@678 |
