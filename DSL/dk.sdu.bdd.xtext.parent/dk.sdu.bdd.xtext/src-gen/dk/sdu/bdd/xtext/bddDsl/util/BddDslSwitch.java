/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl.util;

import dk.sdu.bdd.xtext.bddDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage
 * @generated
 */
public class BddDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BddDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BddDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BddDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BddDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.MODEL_REF:
      {
        ModelRef modelRef = (ModelRef)theEObject;
        T result = caseModelRef(modelRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ENTITY_DEF:
      {
        DeclarativeEntityDef declarativeEntityDef = (DeclarativeEntityDef)theEObject;
        T result = caseDeclarativeEntityDef(declarativeEntityDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ENTITY_DEF:
      {
        ImperativeEntityDef imperativeEntityDef = (ImperativeEntityDef)theEObject;
        T result = caseImperativeEntityDef(imperativeEntityDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ACTION_DEF:
      {
        ImperativeActionDef imperativeActionDef = (ImperativeActionDef)theEObject;
        T result = caseImperativeActionDef(imperativeActionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ACTION_DEF:
      {
        ActionDef actionDef = (ActionDef)theEObject;
        T result = caseActionDef(actionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STATE_DEF:
      {
        StateDef stateDef = (StateDef)theEObject;
        T result = caseStateDef(stateDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STATE_NAME:
      {
        StateName stateName = (StateName)theEObject;
        T result = caseStateName(stateName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.PROPERTY_DEF:
      {
        PropertyDef propertyDef = (PropertyDef)theEObject;
        T result = casePropertyDef(propertyDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_STATE_DEF:
      {
        ImperativeStateDef imperativeStateDef = (ImperativeStateDef)theEObject;
        T result = caseImperativeStateDef(imperativeStateDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_STATE_NAME:
      {
        ImperativeStateName imperativeStateName = (ImperativeStateName)theEObject;
        T result = caseImperativeStateName(imperativeStateName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_PROPERTY_DEF:
      {
        ImperativePropertyDef imperativePropertyDef = (ImperativePropertyDef)theEObject;
        T result = caseImperativePropertyDef(imperativePropertyDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_SCENARIO:
      {
        ImperativeScenario imperativeScenario = (ImperativeScenario)theEObject;
        T result = caseImperativeScenario(imperativeScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE:
      {
        DeclarativeScenarioState declarativeScenarioState = (DeclarativeScenarioState)theEObject;
        T result = caseDeclarativeScenarioState(declarativeScenarioState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_SCENARIO_STATE:
      {
        ImperativeScenarioState imperativeScenarioState = (ImperativeScenarioState)theEObject;
        T result = caseImperativeScenarioState(imperativeScenarioState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_SCENARIO_ACTION:
      {
        DeclarativeScenarioAction declarativeScenarioAction = (DeclarativeScenarioAction)theEObject;
        T result = caseDeclarativeScenarioAction(declarativeScenarioAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_SCENARIO_ACTION:
      {
        ImperativeScenarioAction imperativeScenarioAction = (ImperativeScenarioAction)theEObject;
        T result = caseImperativeScenarioAction(imperativeScenarioAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_STATE_PHRASE:
      {
        DeclarativeStatePhrase declarativeStatePhrase = (DeclarativeStatePhrase)theEObject;
        T result = caseDeclarativeStatePhrase(declarativeStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_STATE_PHRASE:
      {
        ImperativeStatePhrase imperativeStatePhrase = (ImperativeStatePhrase)theEObject;
        T result = caseImperativeStatePhrase(imperativeStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ENTITY_REF:
      {
        DeclarativeEntityRef declarativeEntityRef = (DeclarativeEntityRef)theEObject;
        T result = caseDeclarativeEntityRef(declarativeEntityRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ENTITY_REF:
      {
        ImperativeEntityRef imperativeEntityRef = (ImperativeEntityRef)theEObject;
        T result = caseImperativeEntityRef(imperativeEntityRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE:
      {
        DeclarativeEntityStatePhrase declarativeEntityStatePhrase = (DeclarativeEntityStatePhrase)theEObject;
        T result = caseDeclarativeEntityStatePhrase(declarativeEntityStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ENTITY_STATE_PHRASE:
      {
        ImperativeEntityStatePhrase imperativeEntityStatePhrase = (ImperativeEntityStatePhrase)theEObject;
        T result = caseImperativeEntityStatePhrase(imperativeEntityStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ENTITY_PROPERTY_STATE_PHRASE:
      {
        DeclarativeEntityPropertyStatePhrase declarativeEntityPropertyStatePhrase = (DeclarativeEntityPropertyStatePhrase)theEObject;
        T result = caseDeclarativeEntityPropertyStatePhrase(declarativeEntityPropertyStatePhrase);
        if (result == null) result = caseDeclarativeStatePhrase(declarativeEntityPropertyStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE:
      {
        ImperativeEntityPropertyStatePhrase imperativeEntityPropertyStatePhrase = (ImperativeEntityPropertyStatePhrase)theEObject;
        T result = caseImperativeEntityPropertyStatePhrase(imperativeEntityPropertyStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SIMPLE_VALUE:
      {
        SimpleValue simpleValue = (SimpleValue)theEObject;
        T result = caseSimpleValue(simpleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseSimpleValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseSimpleValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DOUBLE_VALUE:
      {
        DoubleValue doubleValue = (DoubleValue)theEObject;
        T result = caseDoubleValue(doubleValue);
        if (result == null) result = caseSimpleValue(doubleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ACTION_PHRASE:
      {
        DeclarativeActionPhrase declarativeActionPhrase = (DeclarativeActionPhrase)theEObject;
        T result = caseDeclarativeActionPhrase(declarativeActionPhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ACTION_PHRASE:
      {
        ImperativeActionPhrase imperativeActionPhrase = (ImperativeActionPhrase)theEObject;
        T result = caseImperativeActionPhrase(imperativeActionPhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.VERB_ACTION:
      {
        VerbAction verbAction = (VerbAction)theEObject;
        T result = caseVerbAction(verbAction);
        if (result == null) result = caseDeclarativeActionPhrase(verbAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ENTITY_ACTION:
      {
        DeclarativeEntityAction declarativeEntityAction = (DeclarativeEntityAction)theEObject;
        T result = caseDeclarativeEntityAction(declarativeEntityAction);
        if (result == null) result = caseDeclarativeActionPhrase(declarativeEntityAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION:
      {
        ImperativeEntityAction imperativeEntityAction = (ImperativeEntityAction)theEObject;
        T result = caseImperativeEntityAction(imperativeEntityAction);
        if (result == null) result = caseImperativeActionPhrase(imperativeEntityAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.PROPERTY_REF:
      {
        PropertyRef propertyRef = (PropertyRef)theEObject;
        T result = casePropertyRef(propertyRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.IMPERATIVE_PROPERTY_REF:
      {
        ImperativePropertyRef imperativePropertyRef = (ImperativePropertyRef)theEObject;
        T result = caseImperativePropertyRef(imperativePropertyRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.DECLARATIVE_ACTION_REF:
      {
        DeclarativeActionRef declarativeActionRef = (DeclarativeActionRef)theEObject;
        T result = caseDeclarativeActionRef(declarativeActionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelRef(ModelRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Entity Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Entity Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeEntityDef(DeclarativeEntityDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Entity Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Entity Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeEntityDef(ImperativeEntityDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Action Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Action Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeActionDef(ImperativeActionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDef(ActionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDef(StateDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateName(StateName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDef(PropertyDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative State Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative State Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeStateDef(ImperativeStateDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative State Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative State Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeStateName(ImperativeStateName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Property Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Property Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativePropertyDef(ImperativePropertyDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeScenario(ImperativeScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Scenario State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Scenario State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeScenarioState(DeclarativeScenarioState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Scenario State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Scenario State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeScenarioState(ImperativeScenarioState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Scenario Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Scenario Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeScenarioAction(DeclarativeScenarioAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Scenario Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Scenario Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeScenarioAction(ImperativeScenarioAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeStatePhrase(DeclarativeStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeStatePhrase(ImperativeStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Entity Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Entity Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeEntityRef(DeclarativeEntityRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Entity Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Entity Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeEntityRef(ImperativeEntityRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Entity State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Entity State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeEntityStatePhrase(DeclarativeEntityStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Entity State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Entity State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeEntityStatePhrase(ImperativeEntityStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Entity Property State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Entity Property State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeEntityPropertyStatePhrase(DeclarativeEntityPropertyStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Entity Property State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Entity Property State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeEntityPropertyStatePhrase(ImperativeEntityPropertyStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleValue(SimpleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleValue(DoubleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Action Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Action Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeActionPhrase(DeclarativeActionPhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Action Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Action Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeActionPhrase(ImperativeActionPhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verb Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verb Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerbAction(VerbAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Entity Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Entity Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeEntityAction(DeclarativeEntityAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Entity Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Entity Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativeEntityAction(ImperativeEntityAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyRef(PropertyRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperative Property Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperative Property Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperativePropertyRef(ImperativePropertyRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Action Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Action Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeActionRef(DeclarativeActionRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BddDslSwitch
