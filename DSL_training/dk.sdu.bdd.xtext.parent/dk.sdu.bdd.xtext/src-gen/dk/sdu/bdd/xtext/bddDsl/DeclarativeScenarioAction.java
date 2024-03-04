/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative Scenario Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioAction#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeScenarioAction()
 * @model
 * @generated
 */
public interface DeclarativeScenarioAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.bdd.xtext.bddDsl.DeclarativeActionPhrase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeScenarioAction_Actions()
   * @model containment="true"
   * @generated
   */
  EList<DeclarativeActionPhrase> getActions();

} // DeclarativeScenarioAction