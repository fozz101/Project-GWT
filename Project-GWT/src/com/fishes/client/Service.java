package com.fishes.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.fishes.client.DateData;
@RemoteServiceRelativePath("service")
public interface Service extends RemoteService {
	
	Login checkLoginData(String username, String password);
	FishTable getFishes();
	InsertFish insertFish(String fishId , String fishName , String fishPrice, String path,String date);
	DeleteFish deleteFish(String fishId);
	UpdateFish updateFish(String fishId , String fishName , String fishPrice, String date);
	CreateUser createUser(String username, String password );
	DateData getDate();

}
