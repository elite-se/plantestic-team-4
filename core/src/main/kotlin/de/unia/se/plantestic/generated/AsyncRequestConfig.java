/**
 */
package de.unia.se.plantestic.generated;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Async Request Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getId <em>Id</em>}</li>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getRequestMethod <em>Request Method</em>}</li>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getRequestURL <em>Request URL</em>}</li>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getResponseStatusCode <em>Response Status Code</em>}</li>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getRequestParameter <em>Request Parameter</em>}</li>
 *   <li>{@link configmetamodel.AsyncRequestConfig#getResponseParameter <em>Response Parameter</em>}</li>
 * </ul>
 *
 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig()
 * @model
 * @generated
 */
public interface AsyncRequestConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link configmetamodel.AsyncRequestConfig#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link configmetamodel.AsyncRequestConfig#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Request Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Method</em>' attribute.
	 * @see #setRequestMethod(String)
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_RequestMethod()
	 * @model
	 * @generated
	 */
	String getRequestMethod();

	/**
	 * Sets the value of the '{@link configmetamodel.AsyncRequestConfig#getRequestMethod <em>Request Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Method</em>' attribute.
	 * @see #getRequestMethod()
	 * @generated
	 */
	void setRequestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request URL</em>' attribute.
	 * @see #setRequestURL(String)
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_RequestURL()
	 * @model
	 * @generated
	 */
	String getRequestURL();

	/**
	 * Sets the value of the '{@link configmetamodel.AsyncRequestConfig#getRequestURL <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request URL</em>' attribute.
	 * @see #getRequestURL()
	 * @generated
	 */
	void setRequestURL(String value);

	/**
	 * Returns the value of the '<em><b>Response Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Status Code</em>' attribute.
	 * @see #setResponseStatusCode(int)
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_ResponseStatusCode()
	 * @model
	 * @generated
	 */
	int getResponseStatusCode();

	/**
	 * Sets the value of the '{@link configmetamodel.AsyncRequestConfig#getResponseStatusCode <em>Response Status Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Status Code</em>' attribute.
	 * @see #getResponseStatusCode()
	 * @generated
	 */
	void setResponseStatusCode(int value);

	/**
	 * Returns the value of the '<em><b>Request Parameter</b></em>' reference list.
	 * The list contents are of type {@link configmetamodel.RequestParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Parameter</em>' reference list.
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_RequestParameter()
	 * @model
	 * @generated
	 */
	EList<RequestParameter> getRequestParameter();

	/**
	 * Returns the value of the '<em><b>Response Parameter</b></em>' reference list.
	 * The list contents are of type {@link configmetamodel.ResponseParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Parameter</em>' reference list.
	 * @see configmetamodel.ConfigmetamodelPackage#getAsyncRequestConfig_ResponseParameter()
	 * @model
	 * @generated
	 */
	EList<ResponseParameter> getResponseParameter();

} // AsyncRequestConfig
