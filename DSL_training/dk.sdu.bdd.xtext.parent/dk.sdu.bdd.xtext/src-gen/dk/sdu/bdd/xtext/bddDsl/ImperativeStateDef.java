/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative State Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStateDef#getPostive <em>Postive</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStateDef#getNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeStateDef()
 * @model
 * @generated
 */
public interface ImperativeStateDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Postive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postive</em>' containment reference.
   * @see #setPostive(ImperativeStateName)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeStateDef_Postive()
   * @model containment="true"
   * @generated
   */
  ImperativeStateName getPostive();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStateDef#getPostive <em>Postive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postive</em>' containment reference.
   * @see #getPostive()
   * @generated
   */
  void setPostive(ImperativeStateName value);

  /**
   * Returns the value of the '<em><b>Negative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative</em>' containment reference.
   * @see #setNegative(ImperativeStateName)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeStateDef_Negative()
   * @model containment="true"
   * @generated
   */
  ImperativeStateName getNegative();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStateDef#getNegative <em>Negative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative</em>' containment reference.
   * @see #getNegative()
   * @generated
   */
  void setNegative(ImperativeStateName value);

} // ImperativeStateDef