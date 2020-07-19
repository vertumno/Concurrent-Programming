package com.vertumno.list.synchronization;

public class InsertList extends Thread {
	private SharedList sharedList;
	
	public InsertList(String threadName, SharedList sharedList) {
		super(threadName);
		this.sharedList = sharedList;
	}
	
	@Override
	public void run() {
		sharedList.insert(1);
	}
}
