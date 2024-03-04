		
		
		
		
@specificFeature
Feature: Specific Feature	
	Scenario: "Go to Green Object"
		Given the position of the robot "Alfred" is "default"
		When the robot "Alfted" moves to position "START_1"
		And the robot "Alfred" grabs the object "First Object"
		And the robot "Alfred" moves to position "SENSOR_AREA"
		Then the object "Green Object" is sensed
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	Scenario: "Grabbing and sensing the object"
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "START_1"
		And the robot "Robot" grabs the object "Cube"
		And the robot "Robot" moves to position "SENSOR_AREA"
		Then the object "Cube" is sensed
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "red"
		And the object "Cube" is sensed
		When the robot "Robot" moves to position "RED_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "green"
		And the object "Cube" is sensed
		When the robot "Robot" moves to position "GREEN_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "blue"
		When the robot "Robot" moves to position "BLUE_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Grabbing and sensing the object"
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "START_2"
		And the robot "Robot" grabs the object "Cube"
		And the robot "Robot" moves to position "SENSOR_AREA"
		Then the object "Cube" is sensed
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "red"
		When the robot "Robot" moves to position "RED_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "green"
		When the robot "Robot" moves to position "GREEN_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "blue"
		When the robot "Robot" moves to position "BLUE_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Grabbing and sensing the object"
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "START_3"
		And the robot "Robot" grabs the object "Cube"
		And the robot "Robot" moves to position "SENSOR_AREA"
		Then the object "Cube" is sensed
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "red"
		When the robot "Robot" moves to position "RED_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "green"
		When the robot "Robot" moves to position "GREEN_BUCKET"
		Then the object "Cube" is released
		
	Scenario: "Sorting the object to its corresponding bucket"
		Given the color of the object "Cube" is "blue"
		When the robot "Robot" moves to position "BLUE_BUCKET"
		Then the object "Cube" is released
		 
		
		
	Scenario: "Stacking the red object"
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "RED_BUCKET"
		And the robot "Robot" grabs the object "Cube"
		And the robot "Robot" moves to position "ASSEMBLY_AREA"
		Then the object "Cube" is released
		
	Scenario: "Stacking the blue object"
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "BLUE_BUCKET"
		And the robot "Robot" grabs the object "Cube"
		And the robot "Robot" moves to position "ASSEMBLY_AREA"
		Then the object "Cube" is released
		
	Scenario: "Stacking the green object"
		Given the position of the robot "Robot" is "default"
		When the robot "Robot" moves to position "GREEN_BUCKET"
		And the robot "Robot" grabs the object "Cube"
		And the robot "Robot" moves to position "ASSEMBLY_AREA"
		Then the object "Cube" is released
		
		
		
		
		
