from behave import fixture
import json
from behave.model import Scenario
import turtle
import time


f = open("Environment.json")
data = json.load(f)
        
def before_all(context):
    print("Let's start to play...")
    
    context.bob = turtle.Turtle()
    
    #properties for the screen
    context.bob.arena = turtle.Screen()
    context.bob.arena.title('DSL demo for robot drawing')
    context.bob.arena.bgcolor("orange")
    
    context.bob.font1 = ("Arial", 14, "bold")
    context.bob.font2 = ("Arial", 9, "normal")
    
    
    #properties for the turtle
    # Set the pen size
    context.bob.pensize(3) 
    
    # Register a custom shape using a string representing a character
    turtle.register_shape("my_shape", ((0,0), (0,10), (10,10), (10,0)))  
    # Set the turtle's shape to the custom shape
    context.bob.shape("my_shape")
    
    #Location of the text to provide information to the user
    context.text4userPos = [0,70] 
    

def before_feature(context, feature): 
    #pass
    drawFirstPosition(context)
    drawCircle(context, "red")
    

def after_feature(context, feature):
    pass

def before_scenario(context, scenario): 
    pass

def after_scenario(context, scenario):
    pass

def after_step(context, scenario):
    time.sleep(5)
    

# Get speed based naming (if not set, returns moderately)
def get_speed(identifier = "moderate"):
    speed = data["Speeds"][identifier]
    return speed


# Get coordinate-location based on configured name
def get_position(name):
    locations = data["Positions"]
    coordinate = locations[name]

    return coordinate


def drawFirstPosition(context):
    
    # Hide the turtle
    context.bob.hideturtle()
    
    # Draw the vertical line of the cross   
    goal = data["Positions"]["START"]
    context.bob.penup()
    context.bob.goto(goal[0]-2.5, goal[1]+2)
    context.bob.pendown()
    context.bob.right(45)  # Rotate the turtle to face diagonally
    context.bob.forward(10)# Move diagonally
    
    # Draw the horizontal line of the cross
    context.bob.penup()
    context.bob.goto(goal[0]+2.5, goal[1]+2)
    context.bob.pendown()
    context.bob.right(90)  # Rotate the turtle to face diagonally
    context.bob.forward(10)# Move diagonally
    
    
    # Write "START" next to the cross
    context.bob.penup()
    context.bob.goto(goal[0], goal[1])
    context.bob.pendown()
    context.bob.write("START", align="right", font=("Arial", 12, "normal"))
    
    # Show the turtle
    context.bob.showturtle()

def drawCircle(context, color):
    
    context.bob.hideturtle()
    
    #save robot pos
    actual_pos = context.bob.pos()
    #Go to write the text somewhere else in the screen 
    context.bob.penup()
    # Set the turtle's fill color to red
    context.bob.fillcolor(color)

    context.bob.speed("normal")
    goal = data["Positions"]["OBJECT_POSITION"]
    context.bob.goto(goal[0], goal[1])
        
    # Begin filling the circle with red color
    context.bob.begin_fill()
    
    # Draw a circle with radius 50
    context.bob.circle(10)
    
    # End filling the circle
    context.bob.end_fill()
    
    
    #Reset the robot saved properties to let it continue it's drawing 
    context.bob.penup()
    context.bob.goto(actual_pos)
    
    # Set the turtle's fill color to red
    context.bob.fillcolor("black")
    
    context.bob.showturtle()
    
    
def writeText4user(context, text, text_pos):
    
    context.bob.hideturtle()
    
    #save actual pen color because I want the center text to be black
    actual_pen_color = context.bob.pencolor()
    context.bob.pencolor("black")
           
    #save actual properties
    actual_speed = context.bob.speed()
    actual_pos = context.bob.pos()
    
    #Go to write the text somewhere else in the screen 
    context.bob.penup()   
    context.bob.speed("fast")
    context.bob.goto(text_pos[0], text_pos[1])
    context.bob.write(text, align="center", font=context.bob.font1)
    time.sleep(2)
    # Erase the last text
    context.bob.undo()
    
    #Reset the robot saved properties to let it continue it's drawing 
    context.bob.penup()
    context.bob.goto(actual_pos)
    context.bob.speed(actual_speed)
    context.bob.pencolor(actual_pen_color)#reset previous pen color
    context.bob.pendown()
    
    context.bob.showturtle()
   
    
    
def move(context, location, speed_term):
    context.bob.showturtle()
    
    speed_val = get_speed(speed_term) 
 #Move to draw a side of the  square
    context.bob.speed(speed_val)#set the robot speed
    context.bob.goto(location[0], location[1]) # Forward robot by square_size
    
    
    
