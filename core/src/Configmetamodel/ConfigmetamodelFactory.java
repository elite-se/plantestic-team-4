/**
 */
package Configmetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Configmetamodel.ConfigmetamodelPackage
 * @generated
 */
public interface ConfigmetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigmetamodelFactory eINSTANCE = Configmetamodel.impl.ConfigmetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Config List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config List</em>'.
	 * @generated
	 */
	ConfigListImpl createConfigList();

	/**
	 * Returns a new object of class '<em>Async Request Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Async Request Config</em>'.
	 * @generated
	 */
	AsyncRequestConfigImpl createAsyncRequestConfig();

	/**
	 * Returns a new object of class '<em>Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Parameter</em>'.
	 * @generated
	 */
	RequestParameterImpl createRequestParameter();

	/**
	 * Returns a new object of class '<em>Response Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Parameter</em>'.
	 * @generated
	 */
	ResponseParameterImpl createResponseParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigmetamodelPackage getConfigmetamodelPackage();

} //ConfigmetamodelFactory
