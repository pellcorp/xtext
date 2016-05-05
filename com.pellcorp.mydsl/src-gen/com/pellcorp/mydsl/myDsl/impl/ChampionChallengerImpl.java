/**
 */
package com.pellcorp.mydsl.myDsl.impl;

import com.pellcorp.mydsl.myDsl.ChampionChallenger;
import com.pellcorp.mydsl.myDsl.ChampionChallengerPort;
import com.pellcorp.mydsl.myDsl.MyDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Champion Challenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl#getChampionPort <em>Champion Port</em>}</li>
 *   <li>{@link com.pellcorp.mydsl.myDsl.impl.ChampionChallengerImpl#getChallengerPorts <em>Challenger Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampionChallengerImpl extends MinimalEObjectImpl.Container implements ChampionChallenger
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getChampionPort() <em>Champion Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChampionPort()
   * @generated
   * @ordered
   */
  protected ChampionChallengerPort championPort;

  /**
   * The cached value of the '{@link #getChallengerPorts() <em>Challenger Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChallengerPorts()
   * @generated
   * @ordered
   */
  protected EList<ChampionChallengerPort> challengerPorts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChampionChallengerImpl()
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
    return MyDslPackage.Literals.CHAMPION_CHALLENGER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChampionChallengerPort getChampionPort()
  {
    return championPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChampionPort(ChampionChallengerPort newChampionPort, NotificationChain msgs)
  {
    ChampionChallengerPort oldChampionPort = championPort;
    championPort = newChampionPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT, oldChampionPort, newChampionPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChampionPort(ChampionChallengerPort newChampionPort)
  {
    if (newChampionPort != championPort)
    {
      NotificationChain msgs = null;
      if (championPort != null)
        msgs = ((InternalEObject)championPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT, null, msgs);
      if (newChampionPort != null)
        msgs = ((InternalEObject)newChampionPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT, null, msgs);
      msgs = basicSetChampionPort(newChampionPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT, newChampionPort, newChampionPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChampionChallengerPort> getChallengerPorts()
  {
    if (challengerPorts == null)
    {
      challengerPorts = new EObjectContainmentEList<ChampionChallengerPort>(ChampionChallengerPort.class, this, MyDslPackage.CHAMPION_CHALLENGER__CHALLENGER_PORTS);
    }
    return challengerPorts;
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
      case MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT:
        return basicSetChampionPort(null, msgs);
      case MyDslPackage.CHAMPION_CHALLENGER__CHALLENGER_PORTS:
        return ((InternalEList<?>)getChallengerPorts()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CHAMPION_CHALLENGER__NAME:
        return getName();
      case MyDslPackage.CHAMPION_CHALLENGER__DESCRIPTION:
        return getDescription();
      case MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT:
        return getChampionPort();
      case MyDslPackage.CHAMPION_CHALLENGER__CHALLENGER_PORTS:
        return getChallengerPorts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CHAMPION_CHALLENGER__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT:
        setChampionPort((ChampionChallengerPort)newValue);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER__CHALLENGER_PORTS:
        getChallengerPorts().clear();
        getChallengerPorts().addAll((Collection<? extends ChampionChallengerPort>)newValue);
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
      case MyDslPackage.CHAMPION_CHALLENGER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT:
        setChampionPort((ChampionChallengerPort)null);
        return;
      case MyDslPackage.CHAMPION_CHALLENGER__CHALLENGER_PORTS:
        getChallengerPorts().clear();
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
      case MyDslPackage.CHAMPION_CHALLENGER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.CHAMPION_CHALLENGER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyDslPackage.CHAMPION_CHALLENGER__CHAMPION_PORT:
        return championPort != null;
      case MyDslPackage.CHAMPION_CHALLENGER__CHALLENGER_PORTS:
        return challengerPorts != null && !challengerPorts.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ChampionChallengerImpl
