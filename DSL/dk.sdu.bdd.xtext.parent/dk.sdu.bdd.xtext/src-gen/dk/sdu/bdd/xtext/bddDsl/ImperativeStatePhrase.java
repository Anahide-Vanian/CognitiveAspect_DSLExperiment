/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative State Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStatePhrase#getEpsp <em>Epsp</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStatePhrase#getEsp <em>Esp</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeStatePhrase()
 * @model
 * @generated
 */
public interface ImperativeStatePhrase extends EObject
{
  /**
   * Returns the value of the '<em><b>Epsp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Epsp</em>' containment reference.
   * @see #setEpsp(ImperativeEntityPropertyStatePhrase)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeStatePhrase_Epsp()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityPropertyStatePhrase getEpsp();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStatePhrase#getEpsp <em>Epsp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epsp</em>' containment reference.
   * @see #getEpsp()
   * @generated
   */
  void setEpsp(ImperativeEntityPropertyStatePhrase value);

  /**
   * Returns the value of the '<em><b>Esp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Esp</em>' containment reference.
   * @see #setEsp(ImperativeEntityStatePhrase)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeStatePhrase_Esp()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityStatePhrase getEsp();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeStatePhrase#getEsp <em>Esp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Esp</em>' containment reference.
   * @see #getEsp()
   * @generated
   */
  void setEsp(ImperativeEntityStatePhrase value);

} // ImperativeStatePhrase
