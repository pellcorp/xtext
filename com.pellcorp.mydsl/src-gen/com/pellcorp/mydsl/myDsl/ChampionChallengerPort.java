/**
 */
package com.pellcorp.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Champion Challenger Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getName <em>Name</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getType <em>Type</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallengerPort()
 * @model
 * @generated
 */
public interface ChampionChallengerPort extends EObject
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
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallengerPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DataType)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallengerPort_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percentage</em>' attribute.
   * @see #setPercentage(int)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getChampionChallengerPort_Percentage()
   * @model
   * @generated
   */
  int getPercentage();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getPercentage <em>Percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percentage</em>' attribute.
   * @see #getPercentage()
   * @generated
   */
  void setPercentage(int value);

} // ChampionChallengerPort
