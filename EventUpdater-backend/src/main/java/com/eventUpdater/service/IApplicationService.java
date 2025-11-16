package com.eventUpdater.service;

import java.util.List;

import com.eventUpdater.sEntity.Application;

public interface IApplicationService {

	public String addApplication(Application application);
	public List<Application> getApplication();
}
