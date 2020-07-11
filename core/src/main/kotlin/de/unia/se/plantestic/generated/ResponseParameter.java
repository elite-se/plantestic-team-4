/**
 */
package de.unia.se.plantestic.generated;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link configmetamodel.ResponseParameter#getResponseVariableName <em>Response Variable Name</em>}</li>
 *   <li>{@link configmetamodel.ResponseParameter#getXPath <em>XPath</em>}</li>
 * </ul>
 *
 * @see configmetamodel.ConfigmetamodelPackage#getResponseParameter()
 * @model
 * @generated
 */
public interface ResponseParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Variable Name</em>' attribute.
	 * @see #setResponseVariableName(String)
	 * @see configmetamodel.ConfigmetamodelPackage#getResponseParameter_ResponseVariableName()
	 * @model
	 * @generated
	 */
	String getResponseVariableName();

	/**
	 * Sets the value of the '{@link configmetamodel.ResponseParameter#getResponseVariableName <em>Response Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Variable Name</em>' attribute.
	 * @see #getResponseVariableName()
	 * @generated
	 */
	void setResponseVariableName(String value);

	/**
	 * Returns the value of the '<em><b>XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPath</em>' attribute.
	 * @see #setXPath(String)
	 * @see configmetamodel.ConfigmetamodelPackage#getResponseParameter_XPath()
	 * @model
	 * @generated
	 */
	String getXPath();

	/**
	 * Sets the value of the '{@link configmetamodel.ResponseParameter#getXPath <em>XPath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath</em>' attribute.
	 * @see #getXPath()
	 * @generated
	 */
	void setXPath(String value);

} // ResponseParameter
