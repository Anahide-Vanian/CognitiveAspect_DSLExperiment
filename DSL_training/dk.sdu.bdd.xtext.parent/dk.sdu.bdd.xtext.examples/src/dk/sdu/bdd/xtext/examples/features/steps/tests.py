from behave import when, given, then
import time
import environment as env #modif
import os

#File created by the developer and utilizing methods form the ur_rtde library imported using "env"



@given('the position {prep} the character "{identifier}" is "{position}"')
def step_given(context, identifier : str, position, prep):
    goal = env.data["Positions"][position]
    env.move(context, goal, "moderate")
    text = identifier + " is now at position " + position + ".\n"
    env.writeText4user(context, text, context.text4userPos)


@when('the character "{identifier}" moves to position "{position}" with "{speed}" speed')
def step_when(context, identifier : str, position, speed : str):
    goal = env.data["Positions"][position]
    env.move(context, goal, speed)
    
@when('the character "{identifier}" moves to position "{position}"')
def step_when(context, identifier : str, position):
    goal = env.data["Positions"][position]
    env.move(context, goal, "moderate")

@then('the object "{identifier}" is {state}')
def step_impl(context, identifier:str, state):
    
    if(state == "activated"):
        env.drawCircle(context, "yellow")
        env.writeText4user(context, "Object activated !", context.text4userPos)
        
    else:
        pass
        