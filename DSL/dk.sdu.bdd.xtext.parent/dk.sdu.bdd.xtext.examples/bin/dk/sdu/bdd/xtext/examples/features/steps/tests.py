from behave import when, given, then
import time
import environment as env 
import os
import json
#modif


@given(u'the position of the robot "{identifier}" is "{position}"')
def step_impl(context, identifier : str, position):
    
    angle1 = env.askArduinoMotorValues(context, 1)#value motor1
    angle2 = env.askArduinoMotorValues(context, 2)#value motor2
    angle3 = env.askArduinoMotorValues(context, 3)#value motor3
    angle4 = env.askArduinoMotorValues(context, 4)#value motor3
    
    #check if we are in the right position    
    angle_values = env.position2MotorValues(position)
    target_angle1 = angle_values[0]
    target_angle2 = angle_values[1]
    target_angle3 = angle_values[2]
    target_angle4 = angle_values[3]
    
    #move to the right position 
    if (target_angle1 != angle1):#check first angle
        text = "{\"cmd\": \"setServoPos\",\"value\":" + str(target_angle1) + ", \"speed\":500, \"id\":1}"
        env.writeText2SerialPort(context, text)
            
    #move to the right position 
    if (target_angle2 != angle2):#check first angle
        text = "{\"cmd\": \"setServoPos\",\"value\":" + str(target_angle2) + ", \"speed\":500, \"id\":2}"
        env.writeText2SerialPort(context, text)
    
    #move to the right position 
    if (target_angle3 != angle3):#check first angle
        text = "{\"cmd\": \"setServoPos\",\"value\":" + str(target_angle3) + ", \"speed\":500, \"id\":3}"
        env.writeText2SerialPort(context, text)
        
    #move to the right position 
    if (target_angle4 != angle4):#check first angle
        text = "{\"cmd\": \"setServoPos\",\"value\":" + str(target_angle4) + ", \"speed\":500, \"id\":4}"
        env.writeText2SerialPort(context, text)
    

@given(u'the magnet "{identifier}" is {state}') 
def step_impl(context, identifier : str, state):
    
    pass 

    """
    #we want the relay value
    relayValue = env.askArduinoRelayValue(context)
    
    if (relayValue != state ):#check if magnet is in the correct state mode, otherwise change 
        if(state == "ON" ):#check if magnet "ON" otherwise activates the magnet
            text = "{\"cmd\":\"setRelay\",\"value\":true}"
            env.writeText2SerialPort(context, text)
            
        elif (state == "OFF" ):#check if magnet "ON" otherwise activates the magnet
            #print('The magnet is OFF')
            text = "{\"cmd\":\"setRelay\",\"value\":false}"
            env.writeText2SerialPort(context, text)
            
    """


@when(u'the magnet "{identifier}" {action}')
def step_impl(context, identifier : str, action):
    if (action == "activates"):#we activate the magnet
        text = "{\"cmd\":\"setRelay\",\"value\":true}"
        env.writeText2SerialPort(context, text)
    
    elif (action == "deactivates"):#we deactivate the magnet
        text = "{\"cmd\":\"setRelay\",\"value\":false}"
        env.writeText2SerialPort(context, text)


@when('the robot "{identifier}" moves to position "{position}"')
def step_when(context, identifier : str, position):
    
    speed1 = 100
    speed2 = 100
    speed3 = 100
    speed4 = 10
    
    
    angle_values = env.position2MotorValues(position)
    angle1 = str(angle_values[0])
    angle2 = str(angle_values[1])
    angle3 = str(angle_values[2])
    angle4 = str(angle_values[3])
    
    #move the robot
    text1 = "{\"cmd\":\"begin\”}" 
    text2 = "{\"cmd\": \"setServoPos\",\"value\": " + angle1 + ", \"speed\":" + str(speed1) +", \"id\":1}"
    text3 = "{\"cmd\":\"setServoPos\",\"value\": " + angle2 + ",  \"speed\":" + str(speed2) +", \"id\":2}"
    text4 = "{\"cmd\":\"setServoPos\",\"value\": " + angle3 + ",  \"speed\":" + str(speed3) +",\"id\":3}" 
    text5 = "{\"cmd\":\"setServoPos\",\"value\": " + angle4 + ",  \"speed\":" + str(speed4) +",\"id\":4}"
    text6 = "{\"cmd\":\"end\”}"
    
    env.writeText2SerialPort(context, text1)
    time.sleep(1)
    env.writeText2SerialPort(context, text3)#motor 2 first to avoid collision 
    time.sleep(1)
    env.writeText2SerialPort(context, text2)
    time.sleep(1)
    env.writeText2SerialPort(context, text4)
    time.sleep(1)
    env.writeText2SerialPort(context, text5)
    time.sleep(1)
    env.writeText2SerialPort(context, text6)
    time.sleep(1)
    #print('The robot %s moves to position %s' %(identifier, str(position))) 
    

    

