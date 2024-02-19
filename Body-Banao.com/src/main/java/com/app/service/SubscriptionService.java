package com.app.service;

import java.util.List;
import com.app.pojos.Subscription;

public interface SubscriptionService 
{
	List<Subscription> getlistSubscriptions();
	  Subscription getSubscription(long id);
	  Subscription addSubscription(Subscription subscription);
	  String deleteSubscription(long id);
	  Subscription updatesubSubscription(Subscription subscription,long id);
}
