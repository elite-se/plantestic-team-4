/**
 */
package de.unia.se.plantestic.generated.impl;

import de.unia.se.plantestic.generated.ConfigmetamodelPackage;
import de.unia.se.plantestic.generated.ResponseParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link configmetamodel.impl.ResponseParameterImpl#getResponseVariableName <em>Response Variable Name</em>}</li>
 *   <li>{@link configmetamodel.impl.ResponseParameterImpl#getXPath <em>XPath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseParameterImpl extends MinimalEObjectImpl.Container implements ResponseParameter {
	/**
	 * The default value of the '{@link #getResponseVariableName() <em>Response Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseVariableName() <em>Response Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseVariableName()
	 * @generated
	 * @ordered
	 */
	protected String responseVariableName = RESPONSE_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPath() <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPath()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPath() <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPath()
	 * @generated
	 * @ordered
	 */
	protected String xPath = XPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmetamodelPackage.Literals.RESPONSE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseVariableName() {
		return responseVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseVariableName(String newResponseVariableName) {
		String oldResponseVariableName = responseVariableName;
		responseVariableName = newResponseVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME, oldResponseVariableName, responseVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXPath() {
		return xPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXPath(String newXPath) {
		String oldXPath = xPath;
		xPath = newXPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.RESPONSE_PARAMETER__XPATH, oldXPath, xPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME:
				return getResponseVariableName();
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__XPATH:
				return getXPath();
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
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME:
				setResponseVariableName((String)newValue);
				return;
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__XPATH:
				setXPath((String)newValue);
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
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME:
				setResponseVariableName(RESPONSE_VARIABLE_NAME_EDEFAULT);
				return;
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__XPATH:
				setXPath(XPATH_EDEFAULT);
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
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME:
				return RESPONSE_VARIABLE_NAME_EDEFAULT == null ? responseVariableName != null : !RESPONSE_VARIABLE_NAME_EDEFAULT.equals(responseVariableName);
			case ConfigmetamodelPackage.RESPONSE_PARAMETER__XPATH:
				return XPATH_EDEFAULT == null ? xPath != null : !XPATH_EDEFAULT.equals(xPath);
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
		result.append(" (responseVariableName: ");
		result.append(responseVariableName);
		result.append(", xPath: ");
		result.append(xPath);
		result.append(')');
		return result.toString();
	}

} //ResponseParameterImpl
