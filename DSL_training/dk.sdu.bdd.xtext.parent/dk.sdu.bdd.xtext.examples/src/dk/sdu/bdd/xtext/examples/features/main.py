from behave.__main__ import main as behave_main

from logic.fileReader import readFile
import time
import os

def main():
    readFile()
    path = os.path.join(os.path.dirname(__file__))
    # path = C:\Users\ansil\eclipse-workspace\DSLBeta1-robot\dk.sdu.bdd.xtext.parent\dk.sdu.bdd.xtext.examples\src\dk\sdu\bdd\xtext\examples\features
    # __file__ is a special variable that holds the path of the current Python script.
    # os.path.dirname(__file__) gets the directory name of the current script's (or module's) file.
    
    # os.path.join() is used to join one or more path components intelligently.
    # In this case, it's used to join the current script's directory with an empty string, effectively giving the current script's directory.
    
    # Starts test
    behave_main([path] + ["--stop", "--no-capture"])#executes the ".feature" file which means run the methods associated to each steps listed in the file written using the Gherkin Syntax (tests.py)

if __name__ == '__main__':
    main()
    
    
    

"""
 Scenario: "Activating the object 2" 
Given the object "Circle 1" is activated
When the character "Bob" moves to position "default"
And the character "Bob" moves to position "OBJECT_POSITION_2"
Then the object "Circle 1" is unactivated
And the object "Circle 2" is activated


Scenario: "Activating the object 3" 
Given the object "Circle 2" is activated
When the character "Bob" moves to position "default"
And the character "Bob" moves to position "OBJECT_POSITION_3"
Then the object "Circle 2" is unactivated
And the object "Circle 3" is activated
"""