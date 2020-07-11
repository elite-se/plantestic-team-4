/**
 */
package de.unia.se.plantestic.generated;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Configmetamodel.ConfigList#getAsyncConfig <em>Async Config</em>}</li>
 *   <li>{@link Configmetamodel.ConfigList#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Configmetamodel.ConfigmetamodelPackage#getConfigList()
 * @model
 * @generated
 */
public interface ConfigList extends EObject {
	/**
	 * Returns the value of the '<em><b>Async Config</b></em>' containment reference list.
	 * The list contents are of type {@link Configmetamodel.AsyncRequestConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Config</em>' containment reference list.
	 * @see Configmetamodel.ConfigmetamodelPackage#getConfigList_AsyncConfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<AsyncRequestConfig> getAsyncConfig();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Configmetamodel.ConfigmetamodelPackage#getConfigList_Name()
	 * @model default="name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Configmetamodel.ConfigList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConfigList
