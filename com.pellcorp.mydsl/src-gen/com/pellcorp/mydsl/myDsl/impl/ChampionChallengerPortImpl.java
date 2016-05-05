/**
 */
package com.pellcorp.mydsl.myDsl.impl;

import com.pellcorp.mydsl.myDsl.ChampionChallengerPort;
import com.pellcorp.mydsl.myDsl.DataType;
import com.pellcorp.mydsl.myDsl.MyDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Champion Challenger Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerPortImpl#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampionChallengerPortImpl extends MinimalEObjectImpl.Container implements ChampionChallengerPort
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type;

  /**
   * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPercentage()
   * @generated
   * @ordered
   */
  protected static final int PERCENTAGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPercentage()
   * @generated
   * @ordered
   */
  protected int percentage = PERCENTAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChampionChallengerPortImpl()
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
    return MyDslPackage.Literals.CHAMPION_CHALLENGER_PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER_PORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (DataType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.CHAMPION_CHALLENGER_PORT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    DataType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER_PORT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPercentage()
  {
    return percentage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPercentage(int newPercentage)
  {
    int oldPercentage = percentage;
    percentage = newPercentage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER_PORT__PERCENTAGE, oldPercentage, percentage));
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
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__NAME:
        return getName();
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__PERCENTAGE:
        return getPercentage();
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
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__TYPE:
        setType((DataType)newValue);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__PERCENTAGE:
        setPercentage((Integer)newValue);
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
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__TYPE:
        setType((DataType)null);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__PERCENTAGE:
        setPercentage(PERCENTAGE_EDEFAULT);
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
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__TYPE:
        return type != null;
      case MyDslPackage.CHAMPION_CHALLENGER_PORT__PERCENTAGE:
        return percentage != PERCENTAGE_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", percentage: ");
    result.append(percentage);
    result.append(')');
    return result.toString();
  }

} //ChampionChallengerPortImpl
