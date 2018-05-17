package com.jersey.friends.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.friends.pojo.Friend;

public class FriendsCollectionService {
FriendDAO dao;
	static HashMap <Integer, Friend> friendsMap = new HashMap<Integer,Friend>();
	public FriendsCollectionService(){
		super();
		Friend f1 = new Friend(1,"Mahendra","chennai");
		Friend f2= new Friend(2,"Rahul","Delhi");
		Friend f3 = new Friend(3,"Prasana","pune");
		Friend f4 = new Friend(4,"Tarun","hyderabad");
		Friend f5 = new Friend (5, "shyam","Kerala");
		friendsMap.put(1, f1);
		friendsMap.put(2, f2);
		friendsMap.put(3, f3);
		friendsMap.put(4,f4);
		friendsMap.put(5,f5);
		
	}
	public List getAllFriends() {
		// TODO Auto-generated method stub
		List friends = new ArrayList(friendsMap.values());
		return friends;
	}
	public Friend getFriendById(int myId) {
		// TODO Auto-generated method stub
		Friend f = friendsMap.get(myId);
		return f;
	}
	public static List<Friend> updatefriend(Friend friend) {
		// TODO Auto-generated method stub
		friendsMap.put(friend.getId(),friend);
		List friends = new ArrayList(friendsMap.values());
		return friends;
	}
	public static List deleteFriend(int myId) {
		// TODO Auto-generated method stub
		friendsMap.remove(myId);
		List friends = new ArrayList(friendsMap.values());
		return friends;
	}
	
}
