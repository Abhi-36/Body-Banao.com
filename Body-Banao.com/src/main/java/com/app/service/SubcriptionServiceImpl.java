package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.CustomException;
import com.app.pojos.Subscription;
import com.app.repository.SubscriptionRepo;

@Service
@Transactional
public class SubcriptionServiceImpl implements SubscriptionService
{
	@Autowired
	private SubscriptionRepo subrepo;

	@Override
	public List<Subscription> getlistSubscriptions() {
		List<Subscription> subscription=subrepo.findAll();
		return subscription;
	}

	@Override
	public Subscription getSubscription(long id) {
		Subscription subscription=subrepo.findById(id).orElseThrow(()-> new CustomException("id is wrong please enter a correct id"));
		return subscription;
	}

	@Override
	public Subscription addSubscription(Subscription subscription) {
		Subscription subscription1=subrepo.save(subscription);
		return subscription1;
	}

	@Override
	public String deleteSubscription(long id) {
		Subscription subscription=subrepo.findById(id).orElseThrow(()-> new CustomException("please enter a correct id"));
		subrepo.delete(subscription);
		return "subscription is deleted  ";
	}

	@Override
	public Subscription updatesubSubscription(Subscription subscription, long id) {
		Subscription subscription1=subrepo.findById(id).orElseThrow(()-> new CustomException("please enter a correct id"));
		Subscription subscription2=subrepo.save(subscription1);
		return subscription2;
	}

	

}
