/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.ImperativeActionDef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.ImperativePropertyRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Entity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityActionImpl#getEntityAction <em>Entity Action</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityActionImpl#getAdverb <em>Adverb</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityActionImpl#getActionDef <em>Action Def</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityActionImpl#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeEntityActionImpl extends ImperativeActionPhraseImpl implements ImperativeEntityAction
{
  /**
   * The cached value of the '{@link #getEntityAction() <em>Entity Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityAction()
   * @generated
   * @ordered
   */
  protected ImperativeEntityRef entityAction;

  /**
   * The default value of the '{@link #getAdverb() <em>Adverb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdverb()
   * @generated
   * @ordered
   */
  protected static final String ADVERB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdverb() <em>Adverb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdverb()
   * @generated
   * @ordered
   */
  protected String adverb = ADVERB_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionDef() <em>Action Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionDef()
   * @generated
   * @ordered
   */
  protected ImperativeActionDef actionDef;

  /**
   * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyRef()
   * @generated
   * @ordered
   */
  protected ImperativePropertyRef propertyRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImperativeEntityActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeEntityRef getEntityAction()
  {
    return entityAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityAction(ImperativeEntityRef newEntityAction, NotificationChain msgs)
  {
    ImperativeEntityRef oldEntityAction = entityAction;
    entityAction = newEntityAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION, oldEntityAction, newEntityAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntityAction(ImperativeEntityRef newEntityAction)
  {
    if (newEntityAction != entityAction)
    {
      NotificationChain msgs = null;
      if (entityAction != null)
        msgs = ((InternalEObject)entityAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION, null, msgs);
      if (newEntityAction != null)
        msgs = ((InternalEObject)newEntityAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION, null, msgs);
      msgs = basicSetEntityAction(newEntityAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION, newEntityAction, newEntityAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAdverb()
  {
    return adverb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAdverb(String newAdverb)
  {
    String oldAdverb = adverb;
    adverb = newAdverb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_ACTION__ADVERB, oldAdverb, adverb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeActionDef getActionDef()
  {
    if (actionDef != null && actionDef.eIsProxy())
    {
      InternalEObject oldActionDef = (InternalEObject)actionDef;
      actionDef = (ImperativeActionDef)eResolveProxy(oldActionDef);
      if (actionDef != oldActionDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BddDslPackage.IMPERATIVE_ENTITY_ACTION__ACTION_DEF, oldActionDef, actionDef));
      }
    }
    return actionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperativeActionDef basicGetActionDef()
  {
    return actionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActionDef(ImperativeActionDef newActionDef)
  {
    ImperativeActionDef oldActionDef = actionDef;
    actionDef = newActionDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_ACTION__ACTION_DEF, oldActionDef, actionDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativePropertyRef getPropertyRef()
  {
    return propertyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyRef(ImperativePropertyRef newPropertyRef, NotificationChain msgs)
  {
    ImperativePropertyRef oldPropertyRef = propertyRef;
    propertyRef = newPropertyRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF, oldPropertyRef, newPropertyRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPropertyRef(ImperativePropertyRef newPropertyRef)
  {
    if (newPropertyRef != propertyRef)
    {
      NotificationChain msgs = null;
      if (propertyRef != null)
        msgs = ((InternalEObject)propertyRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF, null, msgs);
      if (newPropertyRef != null)
        msgs = ((InternalEObject)newPropertyRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF, null, msgs);
      msgs = basicSetPropertyRef(newPropertyRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF, newPropertyRef, newPropertyRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION:
        return basicSetEntityAction(null, msgs);
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF:
        return basicSetPropertyRef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION:
        return getEntityAction();
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ADVERB:
        return getAdverb();
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ACTION_DEF:
        if (resolve) return getActionDef();
        return basicGetActionDef();
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF:
        return getPropertyRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION:
        setEntityAction((ImperativeEntityRef)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ADVERB:
        setAdverb((String)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ACTION_DEF:
        setActionDef((ImperativeActionDef)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF:
        setPropertyRef((ImperativePropertyRef)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION:
        setEntityAction((ImperativeEntityRef)null);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ADVERB:
        setAdverb(ADVERB_EDEFAULT);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ACTION_DEF:
        setActionDef((ImperativeActionDef)null);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF:
        setPropertyRef((ImperativePropertyRef)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ENTITY_ACTION:
        return entityAction != null;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ADVERB:
        return ADVERB_EDEFAULT == null ? adverb != null : !ADVERB_EDEFAULT.equals(adverb);
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__ACTION_DEF:
        return actionDef != null;
      case BddDslPackage.IMPERATIVE_ENTITY_ACTION__PROPERTY_REF:
        return propertyRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (adverb: ");
    result.append(adverb);
    result.append(')');
    return result.toString();
  }

} //ImperativeEntityActionImpl
