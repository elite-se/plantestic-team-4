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
 *   <li>{@link configmetamodel.ConfigList#getAsyncConfig <em>Async Config</em>}</li>
 * </ul>
 *
 * @see configmetamodel.ConfigmetamodelPackage#getConfigList()
 * @model
 * @generated
 */
public interface ConfigList extends EObject {
	/**
	 * Returns the value of the '<em><b>Async Config</b></em>' reference list.
	 * The list contents are of type {@link configmetamodel.AsyncRequestConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Config</em>' reference list.
	 * @see configmetamodel.ConfigmetamodelPackage#getConfigList_AsyncConfig()
	 * @model
	 * @generated
	 */
	EList<AsyncRequestConfig> getAsyncConfig();

} // ConfigList
