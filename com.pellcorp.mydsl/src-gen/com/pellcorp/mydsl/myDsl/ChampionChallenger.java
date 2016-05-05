/**
 */
package com.pellcorp.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Champion Challenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getName <em>Name</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getDescription <em>Description</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getChampionPort <em>Champion Port</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getChallengerPorts <em>Challenger Ports</em>}</li>
 * </ul>
 *
 * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallenger()
 * @model
 * @generated
 */
public interface ChampionChallenger extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallenger_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallenger_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Champion Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Champion Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Champion Port</em>' containment reference.
   * @see #setChampionPort(ChampionChallengerPort)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallenger_ChampionPort()
   * @model containment="true"
   * @generated
   */
  ChampionChallengerPort getChampionPort();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getChampionPort <em>Champion Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Champion Port</em>' containment reference.
   * @see #getChampionPort()
   * @generated
   */
  void setChampionPort(ChampionChallengerPort value);

  /**
   * Returns the value of the '<em><b>Challenger Ports</b></em>' containment reference list.
   * The list contents are of type {@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Challenger Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Challenger Ports</em>' containment reference list.
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallenger_ChallengerPorts()
   * @model containment="true"
   * @generated
   */
  EList<ChampionChallengerPort> getChallengerPorts();

} // ChampionChallenger
