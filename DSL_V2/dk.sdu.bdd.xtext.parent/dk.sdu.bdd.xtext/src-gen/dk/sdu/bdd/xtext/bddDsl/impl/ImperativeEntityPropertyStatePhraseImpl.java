/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.ImperativePropertyDef;
import dk.sdu.bdd.xtext.bddDsl.StringValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Entity Property State Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeEntityPropertyStatePhraseImpl extends MinimalEObjectImpl.Container implements ImperativeEntityPropertyStatePhrase
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected ImperativePropertyDef property;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected ImperativeEntityRef entity;

  /**
   * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected StringValue propertyValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImperativeEntityPropertyStatePhraseImpl()
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
    return BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativePropertyDef getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (ImperativePropertyDef)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImperativePropertyDef basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(ImperativePropertyDef newProperty)
  {
    ImperativePropertyDef oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeEntityRef getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(ImperativeEntityRef newEntity, NotificationChain msgs)
  {
    ImperativeEntityRef oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, oldEntity, newEntity);
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
  public void setEntity(ImperativeEntityRef newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue getPropertyValue()
  {
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyValue(StringValue newPropertyValue, NotificationChain msgs)
  {
    StringValue oldPropertyValue = propertyValue;
    propertyValue = newPropertyValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE, oldPropertyValue, newPropertyValue);
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
  public void setPropertyValue(StringValue newPropertyValue)
  {
    if (newPropertyValue != propertyValue)
    {
      NotificationChain msgs = null;
      if (propertyValue != null)
        msgs = ((InternalEObject)propertyValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE, null, msgs);
      if (newPropertyValue != null)
        msgs = ((InternalEObject)newPropertyValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE, null, msgs);
      msgs = basicSetPropertyValue(newPropertyValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE, newPropertyValue, newPropertyValue));
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
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return basicSetEntity(null, msgs);
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE:
        return basicSetPropertyValue(null, msgs);
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
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return getEntity();
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE:
        return getPropertyValue();
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
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        setProperty((ImperativePropertyDef)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        setEntity((ImperativeEntityRef)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE:
        setPropertyValue((StringValue)newValue);
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
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        setProperty((ImperativePropertyDef)null);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        setEntity((ImperativeEntityRef)null);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE:
        setPropertyValue((StringValue)null);
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
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        return property != null;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return entity != null;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY_VALUE:
        return propertyValue != null;
    }
    return super.eIsSet(featureID);
  }

} //ImperativeEntityPropertyStatePhraseImpl