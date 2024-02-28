


def readFile():

    scenarioCounter = 0
    with open('../sample.bdd') as f:
        fileWriter = open("../features/tests.feature","w")
        content = f.readlines()
        disallowedStrings = ['actions','states', 'properties','}' ,'/*','*/', "which means", '//', 'declarative', 'imperative', 'model'  ]
        for i in range(0,len(content)):
            if scenarioCounter == 10: #10 scenarios max
                break
            line = content[i]
            if any(x in line for x in disallowedStrings):
                pass
            elif(line.startswith('Scenario:') and scenarioCounter  == 0):#first scenario
                scenarioCounter += 1
                
                scenario = line.replace('"',"").replace("Scenario: ","")
                s = "Feature: " + "Our Feature"
                fileWriter.write(s)
                
                s = '\n'+ line #write it again 
                fileWriter.write(s)
            else:
                
                fileWriter.write(line)
        fileWriter.close()



"""

def readFile():

    scenarioCounter = 0
    with open('../sample.bdd') as f:
        fileWriter = open("../features/tests.feature","w")
        content = f.readlines()
        disallowedStrings = ['actions','states', 'properties','}' ,'/*','*/', "which means", '//', 'declarative', 'imperative', 'model'  ]
        for i in range(0,len(content)):
            if scenarioCounter == 2:
                break
            line = content[i]
            if any(x in line for x in disallowedStrings):
                pass
            elif(line.startswith('Scenario:')):
                scenarioCounter += 1
                if(scenarioCounter == 2):
                    break
                scenario = line.replace('"',"").replace("Scenario: ","")
                s = "Feature: " + scenario
                fileWriter.write(s)
            elif(line.startswith('Given') |line.startswith('When') | line.startswith('Then') ):
                
                s = '\n'+'\tScenario: '+ line
                fileWriter.write(s)
            else:
                
                fileWriter.write(line)
        fileWriter.close()
"""