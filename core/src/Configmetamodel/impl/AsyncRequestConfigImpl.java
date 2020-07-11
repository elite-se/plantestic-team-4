/**
 */
package Configmetamodel.impl;

import Configmetamodel.ConfigmetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async Request Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getRequestMethod <em>Request Method</em>}</li>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getRequestURL <em>Request URL</em>}</li>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getResponseStatusCode <em>Response Status Code</em>}</li>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getRequestParameter <em>Request Parameter</em>}</li>
 *   <li>{@link Configmetamodel.impl.AsyncRequestConfigImpl#getResponseParameter <em>Response Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsyncRequestConfigImpl extends MinimalEObjectImpl.Container implements AsyncRequestConfigImpl {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestMethod() <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestMethod() <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected String requestMethod = REQUEST_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestURL() <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestURL() <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestURL()
	 * @generated
	 * @ordered
	 */
	protected String requestURL = REQUEST_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseStatusCode() <em>Response Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseStatusCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_STATUS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseStatusCode() <em>Response Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseStatusCode()
	 * @generated
	 * @ordered
	 */
	protected String responseStatusCode = RESPONSE_STATUS_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestParameter() <em>Request Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestParameterImpl> requestParameter;

	/**
	 * The cached value of the '{@link #getResponseParameter() <em>Response Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseParameterImpl> responseParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsyncRequestConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmetamodelPackage.Literals.ASYNC_REQUEST_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestMethod() {
		return requestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestMethod(String newRequestMethod) {
		String oldRequestMethod = requestMethod;
		requestMethod = newRequestMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_METHOD, oldRequestMethod, requestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestURL() {
		return requestURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestURL(String newRequestURL) {
		String oldRequestURL = requestURL;
		requestURL = newRequestURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_URL, oldRequestURL, requestURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseStatusCode() {
		return responseStatusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseStatusCode(String newResponseStatusCode) {
		String oldResponseStatusCode = responseStatusCode;
		responseStatusCode = newResponseStatusCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE, oldResponseStatusCode, responseStatusCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestParameterImpl> getRequestParameter() {
		if (requestParameter == null) {
			requestParameter = new EObjectResolvingEList<RequestParameterImpl>(Object.class, this, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER);
		}
		return requestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseParameterImpl> getResponseParameter() {
		if (responseParameter == null) {
			responseParameter = new EObjectResolvingEList<ResponseParameterImpl>(Object.class, this, ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER);
		}
		return responseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__ID:
				return getId();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__TIMEOUT:
				return getTimeout();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_METHOD:
				return getRequestMethod();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_URL:
				return getRequestURL();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE:
				return getResponseStatusCode();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER:
				return getRequestParameter();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER:
				return getResponseParameter();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__ID:
				setId((String)newValue);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_METHOD:
				setRequestMethod((String)newValue);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_URL:
				setRequestURL((String)newValue);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE:
				setResponseStatusCode((String)newValue);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER:
				getRequestParameter().clear();
				getRequestParameter().addAll((Collection<? extends RequestParameterImpl>)newValue);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER:
				getResponseParameter().clear();
				getResponseParameter().addAll((Collection<? extends ResponseParameterImpl>)newValue);
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
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_METHOD:
				setRequestMethod(REQUEST_METHOD_EDEFAULT);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_URL:
				setRequestURL(REQUEST_URL_EDEFAULT);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE:
				setResponseStatusCode(RESPONSE_STATUS_CODE_EDEFAULT);
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER:
				getRequestParameter().clear();
				return;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER:
				getResponseParameter().clear();
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
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_METHOD:
				return REQUEST_METHOD_EDEFAULT == null ? requestMethod != null : !REQUEST_METHOD_EDEFAULT.equals(requestMethod);
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_URL:
				return REQUEST_URL_EDEFAULT == null ? requestURL != null : !REQUEST_URL_EDEFAULT.equals(requestURL);
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE:
				return RESPONSE_STATUS_CODE_EDEFAULT == null ? responseStatusCode != null : !RESPONSE_STATUS_CODE_EDEFAULT.equals(responseStatusCode);
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER:
				return requestParameter != null && !requestParameter.isEmpty();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER:
				return responseParameter != null && !responseParameter.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", requestMethod: ");
		result.append(requestMethod);
		result.append(", requestURL: ");
		result.append(requestURL);
		result.append(", responseStatusCode: ");
		result.append(responseStatusCode);
		result.append(')');
		return result.toString();
	}

} //AsyncRequestConfigImpl
