/**
 */
package de.unia.se.plantestic.generated;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage
 * @generated
 */
public interface ConfigmetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigmetamodelFactory eINSTANCE = de.unia.se.plantestic.generated.impl.ConfigmetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Config List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config List</em>'.
	 * @generated
	 */
	ConfigList createConfigList();

	/**
	 * Returns a new object of class '<em>Async Request Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Async Request Config</em>'.
	 * @generated
	 */
	AsyncRequestConfig createAsyncRequestConfig();

	/**
	 * Returns a new object of class '<em>Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Parameter</em>'.
	 * @generated
	 */
	RequestParameter createRequestParameter();

	/**
	 * Returns a new object of class '<em>Response Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Parameter</em>'.
	 * @generated
	 */
	ResponseParameter createResponseParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigmetamodelPackage getConfigmetamodelPackage();

} //ConfigmetamodelFactory
