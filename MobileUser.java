package com.balu;


	interface Sim{
		String dailCall(long mobileNo);
		String sendSms(long mobileNo, String msg);
	}
	class Airtel implements Sim{
		public String dailCall(long mobileNo) {
			return "Airtel no busy, try again later";
		}
		public String sendSms(long mobileNo, String msg) {
			return "Airtel message sent..";
		}
	}
	
	class Vi implements Sim{
		public String dailCall(long mobileNo) {
			return "Vi no busy, plz try again later";
		}
		public String sendSms(long mobileNo, String msg) {
			return "Vi message sent..";
		}
	}
	class Mobile{
		private Sim s;
		public void insertSim(Sim s) {
			this.s=s;
		}
		public String dialCall(long mobileNo){
			return s.dailCall(mobileNo);
		}
		public String sendSms(long mobileNo, String msg){
			return s.sendSms(mobileNo, msg);
		}
	}
	public class MobileUser {
	public static void main(String[] args) {
		Mobile iphone =new Mobile();
		iphone.insertSim(new Vi());
		String res=iphone.dialCall(165224);
		System.out.println(res);
		System.out.println(iphone.sendSms(16252,"msg"));
		}
}