package com.hrithik.DesignPattern.BuilderDesign;

public class Mobile {

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

	public Mobile(String brand, String model, String colour, double price, int ram, int memory, String os,
			double disp_size, int disp_reso, int frontCamera, int rearCamera) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.ram = ram;
		this.memory = memory;
		this.os = os;
		this.disp_size = disp_size;
		this.disp_reso = disp_reso;
		this.frontCamera = frontCamera;
		this.rearCamera = rearCamera;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", colour=" + colour + ", price=" + price + ", ram="
				+ ram + ", memory=" + memory + ", os=" + os + ", disp_size=" + disp_size + ", disp_reso=" + disp_reso
				+ ", frontCamera=" + frontCamera + ", rearCamera=" + rearCamera + "]";
	}

}
