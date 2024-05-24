Feature: Login to DSAlgo application
  

  @SmokeTest
  Scenario Outline: Validate Login page with UserName and Password
  
  
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the "<Username>" textbox and "<Password>" textbox blank
    Then The error message "Please fill out this field." appears below Username textbox
    
   Examples:
   | Username | Password |
     | Smitha | Password123 |
   | Adhya | Adhya123 |
   |  | Pass12|
   | Aashvi |  |