package com.hrithik.DesignPattern.BuilderDesign;

public class MobileBuilder {

	private String brand;
	private String model;
	private String colour;
	private double price;
	private int ram;
	private int memory;
	private String os;
	private double disp_size;
	private int disp_reso;
	private int frontCamera;
	private int rearCamera;
	
	public Mobile getMobile()
	{
		return new Mobile(brand, model, colour, price, ram, memory, os, disp_size, disp_reso, frontCamera, rearCamera);
	}

	public MobileBuilder price(double price) {
		this.price = price;
		return this;
	}

	public MobileBuilder disp_size(double disp_size) {
		this.disp_size = disp_size;
		return this;
	}

	public MobileBuilder model(String model) {
		this.model = model;
		return this;
	}

	public MobileBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}

	public MobileBuilder colour(String colour) {
		this.colour = colour;
		return this;
	}

	public MobileBuilder os(String os) {
		this.os = os;
		return this;
	}

	public MobileBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}

	public MobileBuilder memory(int memory) {
		this.memory = memory;
		return this;
	}

	public MobileBuilder disp_reso(int disp_reso) {
		this.disp_reso = disp_reso;
		return this;
	}

	public MobileBuilder frontCamera(int frontCamera) {
		this.frontCamera = frontCamera;
		return this;
	}

	public MobileBuilder rearCamera(int rearCamera) {
		this.rearCamera = rearCamera;
		return this;
	}
}
