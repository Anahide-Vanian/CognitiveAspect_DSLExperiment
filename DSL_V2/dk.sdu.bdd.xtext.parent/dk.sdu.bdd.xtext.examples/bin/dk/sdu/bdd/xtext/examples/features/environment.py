#from behave import fixture
import json
from behave.model import Scenario
#Libraries linked with Arduino 
import sys, time
import random
import serial
import io

f = open("Environment.json")
data = json.load(f)
        
def before_all(context):
    print("Setting up Environment...")
    # Send setup command to Arduino
    
    context.serial_port = "COM9"

    context.curSerial = serial.Serial(context.serial_port, 115200, timeout=1)
    
    #discarding the first data waiting to be read.
    time.sleep(10)
    context.curSerial.flushInput()
    
    #params related to the object
    context.obj_color = "None"


def before_feature(context, feature): 
    pass

def after_feature(context, feature):
    pass

def before_scenario(context, scenario): 
    pass

def after_scenario(context, scenario):
    pass


def printArduinotext(context, text):
    
    context.curSerial.write(text.encode('utf-8'))
    #time.sleep(10)
    line = context.curSerial.readline().decode('utf-8')
    line  = line + "hey"
    print(line)


def askArduinoMotorValues(context, motor_id):
    # Construct the JSON command with proper formatting
    command = {"cmd": "getServoPos", "id": motor_id}
    json_string = json.dumps(command) # Serialize into JSON string
    # Write the JSON command to the serial port
    writeText2SerialPort(context, json_string)
    
    # Read the response from the serial port
    json_response = readTextFromSerialPort(context)
    
    try:
        # Convert the JSON response to a Python dictionary
        response_dict = json.loads(json_response)
        
        # Extract the "value" from the response
        motor_value = response_dict.get("value")
        #print("motor_value", motor_value)
        return motor_value
    
    except json.decoder.JSONDecodeError as e:
        # Handle JSON decoding error
        print("Error decoding JSON:", e)
        return None
    
def askArduinoRelayValue(context):
    # Construct the JSON command with proper formatting
    command = {"cmd": "getRelayValue"} #gets state of relay
    json_string = json.dumps(command) # Serialize into JSON string
    print("json_string", json_string)
    
    # Write the JSON command to the serial port
    writeText2SerialPort(context, json_string)
    
    # Read the response from the serial port
    json_response = readTextFromSerialPort(context)

    try:
        # Convert the JSON response to a Python dictionary
        response_dict = json.loads(json_response)
        # Extract the "value" from the response
        relay_value = response_dict.get("value")
        print("relay_value", relay_value)
        return relay_value
    
    except json.decoder.JSONDecodeError as e:
        # Handle JSON decoding error
        print("Error decoding JSON:", e)
        return None
    
    
    
    
        
def askArduinoColor(context):
    # Construct the JSON command with proper formatting
    command = {"cmd": "getRelayValue"} #gets state of relay
    json_string = json.dumps(command) # Serialize into JSON string
    print("json_string", json_string)
    
    # Write the JSON command to the serial port
    writeText2SerialPort(context, json_string)
    
    # Read the response from the serial port
    json_response = readTextFromSerialPort(context)

    try:
        # Convert the JSON response to a Python dictionary
        response_dict = json.loads(json_response)
        # Extract the "value" from the response
        relay_value = response_dict.get("value")
        print("relay_value", relay_value)
        return relay_value
    
    except json.decoder.JSONDecodeError as e:
        # Handle JSON decoding error
        print("Error decoding JSON:", e)
        return None
"""
def askArduinoColor(context): 
    
    command = "{\"cmd\": \"getRelayValue\"}"
    #json_string = json.dumps(command) # Serialize into JSON string
    
    # Write the JSON command to the serial port
    #writeText2SerialPort(context, json_string)
    writeText2SerialPort(context, command)
    print("json_request", command)
    
    # Read the response from the serial port
    json_response = readTextFromSerialPort(context)
    print("json_response", json_response)
    
    try:
        # Convert the JSON response to a Python dictionary
        response_dict = json.loads(json_response)
        
        
        print("response_dict", response_dict)

        # Extract the "value" from the response
        r_value = response_dict.get("r")
        g_value = response_dict.get("g")
        b_value = response_dict.get("b")
        if(r_value > g_value and r_value > b_value):
            return "red"
        elif(g_value > r_value and g_value > b_value):
            return "green"
        elif(b_value > r_value and b_value > g_value):
            return "blue"
   
    except json.decoder.JSONDecodeError as e:
        # Handle JSON decoding error
        print("Error decoding JSON:", e)
        return None 
"""

def askArduinoColor(context):
    # Construct the JSON command with proper formatting
    command = {"cmd": "getRelayValue"} #gets state of relay
    json_string = json.dumps(command) # Serialize into JSON string
    print("json_string", json_string)
    
    # Write the JSON command to the serial port
    writeText2SerialPort(context, json_string)
    time.sleep(1)
    # Read the response from the serial port
    json_response = readTextFromSerialPort(context)

    try:
        # Convert the JSON response to a Python dictionary
        response_dict = json.loads(json_response)
        # Extract the "value" from the response
        relay_value = response_dict.get("value")
        print("relay_value", relay_value)
        return relay_value
    
    except json.decoder.JSONDecodeError as e:
        # Handle JSON decoding error
        print("Error decoding JSON:", e)
        return None


def position2MotorValues(name):
    locations = data["Positions"]
    coordinate = locations[name]

    return coordinate

def writeText2SerialPort(context, text):

    context.curSerial.write(text.encode('utf-8'))
    time.sleep(1)
    
def readTextFromSerialPort(context):
    
    #time.sleep(1)
    line = context.curSerial.readline().decode('utf-8')  
    #print(line + "endLine")
    return line
    
    



