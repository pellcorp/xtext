/**
 */
package com.pellcorp.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pellcorp.mydsl.myDsl.Field#getName <em>Name</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.Field#getType <em>Type</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.Field#getDescription <em>Description</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.Field#getLower <em>Lower</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.Field#isUpperUnlimited <em>Upper Unlimited</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.Field#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
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
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.Field#getName <em>Name</em>}' attribute.
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
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.Field#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

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
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.Field#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField_Lower()
   * @model default="1"
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.Field#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Upper Unlimited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Unlimited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Unlimited</em>' attribute.
   * @see #setUpperUnlimited(boolean)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField_UpperUnlimited()
   * @model
   * @generated
   */
  boolean isUpperUnlimited();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.Field#isUpperUnlimited <em>Upper Unlimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Unlimited</em>' attribute.
   * @see #isUpperUnlimited()
   * @generated
   */
  void setUpperUnlimited(boolean value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(int)
   * @see com.pellcorp.mydsl.myDsl.MyDslPackage#getField_Upper()
   * @model default="1"
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link com.pellcorp.mydsl.myDsl.Field#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

} // Field
