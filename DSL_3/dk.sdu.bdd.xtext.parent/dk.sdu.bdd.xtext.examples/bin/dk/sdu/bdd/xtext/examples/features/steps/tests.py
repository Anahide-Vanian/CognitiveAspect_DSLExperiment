from behave import when, given, then
import behave
from behave.model_core import Status
import time
import environment as env 
import os
import json


@given(u'the position of the robot "{identifier}" is "{position}"')
def step_impl(context, identifier : str, position):  
    
    #check if robot is already in a correct position 
    if(env.actual_pos == position):
        pass
    else :
        env.actual_pos = env.moveRobot(context, position)


@when(u'the robot "{identifier1}" {action1} the object "{identifier2}"')
def step_impl(context, identifier1 :str, identifier2:str, action1):
    
    if (action1 == "grabs"):
        env.magnet_state = env.activateMagnet(context)



@given(u'the color of the object "{identifier}" is "{color_state}"')
def step_impl(context, identifier : str, color_state):

    #Check if the color mentioned same as the one sensed 
    if(env.obj_color_sensed != color_state):
        print("\t SKIPPING SCENARIO BECAUSE INCORRECT COLOR")
        print("\t DETECTED COLOR:", env.obj_color_sensed)
        context.scenario.skip("Skipping scenario because condition is not met")
        


@when('the robot "{identifier}" moves to position "{position}"')
def step_when(context, identifier : str, position):
    
    env.actual_pos = env.moveRobot(context, position)


@given('the object "{identifier}" is {state}')
@then('the object "{identifier}" is {state}')
def step_impl(context, identifier : str, state):
            
    if (state == "released"):
        env.magnet_state = env.deactivateMagnet(context)
        
    if (state == "sensed"):
            env.obj_color_sensed = env.detectColor(context)











