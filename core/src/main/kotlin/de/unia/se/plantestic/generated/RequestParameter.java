/**
 */
package de.unia.se.plantestic.generated;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unia.se.plantestic.generated.configmetamodel.RequestParameter#getRequestVariableName <em>Request Variable Name</em>}</li>
 *   <li>{@link de.unia.se.plantestic.generated.configmetamodel.RequestParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage#getRequestParameter()
 * @model
 * @generated
 */
public interface RequestParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Variable Name</em>' attribute.
	 * @see #setRequestVariableName(String)
	 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage#getRequestParameter_RequestVariableName()
	 * @model
	 * @generated
	 */
	String getRequestVariableName();

	/**
	 * Sets the value of the '{@link de.unia.se.plantestic.generated.configmetamodel.RequestParameter#getRequestVariableName <em>Request Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Variable Name</em>' attribute.
	 * @see #getRequestVariableName()
	 * @generated
	 */
	void setRequestVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage#getRequestParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.unia.se.plantestic.generated.configmetamodel.RequestParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // RequestParameter
