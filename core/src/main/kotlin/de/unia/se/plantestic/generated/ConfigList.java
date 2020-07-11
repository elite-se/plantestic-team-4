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
 *   <li>{@link de.unia.se.plantestic.generated.configmetamodel.ConfigList#getAsyncConfig <em>Async Config</em>}</li>
 * </ul>
 *
 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage#getConfigList()
 * @model
 * @generated
 */
public interface ConfigList extends EObject {
	/**
	 * Returns the value of the '<em><b>Async Config</b></em>' containment reference list.
	 * The list contents are of type {@link de.unia.se.plantestic.generated.configmetamodel.AsyncRequestConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Config</em>' containment reference list.
	 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage#getConfigList_AsyncConfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<AsyncRequestConfig> getAsyncConfig();

} // ConfigList
