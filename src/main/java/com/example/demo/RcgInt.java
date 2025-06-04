package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RcgInt {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		collect.forEach((ele ,count)->{
			if(ele) {
				System.out.println("Even " + count);
			}else {
				System.out.println("Odd " + count);
			}
		});
		System.out.println(collect);
		
		   //spring application in how to improve performace 
		  //how to write the query in jpa for select * from user where city ="mumber" order by salary 
	     //spring security context
		// we have in 100 coloum of data in entity how to filtering this data in spring boot application
		
/*		If your entity has 100 columns, and you want to filter/search based on dynamic fields, it’s best to avoid writing 100+ method signatures manually in your repository.

		Instead, go with dynamic filtering approaches like:

		✅ 1. JpaSpecificationExecutor (Most Recommended)
		🧩 Step 1: Extend JpaSpecificationExecutor
		java
		Copy
		Edit
		public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
		}
		🧠 Step 2: Build Dynamic Filter Logic
		java
		Copy
		Edit
		public class UserSpecification {

		    public static Specification<User> filterByFields(Map<String, Object> filters) {
		        return (root, query, cb) -> {
		            List<Predicate> predicates = new ArrayList<>();

		            filters.forEach((field, value) -> {
		                if (value != null && !value.toString().isEmpty()) {
		                    predicates.add(cb.equal(root.get(field), value));
		                }
		            });

		            return cb.and(predicates.toArray(new Predicate[0]));
		        };
		    }
		}
		🧪 Step 3: Call It From Service
		java
		Copy
		Edit
		public List<User> getFilteredUsers(Map<String, Object> filters) {
		    Specification<User> spec = UserSpecification.filterByFields(filters);
		    return userRepository.findAll(spec);
		}
		✅ 2. Use Spring Data REST + QueryDSL (Optional Advanced)
		You can use QueryDSL for type-safe dynamic queries. It’s powerful but requires codegen (mvn compile generates QUser classes).

		Would you like a code sample with QueryDSL too?

		✅ 3. Controller Example with Map Input
		If you want a generic search endpoint:

		java
		Copy
		Edit
		@PostMapping("/search")
		public ResponseEntity<List<User>> searchUsers(@RequestBody Map<String, Object> filters) {
		    List<User> users = userService.getFilteredUsers(filters);
		    return ResponseEntity.ok(users);
		}
		This lets the frontend send any combination of filter fields, like:

		json
		Copy
		Edit
		{
		  "city": "Mumbai",
		  "department": "HR",
		  "gender": "Female"
		}
		⚠️ Good Practices with Large Entities
		Use DTOs instead of returning the full 100-field entity to the client.

		Consider breaking the entity into modular components or tables if the 100 fields serve different domains (e.g., profile, preferences, settings).

		Use projections (@Query + interface) or @JsonIgnore to avoid sending unnecessary data.*/
		}
	

}
