		
		
		
		
		
@specificFeature
Feature: Specific Feature	
	Scenario: "1"
		Given the position of the robot "Bent" is "default"
		When the robot "Bent" moves to position "START_1"
		Then the "position" of the robot "Bent" is "START_1"
		
	Scenario: "2"
		Given the position of the robot "Bent" is "START_1"
		When the robot "Bent" moves to position "START_1"
		
		And the robot "Bent" moves to position "START_1"
		And the robot "Bent" grabs the object "Blue"
		Then the "position" of the robot "Bent" is "START_1"
		
		
	Scenario: "3"
		Given the position of the robot "Bent" is "START_1"
		When the robot "Bent" moves to position "SENSOR_AREA"
		And the robot "Bent" moves the object "obj"
		Then the "position" of the robot "Bent" is "SENSOR_AREA"
		
		
