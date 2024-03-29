		
		
		
		
		
Feature: Our Feature	
	Scenario: Grabbing the object 
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "START_1"
		Then the object "Piece" is grabbed
		
	Scenario: Moving the object 
		Given the object "Piece" is grabbed
		When the robot "Robot" moves to position "SENSOR_AREA"
		Then the object "Piece" is sensed
		
	Scenario: Sorting the object its corresponding bucket
		Given the color of the object "Piece" is "red"
		When the robot "Robot" moves to position "RED_BUCKET_PLACE"
		Then the object "Piece" is released
		
	Scenario: Sorting the object in its corresponding bucket
		Given the color of the object "Piece" is "green"
		When the robot "Robot" moves to position "GREEN_BUCKET_PLACE"
		Then the object "Piece" is released
		
	Scenario: Sorting the object in its corresponding bucket
		Given the color of the object "Piece" is "blue"
		When the robot "Robot" moves to position "BLUE_BUCKET_PLACE"
		Then the object "Piece" is released
		
		
	Scenario: Grabbing the object
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "START_2"
		And the robot "Robot" grabs the object "Piece"
		Then the object "Piece" is grabbed
		
	Scenario: Placing the object in the correct bucket 
		Given the object "Piece" is grabbed
		When the robot "Robot" moves to position "SENSOR_AREA"
		Then the object "Piece" is sensed
		
	Scenario: Placing the object in the correct bucket 
		Given the color of the object "Piece" is "red"
		When the robot "Robot" moves to position "RED_BUCKET_PLACE"
		Then the object "Piece" is released
		
	Scenario: Placing the object in the correct bucket 
		Given the color of the object "Piece" is "green"
		When the robot "Robot" moves to position "GREEN_BUCKET_PLACE"
		Then the object "Piece" is released
		
	Scenario: Placing the object in the correct bucket 
		Given the color of the object "Piece" is "blue"
		When the robot "Robot" moves to position "BLUE_BUCKET_PLACE"
		Then the object "Piece" is released
		
		
	Scenario: Grabbing the object
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "START_3"
		And the robot "Robot" grabs the object "Piece"
		Then the object "Piece" is grabbed
		
	Scenario: Moving the object - detect its color
		Given the object "Piece" is grabbed
		When the robot "Robot" moves to position "SENSOR_AREA"
		Then the object "Piece" is sensed
		
	Scenario: Placing the object in the correct bucket 
		Given the color of the object "Piece" is "red"
		When the robot "Robot" moves to position "RED_BUCKET_PLACE"
		Then the object "Piece" is released
		
	Scenario: Sorting the object in the correct bucket 
		Given the color of the object "Piece" is "green"
		When the robot "Robot" moves to position "GREEN_BUCKET_PLACE"
		Then the object "Piece" is released
		
	Scenario: Sorting the object in the correct bucket 
		Given the color of the object "Piece" is "blue"
		When the robot "Robot" moves to position "BLUE_BUCKET_PLACE"
		Then the object "Piece" is released
		
		
		
		
	Scenario: Grabbing the object
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "RED_BUCKET_PICK"
		And the robot "Robot" grabs the object "Piece"
		Then the object "Piece" is grabbed
		
	Scenario: Stacking the RED object
		Given the object "Piece" is grabbed
		When the robot "Robot" moves to position "ASSEMBLING_AREA_1"
		Then the object "Piece" is released
		
		
	Scenario: Grabbing the object
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "BLUE_BUCKET_PICK"
		And the robot "Robot" grabs the object "Piece"
		Then the object "Piece" is grabbed
		
	Scenario: Stacking the BLUE object
		Given the object "Piece" is grabbed
		When the robot "Robot" moves to position "ASSEMBLING_AREA_2"
		Then the object "Piece" is released
		
	Scenario: Grabbing the object
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "GREEN_BUCKET_PICK"
		And the robot "Robot" grabs the object "Piece"
		Then the object "Piece" is grabbed
		
	Scenario: Stacking the GREEN object
		Given the object "Piece" is grabbed
		When the robot "Robot" moves to position "ASSEMBLING_AREA_3"
		Then the object "Piece" is released
		
		
		