""""""""""
@given(u'the position of the robot "{identifier}" is "{position}"')
def step_impl(context, identifier : str, position):  
    
    if(position == "default" and env.first_time_default == True):
        env.first_time_default = False
        pass  
    else :
        
        target_angles = env.position2MotorValues(position) 
        
        text2 = "{\"cmd\":\"setServoPos\",\"value\": 500, \"speed\":" + str(context.speed2) +", \"id\":2}"
        env.writeText2SerialPort(context, text2)#2
        time.sleep(0.5) 
    
        #move the robot
        text1 = "{\"cmd\":\"begin\”}" 
        text2 = "{\"cmd\": \"setServoPos\",\"value\": " + str(target_angles[0]) + ", \"speed\":" + str(context.speed1) +", \"id\":1}"
        text3 = "{\"cmd\":\"setServoPos\",\"value\": " + str(target_angles[1]) + ",  \"speed\":" + str(context.speed2) +", \"id\":2}"
        text4 = "{\"cmd\":\"setServoPos\",\"value\": " + str(target_angles[2]) + ",  \"speed\":" + str(context.speed3) +",\"id\":3}" 
        text5 = "{\"cmd\":\"setServoPos\",\"value\": " + str(target_angles[3]) + ",  \"speed\":" + str(context.speed4) +",\"id\":4}"
        text6 = "{\"cmd\":\"end\”}"
    
        
        env.writeText2SerialPort(context, text1)
        time.sleep(0.5) 
        env.writeText2SerialPort(context, text2)#1
        time.sleep(0.5)
        env.writeText2SerialPort(context, text4)#motor 3
        time.sleep(0.5)  
        env.writeText2SerialPort(context, text5)#motor 4 first to avoid collision 
        time.sleep(0.5)
        env.writeText2SerialPort(context, text3)#motor 2 first to avoid collision 
        time.sleep(0.5)
        env.writeText2SerialPort(context, text6)
    
    


@when('the robot "{identifier}" moves to position "{position}"')
def step_when(context, identifier : str, position):
    
    target_angles = env.position2MotorValues(position)    

    #before action put two servos in safe config
    
    text2 = "{\"cmd\":\"setServoPos\",\"value\": 500, \"speed\":" + str(context.speed2) +", \"id\":2}"
    text3 = "{\"cmd\":\"setServoPos\",\"value\": 500, \"speed\":" + str(context.speed3) +",\"id\":3}" 
    
    
    env.writeText2SerialPort(context, text2)#2
    time.sleep(0.5)
    #env.writeText2SerialPort(context, text3)#motor 3
    #time.sleep(0.5)  
    
    
    #move the robot
    text1 = "{\"cmd\":\"begin\”}" 
    text2 = "{\"cmd\": \"setServoPos\",\"value\": " + str(target_angles[0]) + ", \"speed\":" + str(context.speed1) +", \"id\":1}"
    text3 = "{\"cmd\":\"setServoPos\",\"value\": " + str(target_angles[1]) + ",  \"speed\":" + str(context.speed2) +", \"id\":2}"
    text4 = "{\"cmd\":\"setServoPos\",\"value\": " + str(target_angles[2]) + ",  \"speed\":" + str(context.speed3) +",\"id\":3}" 
    text5 = "{\"cmd\":\"setServoPos\",\"value\": " + str(target_angles[3]) + ",  \"speed\":" + str(context.speed4) +",\"id\":4}"
    text6 = "{\"cmd\":\"end\”}"


    
    env.writeText2SerialPort(context, text1) 
    time.sleep(0.5)
    env.writeText2SerialPort(context, text2)#1
    time.sleep(0.5)
    env.writeText2SerialPort(context, text4)#motor 3
    time.sleep(0.5)  
    env.writeText2SerialPort(context, text5)#motor 4 first to avoid collision 
    time.sleep(0.5)
    env.writeText2SerialPort(context, text3)#motor 2 first to avoid collision 
    time.sleep(0.5)
    env.writeText2SerialPort(context, text6)
    


#raise behave.SkipScenario("Skipping scenario because condition is not met")
@when('the robot "{identifier1}" {action} the object "{identifier2}"')
def step_impl(context, identifier1 :str, identifier2:str, action):
    
    #we want to activate the relay
    relayValue = env.askArduinoRelayValue(context)  
     
    if (action == "grabs" ):#check if the action is grabing
        if(relayValue == False):
            #we activate the magnet
            text = "{\"cmd\":\"setRelay\",\"value\":true}"
            env.writeText2SerialPort(context, text)
            time.sleep(0.5)
            #check if it worked:
            relayValueAgain = env.askArduinoRelayValue(context) 
            
            if(relayValueAgain == True):
                #update value in JSON file
                env.setJsonMagnetValue(context, "ON")


@given('the object "{identifier}" is {state}')
@then('the object "{identifier}" is {state}')
def step_impl(context, identifier : str, state):
  
    env.magnet_state = env.readJsonMagnetValue(context)
    if (state == "grabbed"):#State magnet ON if OFF
        
        if(env.magnet_state != True ):
            # we reactivate the magnet
            text = "{\"cmd\":\"setRelay\",\"value\":true}"
            env.writeText2SerialPort(context, text)
            time.sleep(0.5)
            #update value in JSON file
            env.setJsonMagnetValue(context, "ON")
            
    if (state == "released"):
      
        text = "{\"cmd\":\"setRelay\",\"value\":false}"
        env.writeText2SerialPort(context, text)
        time.sleep(0.5)
        #check if it worked and update context variable
        relayValue = env.askArduinoRelayValue(context)
        
        if(relayValue == False):
            env.setJsonMagnetValue(context, "OFF")#update context variable   
    
    if (state == "sensed"):#save the color
        
        r_value = env.askArduinoColorValues(context)[0]
        g_value = env.askArduinoColorValues(context)[1]
        b_value = env.askArduinoColorValues(context)[2]
        
        if(r_value > g_value and r_value > b_value):
            print("\t THE OBJECT IS RED")#save it to context variable
            env.setJsonColorValue(context,"red")
        elif(g_value > r_value and g_value > b_value):
            print("\t THE OBJECT IS GREEN")
            env.setJsonColorValue(context,"green")
        elif(b_value > r_value and b_value > g_value):
            print("\t THE OBJECT IS BLUE")
            env.setJsonColorValue(context,"blue")



@given(u'the color of the object "{identifier}" is "{color_state}"')
def step_impl(context, identifier : str, color_state):
    
    detected_color_obj = env.readJsonColorValue(context)
    #if it is not the color sensed
    if(detected_color_obj != color_state):
        print("\t SKIPPING SCENARIO BECAUSE INCORRECT COLOR")
        context.scenario.skip("Skipping scenario because condition is not met")
        


#before action put two servos in safe config
    
    text2 = "{\"cmd\":\"setServoPos\",\"value\": 500, \"speed\":" + str(context.speed2) +", \"id\":2}"
    text3 = "{\"cmd\":\"setServoPos\",\"value\": 500, \"speed\":" + str(context.speed3) +",\"id\":3}" 
    

    
    env.writeText2SerialPort(context, text2)#2
    time.sleep(0.5)
    env.writeText2SerialPort(context, text3)#motor 3
    time.sleep(0.5)   
    
"""

