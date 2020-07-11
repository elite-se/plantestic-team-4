/**
 */
package Configmetamodel.impl;

import Configmetamodel.ConfigmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Configmetamodel.impl.RequestParameterImpl#getRequestVariableName <em>Request Variable Name</em>}</li>
 *   <li>{@link Configmetamodel.impl.RequestParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestParameterImpl extends MinimalEObjectImpl.Container implements RequestParameterImpl {
	/**
	 * The default value of the '{@link #getRequestVariableName() <em>Request Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestVariableName() <em>Request Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestVariableName()
	 * @generated
	 * @ordered
	 */
	protected String requestVariableName = REQUEST_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmetamodelPackage.Literals.REQUEST_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestVariableName() {
		return requestVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestVariableName(String newRequestVariableName) {
		String oldRequestVariableName = requestVariableName;
		requestVariableName = newRequestVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.REQUEST_PARAMETER__REQUEST_VARIABLE_NAME, oldRequestVariableName, requestVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.REQUEST_PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmetamodelPackage.REQUEST_PARAMETER__REQUEST_VARIABLE_NAME:
				return getRequestVariableName();
			case ConfigmetamodelPackage.REQUEST_PARAMETER__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigmetamodelPackage.REQUEST_PARAMETER__REQUEST_VARIABLE_NAME:
				setRequestVariableName((String)newValue);
				return;
			case ConfigmetamodelPackage.REQUEST_PARAMETER__VALUE:
				setValue((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigmetamodelPackage.REQUEST_PARAMETER__REQUEST_VARIABLE_NAME:
				setRequestVariableName(REQUEST_VARIABLE_NAME_EDEFAULT);
				return;
			case ConfigmetamodelPackage.REQUEST_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigmetamodelPackage.REQUEST_PARAMETER__REQUEST_VARIABLE_NAME:
				return REQUEST_VARIABLE_NAME_EDEFAULT == null ? requestVariableName != null : !REQUEST_VARIABLE_NAME_EDEFAULT.equals(requestVariableName);
			case ConfigmetamodelPackage.REQUEST_PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (requestVariableName: ");
		result.append(requestVariableName);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RequestParameterImpl
