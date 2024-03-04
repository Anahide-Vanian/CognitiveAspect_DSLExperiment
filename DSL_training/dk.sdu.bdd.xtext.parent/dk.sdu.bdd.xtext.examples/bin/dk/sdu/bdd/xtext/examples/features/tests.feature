










Feature: Our Feature
Scenario: Moving Object1 to detect its color
Given the position of the robot "SuperRobot" is "default" 
And the magnet "Magnet" is OFF

When the magnet "Magnet" activates
And the robot "Robot" moves to position "POS_1"  
And the robot "Robot" moves to position "SENSOR_AREA" 
And the sensor "Sensor" scans 

Then the object "Cube" is sensed


Scenario: Moving Object1 to detect its color
Given the position of the robot "SuperRobot" is "default" 
And the magnet "Magnet" is OFF

When the magnet "Magnet" activates
And the robot "Robot" moves to position "POS_2"  
And the robot "Robot" moves to position "SENSOR_AREA" 
And the sensor "Sensor" scans 

Then the object "Cube" is sensed


Scenario: Moving Object1 to detect its color
Given the position of the robot "SuperRobot" is "default" 
And the magnet "Magnet" is OFF

When the magnet "Magnet" activates
And the robot "Robot" moves to position "POS_3"  
And the robot "Robot" moves to position "SENSOR_AREA" 
And the sensor "Sensor" scans

Then the object "Cube" is sensed

Scenario: Sorting object in its corresponding colored bucket
Given the position of the robot "SuperRobot" is "default" 
And the object "Cube" is green 

When the robot "Robot" moves to position "GREEN_BUCKET"  
And the magnet "Magnet" deactivates
And the robot "Robot" moves to position "default"

Then the object "Cube" is sorted

 


Scenario: Assembling the RED object 
Given the position of the robot "SuperRobot" is "default" 
And the magnet "Magnet" is OFF
When the robot "Robot" moves to position "RED_BUCKET"
And the magnet "Magnet" activates 
And the robot "Robot" moves to position "ASSEMBLING_AREA_1"  
And the magnet "Magnet" deactivates
And the robot "Robot" moves to position "default"
Then the object "RedCube" is assembled

Scenario: Assembling the GREEN object 
Given the position of the robot "SuperRobot" is "default" 
And the magnet "Magnet" is OFF
When the robot "Robot" moves to position "GREEN_BUCKET"
And the magnet "Magnet" activates 
And the robot "Robot" moves to position "ASSEMBLING_AREA_2"  
And the magnet "Magnet" deactivates
And the robot "Robot" moves to position "default"
Then the object "GreenCube" is assembled


Scenario: Assembling the BLUE object 
Given the position of the robot "SuperRobot" is "default" 
And the magnet "Magnet" is OFF
When the robot "Robot" moves to position "BLUE_BUCKET"
And the magnet "Magnet" activates 
And the robot "Robot" moves to position "ASSEMBLING_AREA_3"  
And the magnet "Magnet" deactivates
And the robot "Robot" moves to position "default"
Then the object "BlueCube" is assembled













Scenario: Grabbing the object 
Given the position of the robot "Robot" is "default"
When the robot "Robot" moves to position "POS1"
And the robot "Robot" grabs the object "Cube"
Then the object "Cube" is grabbed

Scenario: Moving the object 
Given the object "Cube" is grabbed
When the robot "Robot" moves to position "SENSOR_AREA"
Then the object "Cube" is sensed

Scenario: Sorting the object its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "red"
When the robot "Robot" moves to position "RED_BUCKET"
Then the object "Cube" is released

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "green"
When the robot "Robot" moves to position "GREEN_BUCKET"
Then the object "Cube" is released

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "blue"
When the robot "Robot" moves to position "BLUE_BUCKET"
Then the object "Cube" is released


Scenario: Grabbing the object
Given the position of the robot "Robot" is "default"
When the robot "Robot" moves to position "POS2"
And the robot "Robot" grabs the object "Cube"
Then the object "Cube" is grabbed

Scenario: Moving the object to detect its color
Given the object "Cube" is grabbed
When the robot "Robot" moves to position "SENSOR_AREA"
Then the object "Cube" is sensed

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "red"
When the robot "Robot" moves to position "RED_BUCKET"
Then the object "Cube" is released

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "green"
When the robot "Robot" moves to position "GREEN_BUCKET"
Then the object "Cube" is released

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "blue"
When the robot "Robot" moves to position "BLUE_BUCKET"
Then the object "Cube" is released


Scenario: Grabbing the object
Given the position of the robot "Robot" is "default"
When the robot "Robot" moves to position "POS3"
And the robot "Robot" grabs the object "Cube"
Then the object "Cube" is grabbed

Scenario: Moving the object to detect its color
Given the object "Cube" is grabbed
When the robot "Robot" moves to position "SENSOR_AREA"
Then the object "Cube" is sensed

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "red"
When the robot "Robot" moves to position "RED_BUCKET"
Then the object "Cube" is released

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "green"
When the robot "Robot" moves to position "GREEN_BUCKET"
Then the object "Cube" is released

Scenario: Sorting the object to its corresponding bucket
Given the object "Cube" is sensed
And the color of the object "Cube" is "blue"
When the robot "Robot" moves to position "BLUE_BUCKET"
Then the object "Cube" is released



Scenario: Grabbing the object
Given the position of the robot "Robot" is "default"
When the robot "Robot" moves to position "RED_BUCKET"
And the robot "Robot" grabs the object "Cube"
Then the object "Cube" is grabbed

Scenario: Stacking the RED object
Given the object "Cube" is grabbed
When the robot "Robot" moves to position "ASSEMBLING_AREA"
Then the object "Cube" is released


Scenario: Grabbing the object
Given the position of the robot "Robot" is "default"
When the robot "Robot" moves to position "BLUE_BUCKET"
And the robot "Robot" grabs the object "Cube"
Then the object "Cube" is grabbed

Scenario: Stacking the BLUE object
Given the object "Cube" is grabbed
When the robot "Robot" moves to position "ASSEMBLING_AREA"
Then the object "Cube" is released


Scenario: Grabbing the object
Given the position of the robot "Robot" is "default"
When the robot "Robot" moves to position "GREEN_BUCKET"
And the robot "Robot" grabs the object "Cube"
Then the object "Cube" is grabbed

Scenario: Stacking the GREEN object
Given the object "Cube" is grabbed
When the robot "Robot" moves to position "ASSEMBLING_AREA"
Then the object "Cube" is released




























	





Scenario: Green object
Given the color of the object "MysteriousSquare" is "green"
And the position of the robot "SuperRobot" is "default"
        Given the object "MysteriousSquare" is present       
        When the sensor "ColorSensor" detects 
        Then the object "MysteriousSquare" is green 
When the robot "SuperRobot" moves to position "above_zone_A"
        Given the magnet "Magnet" is OFF
        And the signal of the button "ready" is "ON"
        And the position of the robot "SuperRobot" is "default"
        When the robot "SuperRobot" moves to position "above_zone_A" 
        Then the position of the robot "SuperRobot" is "above_zone_A"
Then the object "MysteriousSquare" is pickedAndplaced
		Given the magnet "Magnet" is OFF
		And the position of the robot "SuperRobot" is "above_zone_A"
		When the robot "SuperRobot" moves to position "zone_A"
		And the magnet "Magnet" activates
		And the robot "SuperRobot" moves to position "zone_B" 
		Then the magnet "Magnet" is OFF

