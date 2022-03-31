Feature: Test Tagged Hooks 

@First 
Scenario: This is First test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
@Second 
Scenario: This is Second test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
@Third 
Scenario: This is Third test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
Scenario: Book Ticket with oneway mode
Then Verfiy the goibibo log
Then Select any one option( Oneway ,Roundtrip,Multi City)


Scenario: Book Ticket with Roundtrip mode
Then Verfiy the goibibo log
Then Select any one option( Oneway ,Roundtrip,Multi City)


Scenario Outline: Book Ticket with oneway mode
Then Verfiy the goibibo log
Then Select any one option( Oneway ,Roundtrip,Multi City)
Then Select From 
Then Select Destination	
Examples:
|From|To|
|Bangalore|chennai|