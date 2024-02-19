package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Subscription;
import com.app.service.SubscriptionService;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController 
{
   @Autowired
   private SubscriptionService subservice;
	
   @PostMapping("/addsubscription")
   public ResponseEntity<Subscription> addsubscriptions(@RequestBody Subscription subscription)
   {
	   return ResponseEntity.ok(subservice.addSubscription(subscription));
   }
   
   @GetMapping("/getsubscription/{id}")
   public ResponseEntity<Subscription> getsubscriptions(@PathVariable long id)
   {
	return ResponseEntity.ok(subservice.getSubscription(id));
	   
   }
   
   @GetMapping("/getsubscriptionlist")
   public ResponseEntity< List<Subscription> > getsubscriptionlist()
   {
		   return ResponseEntity.ok(subservice.getlistSubscriptions());
   }
   
   @DeleteMapping("/deletesubscription/{id}")
   public ResponseEntity<String> deletesubscriptions(@PathVariable long id)
   {
	   return ResponseEntity.ok(subservice.deleteSubscription(id));
   }
   
   @PutMapping("/updatesubscription/{id}")
   public ResponseEntity<Subscription> updatesubscriptions(@RequestBody Subscription subscription,@PathVariable long id)
   {
	   return ResponseEntity.ok(subservice.updatesubSubscription(subscription, id));
   }
   
}
