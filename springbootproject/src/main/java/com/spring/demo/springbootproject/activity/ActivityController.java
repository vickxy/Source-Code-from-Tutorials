package com.spring.demo.springbootproject.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping("/activities")
	public List<Activity> getAllActivities() {
		return activityService.getAllActivities();
	}
	
	@RequestMapping("/activities/{id}")
	public Activity getActivityByID(@PathVariable int id) {
		return activityService.getActivityByID(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/activity")
	public void addActivity(@RequestBody Activity activity) {
		activityService.addActivity(activity);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/activity/{id}")
	public void updateActivity(@RequestBody Activity activity, @PathVariable int id) {
		activityService.updateActivity(activity, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/activity/{id}")
	public void deleteActivity(@PathVariable int id) {
		activityService.deleteActivity(id);
	}
	
}
