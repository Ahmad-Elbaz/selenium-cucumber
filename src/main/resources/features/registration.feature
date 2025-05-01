# registration senario
@reg # can add any tag i need
  Feature: registration Test
    #positive scenario
    Scenario: user fill registration form with valid data
      Given user open reg page
      When user select gender
      And user Enter First Name "ahmed"
      And user Enter Second Name "adel"
      And user enter date of birth
      And Enter email"testww@test.com"
      And Enter company "sadfsfsa"
      And check box is selected
      And enter password "ahmed123"
      And click reg button
      #Then user fill form successfully


