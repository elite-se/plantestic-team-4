package de.unia.se.plantestic.metamodel;

import java.io.*;
import java.util.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.xmi.impl.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;

public class ConfigMetamodel {

	public static void main(String[] args) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		
		EPackage aPackage = ecoreFactory.createEPackage();
		aPackage.setName("configmetamodel");
		aPackage.setNsPrefix("Configmetamodel");
		aPackage.setNsURI("http://www.example.org/Configmetamodel");
		
		EClass listClass = ecoreFactory.createEClass();
		listClass.setName("ConfigList");
		aPackage.getEClassifiers().add(listClass);
		
		EClass configClass = ecoreFactory.createEClass();
		configClass.setName("AsyncRequestConfig");
		aPackage.getEClassifiers().add(configClass);
		
		EClass requestParameterClass = ecoreFactory.createEClass();
		requestParameterClass.setName("RequestParameter");
		aPackage.getEClassifiers().add(requestParameterClass);
		
		EClass responseParameterClass = ecoreFactory.createEClass();
		responseParameterClass.setName("ResponseParameter");
		aPackage.getEClassifiers().add(responseParameterClass);
		
		EAttribute id = ecoreFactory.createEAttribute();
		id.setName("id");
		id.setEType(ecoreFactory.getEcorePackage().getEString());
		configClass.getEStructuralFeatures().add(id);
		
		EAttribute timeout = ecoreFactory.createEAttribute();
		timeout.setName("timeout");
		timeout.setEType(ecoreFactory.getEcorePackage().getEInt());
		configClass.getEStructuralFeatures().add(timeout);
		
		EAttribute requestMethod = ecoreFactory.createEAttribute();
		requestMethod.setName("requestMethod");
		requestMethod.setEType(ecoreFactory.getEcorePackage().getEString());
		configClass.getEStructuralFeatures().add(requestMethod);
		
		EAttribute requestURL= ecoreFactory.createEAttribute();
		requestURL.setName("requestURL");
		requestURL.setEType(ecoreFactory.getEcorePackage().getEString());
		configClass.getEStructuralFeatures().add(requestURL);
		
		EAttribute responseStatusCode = ecoreFactory.createEAttribute();
		responseStatusCode.setName("responseStatusCode");
		responseStatusCode.setEType(ecoreFactory.getEcorePackage().getEInt());
		configClass.getEStructuralFeatures().add(responseStatusCode);
		
		EAttribute requestVariableName = ecoreFactory.createEAttribute();
		requestVariableName.setName("requestVariableName");
		requestVariableName.setEType(ecoreFactory.getEcorePackage().getEString());
		requestParameterClass.getEStructuralFeatures().add(requestVariableName);
		
		EAttribute requestValue = ecoreFactory.createEAttribute();
		requestValue.setName("value");
		requestValue.setEType(ecoreFactory.getEcorePackage().getEString());
		requestParameterClass.getEStructuralFeatures().add(requestValue);
		
		EAttribute responseVariableName = ecoreFactory.createEAttribute();
		responseVariableName.setName("responseVariableName");
		responseVariableName.setEType(ecoreFactory.getEcorePackage().getEString());
		responseParameterClass.getEStructuralFeatures().add(responseVariableName);
		
		EAttribute xPath = ecoreFactory.createEAttribute();
		xPath.setName("xPath");
		xPath.setEType(ecoreFactory.getEcorePackage().getEString());
		responseParameterClass.getEStructuralFeatures().add(xPath);
		
		
		EReference configReference = ecoreFactory.createEReference();
		configReference.setName("asyncConfig");
		configReference.setEType(configClass);
		configReference.setUpperBound(configReference.UNBOUNDED_MULTIPLICITY);
		listClass.getEStructuralFeatures().add(configReference);
		
		EReference requestParameterReference = ecoreFactory.createEReference();
		requestParameterReference.setName("requestParameter");
		requestParameterReference.setEType(requestParameterClass);
		requestParameterReference.setUpperBound(configReference.UNBOUNDED_MULTIPLICITY);
		configClass.getEStructuralFeatures().add(requestParameterReference);
		
		EReference responseParameterReference = ecoreFactory.createEReference();
		responseParameterReference.setName("responseParameter");
		responseParameterReference.setEType(responseParameterClass);
		responseParameterReference.setUpperBound(configReference.UNBOUNDED_MULTIPLICITY);
		configClass.getEStructuralFeatures().add(responseParameterReference);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI("Configmetamodel.ecore"));
		resource.getContents().add(aPackage);
		
		StringWriter stringWriter = new StringWriter();
		URIConverter.WriteableOutputStream outputStream = new URIConverter.WriteableOutputStream(stringWriter, "UTF-8");
		Map<String, String> options = new HashMap<String, String>();
		try {
			resource.save(outputStream, options);
			
			System.out.println(stringWriter.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
