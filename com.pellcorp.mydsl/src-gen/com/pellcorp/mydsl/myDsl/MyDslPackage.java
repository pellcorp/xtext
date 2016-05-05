/**
 */
package com.pellcorp.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.pellcorp.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.pellcorp.com/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.ModelImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DATA_TYPES = 2;

  /**
   * The feature id for the '<em><b>Built In Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BUILT_IN_TYPES = 3;

  /**
   * The feature id for the '<em><b>Hidden Built In Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HIDDEN_BUILT_IN_TYPES = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.DataTypeImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.EntityImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = DATA_TYPE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FIELDS = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.BuiltInTypeImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Built In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.FieldImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LOWER = 3;

  /**
   * The feature id for the '<em><b>Upper Unlimited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UPPER_UNLIMITED = 4;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__UPPER = 5;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl <em>Champion Challenger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getChampionChallenger()
   * @generated
   */
  int CHAMPION_CHALLENGER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Champion Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER__CHAMPION_PORT = 2;

  /**
   * The feature id for the '<em><b>Challenger Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER__CHALLENGER_PORTS = 3;

  /**
   * The number of structural features of the '<em>Champion Challenger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl <em>Champion Challenger Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl
   * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getChampionChallengerPort()
   * @generated
   */
  int CHAMPION_CHALLENGER_PORT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER_PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER_PORT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER_PORT__PERCENTAGE = 2;

  /**
   * The number of structural features of the '<em>Champion Challenger Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAMPION_CHALLENGER_PORT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.pellcorp.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.pellcorp.mydsl.myDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Model#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.pellcorp.mydsl.myDsl.Model#getDescription()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Description();

  /**
   * Returns the meta object for the containment reference list '{@link com.pellcorp.mydsl.myDsl.Model#getDataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Types</em>'.
   * @see com.pellcorp.mydsl.myDsl.Model#getDataTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DataTypes();

  /**
   * Returns the meta object for the containment reference list '{@link com.pellcorp.mydsl.myDsl.Model#getBuiltInTypes <em>Built In Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Built In Types</em>'.
   * @see com.pellcorp.mydsl.myDsl.Model#getBuiltInTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_BuiltInTypes();

  /**
   * Returns the meta object for the containment reference list '{@link com.pellcorp.mydsl.myDsl.Model#getHiddenBuiltInTypes <em>Hidden Built In Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hidden Built In Types</em>'.
   * @see com.pellcorp.mydsl.myDsl.Model#getHiddenBuiltInTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_HiddenBuiltInTypes();

  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.pellcorp.mydsl.myDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.pellcorp.mydsl.myDsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.DataType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.pellcorp.mydsl.myDsl.DataType#getDescription()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Description();

  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.pellcorp.mydsl.myDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link com.pellcorp.mydsl.myDsl.Entity#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.pellcorp.mydsl.myDsl.Entity#getFields()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Fields();

  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see com.pellcorp.mydsl.myDsl.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the reference '{@link com.pellcorp.mydsl.myDsl.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Field#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field#getDescription()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Description();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Field#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field#getLower()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Lower();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Field#isUpperUnlimited <em>Upper Unlimited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Unlimited</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field#isUpperUnlimited()
   * @see #getField()
   * @generated
   */
  EAttribute getField_UpperUnlimited();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.Field#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see com.pellcorp.mydsl.myDsl.Field#getUpper()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Upper();

  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger <em>Champion Challenger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Champion Challenger</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallenger
   * @generated
   */
  EClass getChampionChallenger();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallenger#getName()
   * @see #getChampionChallenger()
   * @generated
   */
  EAttribute getChampionChallenger_Name();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallenger#getDescription()
   * @see #getChampionChallenger()
   * @generated
   */
  EAttribute getChampionChallenger_Description();

  /**
   * Returns the meta object for the containment reference '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getChampionPort <em>Champion Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Champion Port</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallenger#getChampionPort()
   * @see #getChampionChallenger()
   * @generated
   */
  EReference getChampionChallenger_ChampionPort();

  /**
   * Returns the meta object for the containment reference list '{@link com.pellcorp.mydsl.myDsl.ChampionChallenger#getChallengerPorts <em>Challenger Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Challenger Ports</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallenger#getChallengerPorts()
   * @see #getChampionChallenger()
   * @generated
   */
  EReference getChampionChallenger_ChallengerPorts();

  /**
   * Returns the meta object for class '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort <em>Champion Challenger Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Champion Challenger Port</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallengerPort
   * @generated
   */
  EClass getChampionChallengerPort();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getName()
   * @see #getChampionChallengerPort()
   * @generated
   */
  EAttribute getChampionChallengerPort_Name();

  /**
   * Returns the meta object for the reference '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getType()
   * @see #getChampionChallengerPort()
   * @generated
   */
  EReference getChampionChallengerPort_Type();

  /**
   * Returns the meta object for the attribute '{@link com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getPercentage <em>Percentage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percentage</em>'.
   * @see com.pellcorp.mydsl.myDsl.ChampionChallengerPort#getPercentage()
   * @see #getChampionChallengerPort()
   * @generated
   */
  EAttribute getChampionChallengerPort_Percentage();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.ModelImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

    /**
     * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DATA_TYPES = eINSTANCE.getModel_DataTypes();

    /**
     * The meta object literal for the '<em><b>Built In Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BUILT_IN_TYPES = eINSTANCE.getModel_BuiltInTypes();

    /**
     * The meta object literal for the '<em><b>Hidden Built In Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HIDDEN_BUILT_IN_TYPES = eINSTANCE.getModel_HiddenBuiltInTypes();

    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.DataTypeImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__DESCRIPTION = eINSTANCE.getDataType_Description();

    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.EntityImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.BuiltInTypeImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getBuiltInType()
     * @generated
     */
    EClass BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.FieldImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__DESCRIPTION = eINSTANCE.getField_Description();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__LOWER = eINSTANCE.getField_Lower();

    /**
     * The meta object literal for the '<em><b>Upper Unlimited</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__UPPER_UNLIMITED = eINSTANCE.getField_UpperUnlimited();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__UPPER = eINSTANCE.getField_Upper();

    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl <em>Champion Challenger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getChampionChallenger()
     * @generated
     */
    EClass CHAMPION_CHALLENGER = eINSTANCE.getChampionChallenger();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAMPION_CHALLENGER__NAME = eINSTANCE.getChampionChallenger_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAMPION_CHALLENGER__DESCRIPTION = eINSTANCE.getChampionChallenger_Description();

    /**
     * The meta object literal for the '<em><b>Champion Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHAMPION_CHALLENGER__CHAMPION_PORT = eINSTANCE.getChampionChallenger_ChampionPort();

    /**
     * The meta object literal for the '<em><b>Challenger Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHAMPION_CHALLENGER__CHALLENGER_PORTS = eINSTANCE.getChampionChallenger_ChallengerPorts();

    /**
     * The meta object literal for the '{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl <em>Champion Challenger Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl
     * @see com.pellcorp.mydsl.myDsl.impl.MyDslPackageImpl#getChampionChallengerPort()
     * @generated
     */
    EClass CHAMPION_CHALLENGER_PORT = eINSTANCE.getChampionChallengerPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAMPION_CHALLENGER_PORT__NAME = eINSTANCE.getChampionChallengerPort_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHAMPION_CHALLENGER_PORT__TYPE = eINSTANCE.getChampionChallengerPort_Type();

    /**
     * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAMPION_CHALLENGER_PORT__PERCENTAGE = eINSTANCE.getChampionChallengerPort_Percentage();

  }

} //MyDslPackage