@then(u'the object "{identifier}" is {state}')
@given(u'the object "{identifier}" is {state}')
def step_impl(context, identifier : str, state):

       
    #state related to color
    if(state == "green" or state == "red" or state == "blue"):
        if(context.obj_color == state): #check if the color of the object 
            pass
        else :
            pass
            #raise NotImplementedError('The color of object %s is %s but the sensor detected %s)' %(identifier, state, context.obj_color))
         
    elif(state == "assembled" or state == "sorted" or state == "sensed" ):#check that the object is place in zoneA, here only prints message and not checking 
        print(('The object %s is %s !' %(identifier, state)))


@when(u'the sensor "Sensor" scans')
#@when(u'the sensor "{identifier}" {action} the object "{identifier2}"')
def step_impl(context):
    
    state = "ON"
    #we want the relay value
    relayValue = env.askArduinoRelayValue(context)
    
    if (relayValue != state ):#check if magnet is in the correct state mode, otherwise change 
        if(state == "ON" ):#check if magnet "ON" otherwise activates the magnet
            text = "{\"cmd\":\"setRelay\",\"value\":true}"
            env.writeText2SerialPort(context, text)
            
        elif (state == "OFF" ):#check if magnet "ON" otherwise activates the magnet
            #print('The magnet is OFF')
            text = "{\"cmd\":\"setRelay\",\"value\":false}"
            env.writeText2SerialPort(context, text)
    """    
   
    command = "{\"cmd\": \"getColor\"}"
    env.writeText2SerialPort(context, command)
    # Read the response from the serial port
    json_response = env.readTextFromSerialPort(context)

    
    # Convert the JSON response to a Python dictionary
    response_dict = json.loads(json_response)

    # Extract the "value" from the response
    r_value = response_dict.get("r")
    g_value = response_dict.get("g")
    b_value = response_dict.get("b")
    if(r_value > g_value and r_value > b_value):
        context.obj_color = "red"
    elif(g_value > r_value and g_value > b_value):
        context.obj_color = "green"
    elif(b_value > r_value and b_value > g_value):
        context.obj_color = "blue"

    
    ///////////////////////
    if (action == "scans"):
        #we ask Arduino the color
        object_color_str = env.askArduinoColor(context)
        #we save the value in the global variable
        context.obj_color = object_color_str
    
    """
        
        
    


"""

@given(u'the object "{identifier}" is {state}')
@then(u'the object "{identifier}" is {state}')
def step_impl(context, identifier : str, state):
    if(state == "present"):
        print('The object %s is %s' %( identifier, state))
         
    elif(state == "green" ):#check that the object is place in zoneA, here only prints message and not checking 
        text = "{\"cmd\":\"getColor\"}\n"
        env.writeText2SerialPort(context, text)
        env.readTextFromSerialPort(context)


@when(u'the sensor "{identifier}" {action}')
def step_impl(context, identifier : str, action):
    if(action == "detects" ):#function for activating the detection form the sensor
        print('The "ColorSensor" detects')


@given(u'the magnet "{identifier}" is {state}') 
@then(u'the magnet "{identifier}" is {state}') 
def step_impl(context, identifier : str, state):
    if(state == "ON" ):#check if magnet "ON" otherwise activates the magnet
        #print('The magnet is ON')
        text = "{\"cmd\":\"setRelay\",\"value\":true}"
        env.writeText2SerialPort(context, text)
        
    elif (state == "OFF" ):#check if magnet "ON" otherwise activates the magnet
        #print('The magnet is OFF')
        text = "{\"cmd\":\"setRelay\",\"value\":false}"
        env.writeText2SerialPort(context, text)



@when(u'the magnet "{identifier}" {action}')
def step_impl(context, identifier : str, action):
    if (action == "activates"):#we activate the magnet
        #print('The magnet activates')
        text = "{\"cmd\":\"setRelay\",\"value\":true}"
        env.writeText2SerialPort(context, text)


@given(u'the signal of the button "{identifier}" is {state}') 
def step_impl(context, identifier : str, state):
    if (state == "ON"):#we activate the magnet
        print('The button "ready" is ON')


#for verifying the position of the robot is correct, otherwise we move or stop program
@given(u'the position of the robot "{identifier}" is "{position}"')
@then(u'the position of the robot "{identifier}" is "{position}"')
def step_impl(context, identifier : str, position):
    #if actual_position == position, print otherwise stop
    #print(' The position of the robot %s is %s' %(identifier, str(position))) 
    text = "{\"cmd\":\"getServoPos\",\"id\":1}"
    env.writeText2SerialPort(context, text)
    env.readTextFromSerialPort(context) 
    
    

@when('the robot "{identifier}" moves to position "{position}"')
def step_when(context, identifier : str, position):
    #move the robot
    text = "{\"cmd\":\"setServoPos\",\"value\":460,\"time\":500, \"id\":1}"
    env.writeText2SerialPort(context, text)
    #print('The robot %s moves to position %s' %(identifier, str(position))) 
    
"""