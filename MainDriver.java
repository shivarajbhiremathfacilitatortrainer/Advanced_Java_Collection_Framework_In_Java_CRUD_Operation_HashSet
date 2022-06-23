package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.hashset_crud_operation.HashSetCrudOperation;

public class MainDriver
{
	static HashSetCrudOperation hashSetCrudOperation = new HashSetCrudOperation();
	public static void main(String[] args)
	{
		hashSetCrudOperation.createTheData();
		
		hashSetCrudOperation.readTheData();
		
		hashSetCrudOperation.updateTheData();
		
		hashSetCrudOperation.deleteTheData();
	}
}