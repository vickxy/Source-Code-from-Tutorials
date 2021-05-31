package com.spring.demo.springbootproject.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ActivityService {
	private List<Activity> activities = new ArrayList<>( Arrays.asList(
			new Activity(1, "java", "java description"), 
			new Activity(2, "python", "python description")
			));

	public List<Activity> getAllActivities(){
		return activities;
	}

	public Activity getActivityByID(int id) {
		return activities.stream().filter(a -> a.getId() == id).findFirst().get();
	}

	public void addActivity(Activity activity) {
		activities.add(activity);
	}
	
	public void updateActivity(Activity activity, int id) {
		for(int i=0; i <activities.size(); i++) {
			Activity a = activities.get(i);
			if(a.getId() == id) {
				activities.set(i, activity);
				return;
			}
		}
	}
	
	public void deleteActivity(int id) {
		activities.removeIf(a -> a.getId() == id);
	}
	
	
}
